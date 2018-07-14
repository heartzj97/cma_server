package com.cma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.service.TestAbilityService;
import com.cma.util.Result;

@RestController
@RequestMapping("/TestAbility")
public class TestAbilityController {
	
	@Autowired
	TestAbilityService testAbilityService;
	
	/**
	 * 1.1
	 * 获取全部年度信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(testAbilityService.getAll());
	}
}
