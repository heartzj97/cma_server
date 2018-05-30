package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffTrainingMapper;
import com.cma.pojo.StaffTraining;
import com.cma.mapper.StaffTrainingResultMapper;
import com.cma.pojo.StaffTrainingResult;
import com.cma.pojo.StaffTrainingResultExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffTrainingService {
	@Autowired
	private StaffTrainingMapper staffTrainingMapper;
	
	@Autowired
	private StaffTrainingResultMapper staffTrainingResultMapper;
	
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTraining staffTraining = objectMapper.convertValue(params, StaffTraining.class);
		staffTrainingMapper.insertSelective(staffTraining);
	}
	
	//4.6
	public int addTrainingPeople(Map<String, String> params) {
		Long trainingId = Long.parseLong((String) params.get("trainingId"));
		Map<String,Object> map = (Map<String, Object>) ((Object)params.get("data"));
		List<Long> list = (List<Long>) map.get("id");
		for (int i = 0; i < list.size(); i++) {
			StaffTrainingResult staffTrainingResult = new StaffTrainingResult();
			staffTrainingResult.setUserId(list.get(i));
			staffTrainingResult.setTrainingId(trainingId);
			staffTrainingResultMapper.insertSelective(staffTrainingResult);
		}
		return 1;
	}
	
	//4.8
	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTraining staffTraining = objectMapper.convertValue(params, StaffTraining.class);
		staffTrainingMapper.updateByPrimaryKeySelective(staffTraining);
		return 1;
	}
	
	//4.11
	public int deleteTrainingPeople(Map<String,String> params) {
		Long id = Long.parseLong(params.get("id"));
		Long trainingId = Long.parseLong(params.get("trainingId"));
		
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		criteria.andUserIdEqualTo(id);
		staffTrainingResultMapper.deleteByExample(staffTrainingResultExample);
		return 1;
	}
}
