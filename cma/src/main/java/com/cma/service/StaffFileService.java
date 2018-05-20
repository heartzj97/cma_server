package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.pojo.StaffFile;
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
		StaffFile staff = new StaffFile();
		staff.setName(staffName);
		staffFileMapper.delete(staff);
	}
	
	public void modify(StaffFileParam staffFileParam) {
		StaffFile staff = new StaffFile();
		//staffFileParam.getStaffFile();
		staff.setName(staffFileParam.getName());
		StaffFile r_staff = staffFileMapper.selectOne(staff);
		staff = staffFileParam.getStaffFile();
		staff.setId(r_staff.getId());
		staffFileMapper.updateByPrimaryKey(staff);
	}
	
	public StaffFile queryByName(String staffName) {
		StaffFile staff = new StaffFile();
		staff.setName(staffName);
		return staffFileMapper.selectOne(staff);
	}
}
