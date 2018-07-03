package com.cma.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffLeaving;

@Service
public class StaffLeavingService {
	
	@Autowired
	StaffManagementService staffManagementService;
	
	@Autowired
	StaffMapper staffMapper;
	
	public List<StaffLeaving> getAll() {
		List<StaffLeaving> res = new ArrayList<>();
		List<Staff> temp = staffMapper.selectAll();
		for(Staff staff : temp) {
			if(staff.getIsLeaving()==1) {
				StaffLeaving s = new StaffLeaving();
				s.setId(staff.getId());
				s.setName(staff.getName());
				s.setDepartment(staff.getDepartment());
				s.setPosition(staff.getPosition());
				s.setLeavingDate(staff.getLeavingDate());
				res.add(s);
			}
		}
		return res;
	}
	
	public int addOne(Long value, Date leaving_date) {
		Staff staff = null;
		staff = staffManagementService.queryById(value);
		if (staff==null) {
			return 0;
		}
		if(staff.getIsLeaving()==1) {
			return 1;
		}
		Byte i = 1;
		staff.setIsLeaving(i);
		staff.setLeavingDate(leaving_date);
		staffMapper.updateByPrimaryKeySelective(staff);
		return 2;
	}
}
