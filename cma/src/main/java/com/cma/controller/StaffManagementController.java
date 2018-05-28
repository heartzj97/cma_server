package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.Staff;
import com.cma.service.StaffManagementService;


@RestController
@RequestMapping("/StaffManagement")
public class StaffManagementController {
	@Autowired
	StaffManagementService staffManagementService;
	
	/**
	 * 获取单个人员全部信息
	 * 
	 * @param value
	 * @return
	 * @author qwl
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		Staff staff = null;
		staff = staffManagementService.queryById(value);
		if(staff!=null) {
			return Result.ok(staff);
		}
		else {
			return Result.errorMsg("Can't find this staff!");
		}
	}
	
	/**
	 * 删除人员信息
	 * 
	 * @param value
	 * @return
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long value) {
		staffManagementService.delete(value);
		return Result.ok();
	}
	
	/**
	 * 修改单个人员
	 * method: POST
	 * 
	 * @param Map
	 * @return Result
	 * @author qjx
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, Object> params) {
		Boolean sign = staffManagementService.modifyOne(params);
		if (sign) {
			return Result.ok();
		}
		else {
			return Result.ok();
		}		
	}
		
	/**
	 * 1.1
	 * 获取全部人员简易信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author nx
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(staffManagementService.getAllInformation());
	}
	
	
	/**
	 * 1.6
	 * 获取全部无档案人员列表
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getNoFile")
	public Result getNoFile() {
		return Result.ok(staffManagementService.getAllNoFile());
	}
	
	/**
	 * 1.3
	 * 新增单个人员
	 * method:POST
	 * 
	 * @param Staff
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Staff staff) {
		if (staff != null) {
			staffManagementService.addOne(staff);
			}
		return Result.ok();
	}
}

