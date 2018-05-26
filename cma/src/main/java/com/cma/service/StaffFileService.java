package com.cma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.mapper.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffExample;
import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileExample;
import com.cma.pojo.StaffFileGetOneParam;

@Service
public class StaffFileService {
	
	@Autowired
	private StaffFileMapper staffFileMapper;
	
	@Autowired
	private StaffMapper staffMapper;
	
	
	public StaffFileGetOneParam getOne(Long id) {
		StaffFileGetOneParam staffFileGetOneParam = new StaffFileGetOneParam();
		StaffFile staffFlie = new StaffFile();
		Staff staff = new Staff();
		
		StaffFileExample staffFileExample = new StaffFileExample();
		StaffFileExample.Criteria criteria1 = staffFileExample.createCriteria();
		criteria1.andUserIdEqualTo(id);
		staffFlie = staffFileMapper.selectOneByExample(staffFileExample);
		
		StaffExample staffExample = new StaffExample();
		StaffExample.Criteria criteria2 = staffExample.createCriteria();
		criteria2.andIdEqualTo(id);
		staff = staffMapper.selectOneByExample(staffExample);
		
		staffFileGetOneParam.setId(staff.getId());
		staffFileGetOneParam.setName(staff.getName());
		staffFileGetOneParam.setFileId(staffFlie.getFileId());
		staffFileGetOneParam.setFileLocation(staffFlie.getFileLocation());
		staffFileGetOneParam.setFileImage(staffFlie.getFileImage());
		
		return staffFileGetOneParam;
	}
	
	public void addOne(StaffFile staffFile) {
		staffFileMapper.insert(staffFile);
	}
}
