package com.cma.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffTrainingMapper;
import com.cma.mapper.StaffTrainingResultMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingExample;
import com.cma.pojo.StaffTrainingResult;
import com.cma.pojo.StaffTrainingResultExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffTrainingService {
	@Autowired
	private StaffTrainingMapper staffTrainingMapper;
	
	@Autowired
	private StaffTrainingResultMapper staffTrainingResultMapper;
	
	@Autowired
	private StaffManagementService staffManagementService;
	
	//4.1
	public List<StaffTraining> getAll() {
		List<StaffTraining> staffTrainingInformation = staffTrainingMapper.selectAll();
		return staffTrainingInformation;
	}
	
	//4.2
	public List<Map<String, Object>> getTrainingPeople(Long trainingId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingResultMapper.selectByExample(staffTrainingResultExample);
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		Iterator<StaffTrainingResult> iter = staffTrainingResultList.iterator();
		while(iter.hasNext()) {
			Staff staff = staffManagementService.queryById(iter.next().getUserId());
			res.put("name", staff.getName());
			res.put("id", staff.getId());
			resList.add(res);
			res = new HashMap<String, Object>();
		}
		return resList;
	}
	
	//4.3
	public List<Map<String, Object>> getAllByStaff(Long userId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingResultMapper.selectByExample(staffTrainingResultExample);
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		Iterator<StaffTrainingResult> iter = staffTrainingResultList.iterator();
		while(iter.hasNext()) {
			StaffTraining staffTraining = staffTrainingMapper.selectByPrimaryKey(iter.next().getTrainingId());
			res.put("trainingId", staffTraining.getTrainingId());
			res.put("program", staffTraining.getProgram());
			res.put("trainingDate", staffTraining.getTrainingDate());
			res.put("place", staffTraining.getPlace());
			res.put("presenter", staffTraining.getPresenter());
			res.put("content", staffTraining.getContent());
			res.put("note", staffTraining.getNote());
			resList.add(res);
			res = new HashMap<String, Object>();
			
		}
		return resList;
	}
	
	//4.4
	public Map<String, Object> getOne(Long id, Long trainingId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andIdEqualTo(id);
		criteria.andTrainingIdEqualTo(trainingId);
		StaffTrainingResult staffTrainingResult = staffTrainingResultMapper.selectOneByExample(staffTrainingResultExample);
		//StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		StaffTraining staffTraining = staffTrainingMapper.selectByPrimaryKey(trainingId);
		res.put("trainingId", trainingId);
		res.put("program", staffTraining.getProgram());
		res.put("result", staffTrainingResult.getResult());
		res.put("note", staffTrainingResult.getNote());
		return res;
	}
	
	//4.5
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTraining staffTraining = objectMapper.convertValue(params, StaffTraining.class);
		staffTrainingMapper.insertSelective(staffTraining);
	}
	
	//4.6
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int addTrainingPeople(Map<String, Object> params) {
		Long trainingId = ((Integer)params.get("trainingId")).longValue();		
		ArrayList<LinkedHashMap> param =  (ArrayList<LinkedHashMap>) params.get("data");
		List<StaffTrainingResult> res = new ArrayList<StaffTrainingResult>();
		for (LinkedHashMap map : param) {
			StaffTrainingResult result = new StaffTrainingResult();
			result.setTrainingId(trainingId);
			result.setUserId(((Integer)map.get("id")).longValue());
			res.add(result);
		}
		staffTrainingResultMapper.insertList(res);
		return 1;
	}
	
	//4.7
	public void addTrainingResult(Map<String,String> params) {
		Long id = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTrainingResult staffTrainingResult = objectMapper.convertValue(params, StaffTrainingResult.class);
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		criteria.andTrainingIdEqualTo(staffTrainingResult.getTrainingId());
		staffTrainingResult.setUserId(id);
		staffTrainingResultMapper.updateByExampleSelective(staffTrainingResult, staffTrainingResultExample);
	}
	//4.8
	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTraining staffTraining = objectMapper.convertValue(params, StaffTraining.class);
		staffTrainingMapper.updateByPrimaryKeySelective(staffTraining);
		return 1;
	}
	//4.9
	public Boolean modifyResult(Long id, Long trainingId, String result) {
		StaffTrainingResult res = new StaffTrainingResult();
		res.setId(id);
		res.setTrainingId(trainingId);
		res.setResult(result);
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andIdEqualTo(id);
		criteria.andTrainingIdEqualTo(trainingId);
		staffTrainingResultMapper.updateByExampleSelective(res, staffTrainingResultExample);
		return true;
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
