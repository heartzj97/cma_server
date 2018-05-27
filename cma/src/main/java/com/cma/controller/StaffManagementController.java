package com.cma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.Staff;
import com.cma.service.StaffManagementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/StaffManagement")
public class StaffManagementController {
	@Autowired
	StaffManagementService staffManagementService;
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		Staff staff=null;
		staff = staffManagementService.queryById(value);
		if(staff!=null) {
			return Result.ok(staff);
		}
		else {
			return Result.ok("no this staff");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long value) {
		staffManagementService.delete(value);
		return Result.ok();
	}
		
		/**
		 * 获取全部人员简易信息
		 * method:GET
		 * 
		 * @param null
		 * @return Result
		 */
		@GetMapping("/getAll")
		public Result getAll() {
			return Result.ok(staffManagementService.getAllInformation());
		}
		
		@GetMapping("/getNoFile")
		public Result getNoFile() {
			return Result.ok(staffManagementService.getAllNoFile());
		}
	}

