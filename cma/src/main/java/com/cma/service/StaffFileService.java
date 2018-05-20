package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileExample;
import com.cma.pojo.StaffFileExample.Criteria;
import com.cma.pojo.StaffFileParam;




@Service
public class StaffFileService {
	
	@Autowired
	private StaffFileMapper staffFileMapper;
	
	public List<StaffFile> getAllInformation() {
		return staffFileMapper.selectAll();
	}
	
	public void addStaff(StaffFile staffFile) {
		staffFileMapper.insert(staffFile);
	}
	
	public void delete(String staffName) {
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		staffFileMapper.deleteByExample(staffFileExample);
	}
	
	public void modify(StaffFileParam staffFileParam) {
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andNameEqualTo(staffFileParam.getName());
		staffFileMapper.updateByExample(staffFileParam.getStaffFile(), staffFileExample);
	}
	
	public StaffFile queryByName(String staffName) {
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		return staffFileMapper.selectOneByExample(staffFileExample);
	}
}
