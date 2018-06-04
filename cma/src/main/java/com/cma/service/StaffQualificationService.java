package com.cma.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffQualificationMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffQualification;
import com.cma.pojo.StaffQualificationExample;
import com.cma.pojo.StaffQualificationExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffQualificationService {
	
	@Autowired
	private StaffQualificationMapper staffQualificationMapper;
	
	@Autowired
	StaffManagementService staffManagementService;

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
}
