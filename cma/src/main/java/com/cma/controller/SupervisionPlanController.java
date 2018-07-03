package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.service.SupervisionPlanService;
import com.cma.util.Result;

@RestController
@RequestMapping("/SupervisionPlan")
public class SupervisionPlanController {

	@Autowired
	SupervisionPlanService supervisionPlanService;
	
	/**
	 * 2.1
	 * 获取某个监督的所有监督计划
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAll")
	public Result getAll(@RequestParam("id") Long value) {
		List<Map<String, Object>> data = supervisionPlanService.getAll(value);
		
		return Result.ok(data);
	}
	
	/**
	 * 2.2
	 * 新增监督计划
	 * method:POST
	 * 
	 * @param SupervisionPlan
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		supervisionPlanService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 2.3
	 * 修改单项监督计划
	 * method:POST
	 * 
	 * @param SupervisionPlan
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		supervisionPlanService.modifyOne(params);
		return Result.ok();
	}

	/**
	 * 2.4
	 * 删除某条监督计划
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("planId") Long value) {
		supervisionPlanService.deleteOne(value);
		return Result.ok();
	}
}
