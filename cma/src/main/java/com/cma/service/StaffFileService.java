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
	
	public String addStaff(StaffFile staffFile) {
		return null;
	}
}
