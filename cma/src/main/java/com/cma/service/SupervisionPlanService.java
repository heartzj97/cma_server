package com.cma.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.SupervisionPlanMapper;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.SupervisionPlan;
import com.cma.pojo.SupervisionPlanExample;
import com.cma.pojo.SupervisionPlanExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SupervisionPlanService {

	@Autowired
	SupervisionPlanMapper supervisionPlanMapper;
	
	//2.1
	public List<Map<String, Object>> getAll(Long value) {
		SupervisionPlanExample supervisionPlanExample = new SupervisionPlanExample();
		Criteria criteria1 = supervisionPlanExample.createCriteria();
		criteria1.andSuperviseIdEqualTo(value);
		List<SupervisionPlan> list = supervisionPlanMapper.selectByExample(supervisionPlanExample);
		
		List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
		
		for (int i = 0; i < list.size();i++) {
			SupervisionPlan supervisionPlan = list.get(i);
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("planId",supervisionPlan.getPlanId() );
			data.put("id", supervisionPlan.getSuperviseId());
			data.put("content", supervisionPlan.getContent());
			data.put("object", supervisionPlan.getObject());
			data.put("dateFrequency", supervisionPlan.getDateFrequency());
			res.add(data);
		}
		
		return res;
	}
	
	//2.2
	public void addOne(Map<String, String> params) {
		Long supervisionId = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		SupervisionPlan supervisionPlan = objectMapper.convertValue(params, SupervisionPlan.class);
		supervisionPlan.setSuperviseId(supervisionId);
		supervisionPlanMapper.insertSelective(supervisionPlan);
	}
	
	//2.3
	public void modifyOne(Map<String, String> params) {
		Long planId = Long.parseLong(params.get("planId"));
		params.remove("planId");
		ObjectMapper objectMapper = new ObjectMapper();
		SupervisionPlan supervisionPlan = objectMapper.convertValue(params, SupervisionPlan.class);
		supervisionPlan.setPlanId(planId);
		supervisionPlanMapper.updateByPrimaryKeySelective(supervisionPlan);
	}
	
	//2.4
	public void deleteOne(Long value) {
		SupervisionPlanExample supervisionPlanExample = new SupervisionPlanExample();
		Criteria criteria1 = supervisionPlanExample.createCriteria();
		criteria1.andPlanIdEqualTo(value);
		supervisionPlanMapper.deleteByExample(supervisionPlanExample);
	}
}
