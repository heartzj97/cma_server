package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffAppointmentMapper;
import com.cma.pojo.StaffAppointment;

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
		StaffAppointment staffAppointment = new StaffAppointment();
		staffAppointment.setName(staffName);
		staffAppointmentMapper.deleteByExample(staffAppointment);
	}
	
	public void modify(String staffName,StaffAppointment staffAppointment) {
		StaffAppointment staffAppointment2 = new StaffAppointment();
		staffAppointment2.setName(staffName);
		staffAppointmentMapper.updateByExample(staffAppointment2, staffAppointment);
	}
	
	public List<StaffAppointment> queryByName(String staffName) {
		StaffAppointment staffAppointment = new StaffAppointment();
		staffAppointment.setName(staffName);
		return staffAppointmentMapper.select(staffAppointment);
	}
}
