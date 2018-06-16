package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.TrainingApplicationMapper;
import com.cma.pojo.TrainingApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TrainingApplicationService {
	
	@Autowired
	TrainingApplicationMapper trainingApplicationMapper;

	public List<TrainingApplication> getAll() {
		List<TrainingApplication> data = trainingApplicationMapper.selectAll();
		return data;
	}

	public TrainingApplication getOne(Long value) {
		TrainingApplication trainingApplication = trainingApplicationMapper.selectByPrimaryKey(value);
		return trainingApplication;
	}

	public int addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		TrainingApplication trainingApplication = objectMapper.convertValue(params, TrainingApplication.class);
		return trainingApplicationMapper.insertSelective(trainingApplication);
	}

	public void modifyOne(Map<String, String> params) {
		Long value = Long.parseLong(params.get("id"));
		ObjectMapper objectMapper = new ObjectMapper();
		TrainingApplication trainingApplication = objectMapper.convertValue(params,TrainingApplication.class);
		trainingApplication.setSituation((byte) 0);
		trainingApplicationMapper.updateByPrimaryKeySelective(trainingApplication);
		TrainingApplication temp = trainingApplicationMapper.selectByPrimaryKey(value);
		temp.setApproveDate(null);
		temp.setApprover(null);
		trainingApplicationMapper.updateByPrimaryKey(temp);
	}

	public void deleteOne(Long value) {
		trainingApplicationMapper.deleteByPrimaryKey(value);		
	}

	public void approveOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		TrainingApplication trainingApplication = objectMapper.convertValue(params,TrainingApplication.class);
		//trainingApplication.setSituation((byte) 2);
		trainingApplicationMapper.updateByPrimaryKeySelective(trainingApplication);
	}

}
