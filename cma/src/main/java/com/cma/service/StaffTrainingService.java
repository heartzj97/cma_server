package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffTrainingMapper;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingExample;
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
	
	//4.1
	public List<StaffTraining> getAll() {
		List<StaffTraining> staffTrainingInformation = staffTrainingMapper.selectAll();
		return staffTrainingInformation;
	}
	
	//4.3
	public List<StaffTrainingResult> getAllByStaff(Long userId) {
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingResultMapper.findStaffTrainingResultByUserId(userId);
		return staffTrainingResultList;
	}
	//4.5
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
	
	//4.7
	public void addTrainingResult(Map<String,String> params) {
		Long id = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTrainingResult staffTrainingResult = objectMapper.convertValue(params, StaffTrainingResult.class);
		staffTrainingResult.setUserId(id);
		staffTrainingResultMapper.insertSelective(staffTrainingResult);
	}
	//4.8
	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTraining staffTraining = objectMapper.convertValue(params, StaffTraining.class);
		staffTrainingMapper.updateByPrimaryKeySelective(staffTraining);
		return 1;
	}
	
	//4.10
	public void deleteOne(Long trainingId) {
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		StaffTrainingExample.Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		staffTrainingMapper.deleteByExample(staffTrainingExample);
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
