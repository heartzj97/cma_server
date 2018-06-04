package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileExample;
import com.cma.pojo.StaffFileExample.Criteria;
import com.cma.service.StaffAuthorizationService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/StaffAuthorization")
public class StaffAuthorizationController {
	@Autowired
	StaffAuthorizationService staffAuthorizationService; 
	
	/**
	 * 6.4
	 * 添加人员授权记录
	 * @param value
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		staffAuthorizationService.addOne(params);
		return Result.ok();
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
	 * 修改某个人员资质认定信息
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
