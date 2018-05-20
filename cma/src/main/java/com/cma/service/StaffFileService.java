package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.pojo.StaffFile;


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
		staffFileMapper.deleteByExample(staff);
		
	}
	
	public void modify(String staffName, StaffFile staffFile) {
		StaffFile staff = new StaffFile();
		staff.setName(staffName);
		staffFileMapper.updateByExample(staff, staffFile);
	}
	
	public StaffFile queryByName(String staffName) {
		StaffFile staff = new StaffFile();
		staff.setName(staffName);
		return staffFileMapper.selectOne(staff);
	}
}
