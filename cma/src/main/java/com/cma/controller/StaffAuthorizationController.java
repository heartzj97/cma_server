package com.cma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.service.StaffAuthorizationService;

@RestController
@RequestMapping("/StaffAuthorization")
public class StaffAuthorizationController {
	@Autowired
	StaffAuthorizationService staffAuthorizationService; 
	
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
}
