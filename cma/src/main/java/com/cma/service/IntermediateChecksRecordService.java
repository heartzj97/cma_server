package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.IntermediateChecksRecordMapper;
import com.cma.pojo.IntermediateChecksRecord;
import com.cma.pojo.IntermediateChecksRecordExample;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingResult;
import com.cma.pojo.StaffTrainingResultExample;
//import com.cma.pojo.SupervisionRecordExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.cma.mapper.SupervisionRecordMapper;
//import com.cma.pojo.SupervisionPlan;
//import com.cma.pojo.SupervisionPlanExample;
//import com.cma.pojo.SupervisionRecord;
//import com.cma.pojo.SupervisionRecordExample;

@Service
public class IntermediateChecksRecordService {
	
	@Autowired
	IntermediateChecksRecordMapper intermediateChecksRecordMapper;
	
	//2.1
	public List<IntermediateChecksRecord> getAll() {
		List<IntermediateChecksRecord> list = intermediateChecksRecordMapper.selectAll();
		return list;
	}
	
	//2.2
	public Map<String, Object> getOneByRecordId(Long recordId) {
		Map<String, Object> res = new HashMap<String, Object>();
		IntermediateChecksRecordExample intermediateChecksRecordExample = new IntermediateChecksRecordExample();
		IntermediateChecksRecordExample.Criteria criteria = intermediateChecksRecordExample.createCriteria();
		criteria.andRecordIdEqualTo(recordId);
		IntermediateChecksRecord intermediateChecksRecord = intermediateChecksRecordMapper.selectOneByExample(intermediateChecksRecordExample);
		res.put("recordId", recordId);
		res.put("planId", intermediateChecksRecord.getPlanId());
		res.put("object", intermediateChecksRecord.getObject());
		res.put("checkDate", intermediateChecksRecord.getCheckDate());
		res.put("processRecord", intermediateChecksRecord.getProcessRecord());
		res.put("processRecordPerson", intermediateChecksRecord.getProcessRecordPerson());
		res.put("processRecordDate", intermediateChecksRecord.getProcessRecordDate());
		res.put("resultRecord", intermediateChecksRecord.getResultRecord());
		res.put("resultRecordPerson", intermediateChecksRecord.getResultRecordPerson());
		res.put("resultRecordDate", intermediateChecksRecord.getResultRecordDate());
		res.put("note", intermediateChecksRecord.getNote());
		return res;
	}
	
	/*public List<Map<String, Object>> getAll() {
		SupervisionRecordExample supervisionRecordExample = new SupervisionRecordExample();
		Criteria criteria = supervisionRecordExample.createCriteria();
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
	}*/

	//2.3
	public void addOne(Map<String, String> params) {
		Long planId = Long.parseLong(params.get("planId"));
		params.remove("planId");
		ObjectMapper objectMapper = new ObjectMapper();
		IntermediateChecksRecord intermediateChecksRecord = objectMapper.convertValue(params, IntermediateChecksRecord.class);
		intermediateChecksRecord.setPlanId(planId);
		intermediateChecksRecordMapper.insertSelective(intermediateChecksRecord);
	}
	
	//2.4
	public void modifyOne(Map<String, String> params) {
		Long recordId = Long.parseLong(params.get("recordId"));
		params.remove("recordId");
		ObjectMapper objectMapper = new ObjectMapper();
		IntermediateChecksRecord intermediateChecksRecord = objectMapper.convertValue(params, IntermediateChecksRecord.class);
		intermediateChecksRecord.setRecordId(recordId);
		intermediateChecksRecordMapper.updateByPrimaryKeySelective(intermediateChecksRecord);
	}
	
	//2.5
	public void deleteOne(Long value) {
		IntermediateChecksRecordExample intermediateChecksRecordExample = new IntermediateChecksRecordExample();
		IntermediateChecksRecordExample.Criteria criteria = intermediateChecksRecordExample.createCriteria();
		criteria.andRecordIdEqualTo(value);
		intermediateChecksRecordMapper.deleteByExample(intermediateChecksRecordExample);
	}
	
	//2.6
	public Map<String, Object> getOneByPlanId(Long planId) {
		Map<String, Object> res = new HashMap<String, Object>();
		IntermediateChecksRecordExample intermediateChecksRecordExample = new IntermediateChecksRecordExample();
		IntermediateChecksRecordExample.Criteria criteria = intermediateChecksRecordExample.createCriteria();
		criteria.andPlanIdEqualTo(planId);
		IntermediateChecksRecord intermediateChecksRecord = intermediateChecksRecordMapper.selectOneByExample(intermediateChecksRecordExample);
		res.put("recordId", intermediateChecksRecord.getRecordId());
		res.put("planId", planId);
		res.put("object", intermediateChecksRecord.getObject());
		res.put("checkDate", intermediateChecksRecord.getCheckDate());
		res.put("processRecord", intermediateChecksRecord.getProcessRecord());
		res.put("processRecordPerson", intermediateChecksRecord.getProcessRecordPerson());
		res.put("processRecordDate", intermediateChecksRecord.getProcessRecordDate());
		res.put("resultRecord", intermediateChecksRecord.getResultRecord());
		res.put("resultRecordPerson", intermediateChecksRecord.getResultRecordPerson());
		res.put("resultRecordDate", intermediateChecksRecord.getResultRecordDate());
		res.put("note", intermediateChecksRecord.getNote());
		return res;
	}
}
