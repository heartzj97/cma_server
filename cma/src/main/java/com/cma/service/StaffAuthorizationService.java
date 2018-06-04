package com.cma.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffAuthorizationMapper;
import com.cma.mapper.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffAuthorization;
import com.cma.pojo.StaffAuthorizationExample;
import com.cma.pojo.StaffAuthorizationExample.Criteria;

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
			Staff authorizer = staffMapper.selectByPrimaryKey(authorization.getAuthorizationId());
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
			record.put("authorizerDate", authorization.getAuthorizerDate());
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
			Staff authorizer = staffMapper.selectByPrimaryKey(authorization.getAuthorizationId());
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
			record.put("authorizerDate", authorization.getAuthorizerDate());
			res.add(record);
		}
		
		return res;
	}
	
	//6.3
	public Map<String, Object> getOne(Long authorizationId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffAuthorization authorization = staffAuthorizationMapper.selectByPrimaryKey(authorizationId);					
		Staff authorizer = staffMapper.selectByPrimaryKey(authorization.getAuthorizationId());
		Staff user = staffMapper.selectByPrimaryKey(authorization.getUserId());
		res.put("id", authorization.getUserId());
		res.put("name", user.getName());
		res.put("department", user.getDepartment());
		res.put("position", user.getPosition());
		res.put("authorizationId", authorization.getAuthorizationId());
		res.put("authorizerId", authorizer.getId());
		res.put("authorizerName", authorizer.getName());
		res.put("content", authorization.getContent());
		res.put("authorizerDate", authorization.getAuthorizerDate());
		return res;
	}
	
	public void deleteOne(Long value) {
		StaffAuthorizationExample staffAuthorizationExample = new StaffAuthorizationExample();
		Criteria criteria = staffAuthorizationExample.createCriteria();
		criteria.andAuthorizationIdEqualTo(value);
		staffAuthorizationMapper.deleteByExample(staffAuthorizationExample);
	}
}