package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.service.StaffQualificationService;

@RestController
@RequestMapping("/StaffQualification")
public class StaffQualificationController {
	@Autowired
	StaffQualificationService staffQualificationService;
	
	/**
	 * 5.3 
	 * 删除某个人员资质认定信息
	 * @param qualificationId
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("qualificationId") Long value) {
		staffQualificationService.deleteOne(value);
		return Result.ok();
	}
	
	/**
	 * 5.4
	 * 修改某个人员资质认定信息
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String,String> params) {
		boolean sign = staffQualificationService.modifyOne(params);
		if(sign) {
			return Result.ok();
		}
		else {
			return Result.ok();
		}
	}
}
