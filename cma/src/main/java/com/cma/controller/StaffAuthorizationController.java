package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.service.StaffAuthorizationService;
import com.cma.util.Result;

@RestController
@RequestMapping("/StaffAuthorization")
public class StaffAuthorizationController {
	@Autowired
	StaffAuthorizationService staffAuthorizationService; 
	
	/**
	 * 6.1
	 * 获取全部授权记录信息
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<Map<String, Object>> data = staffAuthorizationService.getAll();
		return Result.ok(data);
	}
	
	/**
	 * 6.2
	 * 获取某员工全部授权记录信息
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 */
	@GetMapping("/getAllByStaff")
	public Result getAllByStaff(@RequestParam("id") Long id) {
		List<Map<String, Object>> data = staffAuthorizationService.getAllByStaff(id);
		return Result.ok(data);
	}
	
	/**
	 * 6.3
	 * 获取全部授权记录信息
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("authorizationId") Long authorizationId) {
		Map<String, Object> data = staffAuthorizationService.getOne(authorizationId);
		return Result.ok(data);
	}
	
	/**
	 * 6.4
	 * 娣诲姞浜哄憳鎺堟潈璁板綍
	 * @param value
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		Boolean sign = staffAuthorizationService.addOne(params);
		if (sign) {
		return Result.ok();
		}
		else {
			return Result.fail("插入失败");
		}
	}
	
	/**
	 * 6.5
	 * 删除某个人员授权记录
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result delete(@RequestParam("authorizationId") Long value) {
		staffAuthorizationService.deleteOne(value);
		return Result.ok();
	}
	
	/**
	 * 6.6
	 * 淇敼鏌愪釜浜哄憳璧勮川璁ゅ畾淇℃伅
	 * 
	 * @param 
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		Boolean sign = staffAuthorizationService.modifyOne(params);
		if (sign) {
			return Result.ok();
		}
		else {
			return Result.ok();
		}
	}
}
