package com.cma.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cma.mapper.StaffQualificationMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffQualification;
import com.cma.pojo.StaffQualificationExample;
import com.cma.pojo.StaffTrainingResult;
import com.cma.pojo.StaffTrainingResultExample;
import com.cma.pojo.StaffQualificationExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffQualificationService {
	
	@Autowired
	private StaffQualificationMapper staffQualificationMapper;

	//5.1
	public List<Map<String,Object>> getAllByStaff(Long userId) {
		Map<String,Object> res = new HashMap<String,Object>();
		List<Map<String,Object>> resList = new ArrayList<Map<String,Object>>();
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<StaffQualification> staffQualificationList = staffQualificationMapper.selectByExample(staffQualificationExample);
		Iterator<StaffQualification> iter = staffQualificationList.iterator();
		while(iter.hasNext()) {
			StaffQualification staffQualification = iter.next();
			res.put("qualificationId",staffQualification.getQualificationId());
			res.put("qualificationName",staffQualification.getQualificationName());
			resList.add(res);
			res = new HashMap<String,Object>();
		}
		return resList;
	}
	public void deleteOne(Long value) {
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andQualificationIdEqualTo(value);
		staffQualificationMapper.deleteByExample(staffQualificationExample);
	}
	
	public boolean modifyOne(Map<String,String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffQualification staffQualification = objectMapper.convertValue(params, StaffQualification.class);
		staffQualificationMapper.updateByPrimaryKeySelective(staffQualification);
		return true;
	}
}
