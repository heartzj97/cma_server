package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.IntermediateChecksPlanMapper;
import com.cma.pojo.IntermediateChecksPlan;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class IntermediateChecksPlanService {

	@Autowired
	IntermediateChecksPlanMapper intermediateChecksPlanMapper;
	
	public List<IntermediateChecksPlan> getAll() {
		List<IntermediateChecksPlan> data = intermediateChecksPlanMapper.selectAll();
		return data;
	}

	public IntermediateChecksPlan getOne(Long value) {
		IntermediateChecksPlan intermediateChecksPlan = intermediateChecksPlanMapper.selectByPrimaryKey(value);
		return intermediateChecksPlan;
	}

	public int addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		IntermediateChecksPlan intermediateChecksPlan = objectMapper.convertValue(params, IntermediateChecksPlan.class);
		if(intermediateChecksPlan.getState()!=null) {
			return 0;
		}
		return intermediateChecksPlanMapper.insertSelective(intermediateChecksPlan);
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		IntermediateChecksPlan intermediateChecksPlan = objectMapper.convertValue(params, IntermediateChecksPlan.class);
		return intermediateChecksPlanMapper.updateByPrimaryKeySelective(intermediateChecksPlan);
	}

	public int deleteOne(Long value) {
		return intermediateChecksPlanMapper.deleteByPrimaryKey(value);		
	}
}
