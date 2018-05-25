package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffAppointmentMapper;
import com.cma.pojo.StaffAppointment;
import com.cma.pojo.StaffAppointmentExample;
import com.cma.pojo.StaffAppointmentParam;
import com.cma.pojo.StaffAppointmentExample.Criteria;

@Service
public class StaffAppointmentService {

	@Autowired
	private StaffAppointmentMapper staffAppointmentMapper;
	
	public List<StaffAppointment> getAllInformation() {
		return staffAppointmentMapper.selectAll();
	}
	
	public void addStaff(StaffAppointment staffAppointment) {
		staffAppointmentMapper.insert(staffAppointment);
	}
	
	public void delete(String staffName) {
		StaffAppointmentExample staffAppointmentExample = new StaffAppointmentExample();
		Criteria criteria = staffAppointmentExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		staffAppointmentMapper.deleteByExample(staffAppointmentExample);
	}
	
	public void modify(StaffAppointmentParam staffAppointmentparam) {
		StaffAppointmentExample staffAppointmentExample = new StaffAppointmentExample();
		Criteria criteria = staffAppointmentExample.createCriteria();
		criteria.andNameEqualTo(staffAppointmentparam.getName());
		staffAppointmentMapper.updateByExample(staffAppointmentparam.getStaffAppointment(), staffAppointmentExample);
	}
	
	public List<StaffAppointment> queryByName(String staffName) {
		StaffAppointmentExample staffAppointmentExample = new StaffAppointmentExample();
		Criteria criteria = staffAppointmentExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		return staffAppointmentMapper.selectByExample(staffAppointmentExample);
	}
}
