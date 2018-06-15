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
	
	/**
	 * 1.1
	 * 获取所有期间核查计划
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<IntermediateChecksPlan> data = intermediateChecksPlanService.getAll();
		return Result.ok(data);
	}
	
	/**
	 * 1.2
	 * 获取某个期间核查计划
	 * @param value
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 1.3
	 * 新增期间核查计划
	 * @param params
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 1.4
	 * 修改单项期间核查计划
	 * @param params
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 1.5
	 * 删除某条期间核查计划
	 * @param value
	 * @return Result
	 * @author qwl
	 */
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
