package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.AllAnnualPlanMapper;
import com.cma.dao.AnnualTrainingPlanMapper;
import com.cma.pojo.AllAnnualPlan;
import com.cma.pojo.AllAnnualPlanExample;
import com.cma.pojo.AnnualTrainingPlan;
import com.cma.pojo.AnnualTrainingPlanExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AnnualTrainingPlanService {

	@Autowired
	AnnualTrainingPlanMapper annualTrainingPlanMapper;
	
	@Autowired
	AllAnnualPlanMapper allAnnualPlanMapper;
	
	//2.1
	public List<AnnualTrainingPlan> getAll(Long year) {
		AnnualTrainingPlanExample annualTrainingPlanExample = new AnnualTrainingPlanExample();
		AnnualTrainingPlanExample.Criteria criteria = annualTrainingPlanExample.createCriteria();
		criteria.andYearEqualTo(year);
		
		List<AnnualTrainingPlan> res = annualTrainingPlanMapper.selectByExample(annualTrainingPlanExample);
		return res;
	}
	
	//2.2
	public AnnualTrainingPlan getOne(Long planId) {
		AnnualTrainingPlanExample annualTrainingPlanExample = new AnnualTrainingPlanExample();
		AnnualTrainingPlanExample.Criteria criteria = annualTrainingPlanExample.createCriteria();
		criteria.andPlanIdEqualTo(planId);
		
		AnnualTrainingPlan annualTrainingPlan = annualTrainingPlanMapper.selectOneByExample(annualTrainingPlanExample);
		return annualTrainingPlan;
	}
	
	//2.3
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		AnnualTrainingPlan annualTrainingPlan = objectMapper.convertValue(params, AnnualTrainingPlan.class);
		annualTrainingPlanMapper.insert(annualTrainingPlan);
	}
	
	//2.4
	public void modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		AnnualTrainingPlan annualTrainingPlan = objectMapper.convertValue(params, AnnualTrainingPlan.class);
		annualTrainingPlanMapper.updateByPrimaryKeySelective(annualTrainingPlan);
	}
	
	//2.5
	public void deleteOne(Long planId) {
		AnnualTrainingPlanExample annualTrainingPlanExample = new AnnualTrainingPlanExample();
		AnnualTrainingPlanExample.Criteria criteria = annualTrainingPlanExample.createCriteria();
		criteria.andPlanIdEqualTo(planId);
		
		annualTrainingPlanMapper.deleteByExample(annualTrainingPlanExample);
	}
	
	//2.6
	public void addAnnualPlan(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		AllAnnualPlan allAnnualPlan = objectMapper.convertValue(params, AllAnnualPlan.class);
		
		allAnnualPlanMapper.insertSelective(allAnnualPlan);
	}
	
	//2.7
	public void approveAnnualPlan(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		AllAnnualPlan allAnnualPlan = objectMapper.convertValue(params, AllAnnualPlan.class);
		
		allAnnualPlanMapper.updateByPrimaryKeySelective(allAnnualPlan);
	}
	
	//2.8
	public AllAnnualPlan getAnnualPlan(Long value) {
		AllAnnualPlanExample allAnnualPlanExample = new AllAnnualPlanExample();
		AllAnnualPlanExample.Criteria criteria = allAnnualPlanExample.createCriteria();
		criteria.andYearEqualTo(value);
		
		return allAnnualPlanMapper.selectOneByExample(allAnnualPlanExample);
	}
	
	//2.9
	public List<AllAnnualPlan> getAllAnnualPlan() {
		
		return allAnnualPlanMapper.selectAll();
	}
}
