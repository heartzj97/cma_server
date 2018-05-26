package com.cma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Staff;
import com.cma.service.StaffManagementService;

@RestController
@RequestMapping("/StaffManagement")
public class StaffManagementController {
	
	@Autowired
	StaffManagementService staffManagementService;
	
	/**
	 * 获取全部人员简易信息
	 * method:GET
	 * 
	 * @param null
	 * @return List<Staff>
	 */
	@GetMapping("/getAll")
	public List<Staff> getAll() {
		return staffManagementService.getAllInformation();
	}
	
	/**
	 * 获取全部无档案人员列表
	 * method:GET
	 * 
	 * @param null
	 * @return List<Staff>
	 */
	@GetMapping("/getNoFile")
	public List<Staff> getNoFile() {
		return staffManagementService.getAllNoFile();
	}
}
