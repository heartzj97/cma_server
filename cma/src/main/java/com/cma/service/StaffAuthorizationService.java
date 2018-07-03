package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.StaffAuthorizationMapper;
import com.cma.dao.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffAuthorization;
import com.cma.pojo.StaffAuthorizationExample;
import com.cma.pojo.StaffAuthorizationExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffAuthorizationService {
	
	@Autowired
	StaffMapper staffMapper;
	
	@Autowired
	StaffAuthorizationMapper staffAuthorizationMapper;
	
	//6.1
	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
		List<StaffAuthorization> authorizations = staffAuthorizationMapper.selectAll();
		for (StaffAuthorization authorization : authorizations) {
			Staff authorizer = staffMapper.selectByPrimaryKey(authorization.getAuthorizerId());
			Staff user = staffMapper.selectByPrimaryKey(authorization.getUserId());
			Map<String, Object> record = new HashMap<String, Object>();
			record.put("id", authorization.getUserId());
			record.put("name", user.getName());
			record.put("department", user.getDepartment());
			record.put("position", user.getPosition());
			record.put("authorizationId", authorization.getAuthorizationId());
			record.put("authorizerId", authorizer.getId());
			record.put("authorizerName", authorizer.getName());
			record.put("content", authorization.getContent());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			record.put("authorizerDate", sdf.format(authorization.getAuthorizerDate()));
			res.add(record);
		}
		
		return res;
	}
	
	//6.2
	public List<Map<String, Object>> getAllByStaff(Long id) {
		List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
		StaffAuthorizationExample staffAuthorizationExample = new StaffAuthorizationExample();
		Criteria criteria = staffAuthorizationExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		List<StaffAuthorization> authorizations = staffAuthorizationMapper.selectByExample(staffAuthorizationExample);					
		for (StaffAuthorization authorization : authorizations) {
			Staff authorizer = staffMapper.selectByPrimaryKey(authorization.getAuthorizerId());
			Staff user = staffMapper.selectByPrimaryKey(authorization.getUserId());
			Map<String, Object> record = new HashMap<String, Object>();
			record.put("id", authorization.getUserId());
			record.put("name", user.getName());
			record.put("department", user.getDepartment());
			record.put("position", user.getPosition());
			record.put("authorizationId", authorization.getAuthorizationId());
			record.put("authorizerId", authorizer.getId());
			record.put("authorizerName", authorizer.getName());
			record.put("content", authorization.getContent());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			record.put("authorizerDate", sdf.format(authorization.getAuthorizerDate()));
			res.add(record);
		}
		
		return res;
	}
	
	//6.3
	public Map<String, Object> getOne(Long authorizationId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffAuthorization authorization = staffAuthorizationMapper.selectByPrimaryKey(authorizationId);					
		Staff authorizer = staffMapper.selectByPrimaryKey(authorization.getAuthorizerId());
		Staff user = staffMapper.selectByPrimaryKey(authorization.getUserId());
		res.put("id", authorization.getUserId());
		res.put("name", user.getName());
		res.put("department", user.getDepartment());
		res.put("position", user.getPosition());
		res.put("authorizationId", authorization.getAuthorizationId());
		res.put("authorizerId", authorizer.getId());
		res.put("authorizerName", authorizer.getName());
		res.put("content", authorization.getContent());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		res.put("authorizerDate", sdf.format(authorization.getAuthorizerDate()));
		return res;
	}
	
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
