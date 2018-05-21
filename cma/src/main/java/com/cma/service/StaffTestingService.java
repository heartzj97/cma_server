package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffTestingMapper;
import com.cma.pojo.StaffTesting;
import com.cma.pojo.StaffTestingExample;
import com.cma.pojo.StaffTestingParam;
import com.cma.pojo.StaffTestingExample.Criteria;

@Service
public class StaffTestingService {
	@Autowired
	private StaffTestingMapper staffTestingMapper;
	
	public List<StaffTesting> getAllInformation() {
		return staffTestingMapper.selectAll();
	}
	
	public void addStaff(StaffTesting staffTesting) {
		staffTestingMapper.insert(staffTesting);
	}
	
	public void delete(String staffName) {
		StaffTestingExample staffTestingExample = new StaffTestingExample();
		Criteria criteria = staffTestingExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		staffTestingMapper.deleteByExample(staffTestingExample);
	}
	
	public void modify(StaffTestingParam staffTestingParam) {
		StaffTestingExample staffTestingExample = new StaffTestingExample();
		Criteria criteria = staffTestingExample.createCriteria();
		criteria.andNameEqualTo(staffTestingParam.getName());
		staffTestingMapper.updateByExample(staffTestingParam.getStaffTesting(), staffTestingExample);
	}
	
	public StaffTesting queryByName(String staffName) {
		StaffTestingExample staffTestingExample = new StaffTestingExample();
		Criteria criteria = staffTestingExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		return staffTestingMapper.selectOneByExample(staffTestingExample);
	}
}
