package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.service.StaffTrainingService;

@RestController
@RequestMapping("/StaffTraining")

public class StaffTrainingController {

	@Autowired
	StaffTrainingService staffTrainingService;
	
	/**
	 * 4.6
	 * 对某次培训添加参与人
	 * method:POST
	 * 
	 * @param Map
	 * @return Result
	 * @author Fu
	 */
	/*
	 * FIX ME 
	 */
	@PostMapping("/addTrainingPeople")
	public Result addTrainingPeople(@RequestParam Map<String, String> params) {
		int sign = staffTrainingService.addTrainingPeople(params);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
	
	/**
	 * 4.8
	 * 修改培训信息
	 * method:POST
	 * 
	 * @param Map
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int sign = staffTrainingService.modifyOne(params);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
	
	/**
	 * 4.11
	 * 删除单个人员的培训结果
	 * method:POST
	 * 
	 * @param Map
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteTrainingPeople")
	public Result deleteTrainingPeople(@RequestParam Map<String,String> params) {
		int sign = staffTrainingService.deleteTrainingPeople(params);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
}
