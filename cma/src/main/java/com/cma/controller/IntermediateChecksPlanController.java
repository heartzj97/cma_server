package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.IntermediateChecksPlan;
import com.cma.pojo.Result;
import com.cma.service.IntermediateChecksPlanService;

@RestController
@RequestMapping("/IntermediateChecksPlan")
public class IntermediateChecksPlanController {
	
	@Autowired
	IntermediateChecksPlanService intermediateChecksPlanService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		List<IntermediateChecksPlan> data = intermediateChecksPlanService.getAll();
		return Result.ok(data);
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("planId") Long value) {
		IntermediateChecksPlan intermediateChecksPlan = intermediateChecksPlanService.getOne(value);
		if(intermediateChecksPlan == null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(intermediateChecksPlan);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		int i = intermediateChecksPlanService.addOne(params);
		if (i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败");
		}
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = intermediateChecksPlanService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("planId")Long value) {
		int i = intermediateChecksPlanService.deleteOne(value);
		if(i == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("无此条信息");
		}
	}
}
