package com.cma.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.mapper.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffFileExample;
import com.cma.pojo.StaffFileExample.Criteria;

@Service
public class StaffManagementService {

	@Autowired
	private StaffMapper staffMapper;
	
	@Autowired
	private StaffFileMapper staffFileMapper;
	
	public List<Staff> getAllInformation() {
		return staffMapper.selectAll();
	}
	
	public List<Staff> getAllNoFile() {
		List<Staff> list1 = new ArrayList<Staff>();
		List<Staff> list2 = new ArrayList<Staff>();
		list1 = staffMapper.selectAll();
		for (int i = 0;i < list1.size();i++) {
			Long userId = list1.get(i).getId();
			StaffFileExample staffFileExample = new StaffFileExample();
			StaffFileExample.Criteria criteria = staffFileExample.createCriteria();
			criteria.andUserIdEqualTo(userId);
			if (staffFileMapper.selectByExample(staffFileExample).size() == 0)
				list2.add(list1.get(i));
		}
		
		
		
		return list2;
	}
}
