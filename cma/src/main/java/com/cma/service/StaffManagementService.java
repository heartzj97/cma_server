package com.cma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffExample;
import com.cma.pojo.StaffExample.Criteria;

@Service
public class StaffManagementService {
	@Autowired
	private StaffMapper staffMapper;
	
	public Staff queryById(Long value) {
		StaffExample staffExample = new StaffExample();
		Criteria criteria = staffExample.createCriteria();
		criteria.andIdEqualTo(value);
		return staffMapper.selectOneByExample(staffExample);
	}
	
	public void delete(Long value) {
		StaffExample staffExample = new StaffExample();
		Criteria criteria = staffExample.createCriteria();
		criteria.andIdEqualTo(value);
		staffMapper.deleteByExample(staffExample);
	}
}
