package com.cma.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffAuthorizationMapper;
import com.cma.pojo.StaffAuthorization;
import com.cma.pojo.StaffAuthorizationExample;
import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileExample;
import com.cma.pojo.StaffAuthorizationExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffAuthorizationService {
	
	@Autowired
	StaffAuthorizationMapper staffAuthorizationMapper;
	
	//6.4
	public Boolean addOne(Map<String, String> params) {
		Long id = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffAuthorization staffAuthorization = objectMapper.convertValue(params, StaffAuthorization.class);		
		staffAuthorization.setUserId(id);
		if (staffAuthorization.getAuthorizerId()==null) {
			return false;
		}
		else {
			staffAuthorizationMapper.insertSelective(staffAuthorization);
			return true;
		}	
	}
	
	public void deleteOne(Long value) {
		StaffAuthorizationExample staffAuthorizationExample = new StaffAuthorizationExample();
		Criteria criteria = staffAuthorizationExample.createCriteria();
		criteria.andAuthorizationIdEqualTo(value);
		staffAuthorizationMapper.deleteByExample(staffAuthorizationExample);
	}
	
	//6.6
	public Boolean modifyOne(Map<String, String> params) {
		Long authorizationId = Long.parseLong(params.get("authorizationId"));
		params.remove("authorizationId");
		Long id = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffAuthorization staffAuthorization = objectMapper.convertValue(params, StaffAuthorization.class);
		staffAuthorization.setUserId(id);
		StaffAuthorizationExample staffAuthorizationExample = new StaffAuthorizationExample();
		Criteria criteria = staffAuthorizationExample.createCriteria();
		criteria.andAuthorizationIdEqualTo(authorizationId);
		staffAuthorizationMapper.updateByExampleSelective(staffAuthorization, staffAuthorizationExample);
		return true;
	}
}
