package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.TrainingApplication;
import com.cma.service.TrainingApplicationService;
import com.cma.util.Result;

@RestController
@RequestMapping("/TrainingApplication")
public class TrainingApplicationController {
	
	@Autowired
	TrainingApplicationService trainingApplicationService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		List<TrainingApplication> data = trainingApplicationService.getAll();
		return Result.ok(data);
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		TrainingApplication trainingApplication = trainingApplicationService.getOne(value);
		if(trainingApplication==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(trainingApplication);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String,String> params) {
		int i = trainingApplicationService.addOne(params);
		if (i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败");
		}
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String,String> params) {
		trainingApplicationService.modifyOne(params);
		return Result.ok();
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		trainingApplicationService.deleteOne(value);
		return Result.ok();
	}
	
	@PostMapping("/approveOne")
	public Result approveOne(@RequestParam Map<String,String> params) {
		trainingApplicationService.approveOne(params);
		return Result.ok();
	}
}
