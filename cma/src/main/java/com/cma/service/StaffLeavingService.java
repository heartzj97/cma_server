package com.cma.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.pojo.Staff;
import com.cma.pojo.StaffLeaving;

@Service
public class StaffLeavingService {
	
	@Autowired
	StaffManagementService staffManagementService;
	
	public List<StaffLeaving> getAll() {
		List<StaffLeaving> res = new ArrayList<>();
		List<Staff> temp = staffManagementService.getAllInformation();
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
}
