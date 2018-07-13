package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.SupervisionRecordMapper;
import com.cma.dao.example.SupervisionRecordExample;
import com.cma.pojo.SupervisionRecord;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SupervisionRecordService {
	
	@Autowired
	SupervisionRecordMapper supervisionRecordMapper;
	
	//3.1
	public List<Map<String, Object>> getAll(Long planId) {
		SupervisionRecordExample supervisionRecordExample = new SupervisionRecordExample();
		SupervisionRecordExample.Criteria criteria = supervisionRecordExample.createCriteria();
		criteria.andPlanIdEqualTo(planId);
		List<SupervisionRecord> supervisionRecordList = supervisionRecordMapper.selectByExample(supervisionRecordExample);
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		Iterator<SupervisionRecord> iter = supervisionRecordList.iterator();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		while(iter.hasNext()) {
			Map<String, Object> res = new HashMap<String, Object>();
			SupervisionRecord supervisionRecord = iter.next();
			res.put("recordId",supervisionRecord.getRecordId());
			res.put("planId",supervisionRecord.getPlanId());
			res.put("department",supervisionRecord.getDepartment());
			res.put("supervisor",supervisionRecord.getSupervisor());
			res.put("superviseDate",sdf.format(supervisionRecord.getSuperviseDate()));
			res.put("supervisedPerson",supervisionRecord.getSupervisedPerson());
			res.put("record",supervisionRecord.getRecord());
			res.put("conclusion",supervisionRecord.getConclusion());
			res.put("operator",supervisionRecord.getOperator());
			//res.put("trainingDate", sdf.format(staffTraining.getTrainingDate()));
			res.put("recordDate",sdf.format(supervisionRecord.getRecordDate()));
			resList.add(res);
		}
		return resList;
	}

	//3.2
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		SupervisionRecord supervisionRecord = objectMapper.convertValue(params, SupervisionRecord.class);
		supervisionRecordMapper.insertSelective(supervisionRecord);
	}
	
	//3.3
	public void modifyOne(Map<String, String> params) {
		Long recordId = Long.parseLong(params.get("recordId"));
		params.remove("recordId");
		ObjectMapper objectMapper = new ObjectMapper();
		SupervisionRecord supervisionRecord = objectMapper.convertValue(params, SupervisionRecord.class);
		supervisionRecord.setRecordId(recordId);
		supervisionRecordMapper.updateByPrimaryKeySelective(supervisionRecord);
	}
	
	//2.4
	public void deleteOne(Long value) {
		SupervisionRecordExample supervisionRecordExample = new SupervisionRecordExample();
		SupervisionRecordExample.Criteria criteria = supervisionRecordExample.createCriteria();
		criteria.andRecordIdEqualTo(value);
		supervisionRecordMapper.deleteByExample(supervisionRecordExample);
	}
}
