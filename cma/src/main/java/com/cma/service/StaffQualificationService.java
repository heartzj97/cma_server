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
	
	@Autowired
	StaffManagementService staffManagementService;
	
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
	
	//5.2
	public int addOne(Map<String,String> params) {
		Long userId = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffQualification staffQualification = objectMapper.convertValue(params, StaffQualification.class);
		staffQualification.setUserId(userId);
		staffQualificationMapper.insertSelective(staffQualification);
		return 1;
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
		
		Long value = staffQualification.getQualificationId();
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andQualificationIdEqualTo(value);
		StaffQualification find =  staffQualificationMapper.selectOneByExample(staffQualificationExample);
		
		Long user_id = find.getUserId();
		Staff staff = staffManagementService.queryById(user_id);
		if(staff.getIsLeaving()==1) {
			return false;
		}
		
		staffQualificationMapper.updateByPrimaryKeySelective(staffQualification);
		return true;
	}
	
	//5.5
	public Map<String,Object> getImage(Long value) {
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andQualificationIdEqualTo(value);
		StaffQualification find =  staffQualificationMapper.selectOneByExample(staffQualificationExample);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("qualificationImage", find.getQualificationImage());
		return map;
	}
	
	//5.6
	public List<Map<String, Object>> getAll() {
		Map<String, Object> res = new HashMap<String, Object>();
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		
		List<StaffQualification> list = new ArrayList<StaffQualification>();
		list = staffQualificationMapper.selectAll();
		
		for (int i = 0;i < list.size();i++) {
			Long userId = list.get(i).getUserId();
			Staff staff = staffManagementService.queryById(userId);
			res.put("id", staff.getId());
			res.put("name", staff.getName());
			res.put("department", staff.getDepartment());
			res.put("position", staff.getPosition());
			res.put("qualificationId", list.get(i).getQualificationId());
			res.put("qualificationName", list.get(i).getQualificationName());
			resList.add(res);
			res = new HashMap<String, Object>();
		}
		
		return resList;
	}
}
