package com.cma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffAuthorizationMapper;
import com.cma.pojo.StaffAuthorizationExample;
import com.cma.pojo.StaffAuthorizationExample.Criteria;

@Service
public class StaffAuthorizationService {
	
	@Autowired
	StaffAuthorizationMapper staffAuthorizationMapper;
	
	public void deleteOne(Long value) {
		StaffAuthorizationExample staffAuthorizationExample = new StaffAuthorizationExample();
		Criteria criteria = staffAuthorizationExample.createCriteria();
		criteria.andAuthorizationIdEqualTo(value);
		staffAuthorizationMapper.deleteByExample(staffAuthorizationExample);
	}
}
