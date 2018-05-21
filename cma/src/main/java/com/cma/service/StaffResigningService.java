package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffResigningMapper;
import com.cma.pojo.StaffResigning;
import com.cma.pojo.StaffResigningExample;
import com.cma.pojo.StaffResigningParam;
import com.cma.pojo.StaffResigningExample.Criteria;

@Service
public class StaffResigningService {
	
	@Autowired
	private StaffResigningMapper staffResigningMapper;
	
	public List<StaffResigning> getAllInformation() {
		return staffResigningMapper.selectAll();
	}
	
	public void addStaff(StaffResigning staffResigning) {
		staffResigningMapper.insert(staffResigning);
	}
	
	public void delete(String staffName) {
		StaffResigningExample staffResigningExample = new StaffResigningExample();
		Criteria criteria = staffResigningExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		staffResigningMapper.deleteByExample(staffResigningExample);
	}
	
	public void modify(StaffResigningParam staffResigningParam) {
		StaffResigningExample staffResigningExample = new StaffResigningExample();
		Criteria criteria = staffResigningExample.createCriteria();
		criteria.andNameEqualTo(staffResigningParam.getName());
		staffResigningMapper.updateByExample(staffResigningParam.getStaffResigning(), staffResigningExample);
	}
	
	public StaffResigning queryByName(String staffName) {
		StaffResigningExample staffResigningExample = new StaffResigningExample();
		Criteria criteria = staffResigningExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		return staffResigningMapper.selectOneByExample(staffResigningExample);
	}
}

