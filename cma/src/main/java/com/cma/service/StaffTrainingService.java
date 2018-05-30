package com.cma.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffTrainingMapper;
import com.cma.pojo.StaffTraining;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffTrainingService {
	@Autowired
	private StaffTrainingMapper staffTrainingMapper;
	
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTraining staffTraining = objectMapper.convertValue(params, StaffTraining.class);
		staffTrainingMapper.insertSelective(staffTraining);
	}
}
