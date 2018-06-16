package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.service.AnnualTrainingPlanService;

@RestController
@RequestMapping("/AnnualTrainingPlan")
public class AnnualTrainingPlanController {

	@Autowired
	AnnualTrainingPlanService annualTrainingPlanService;
	
	/**
	 * 2.1
	 * 获取所有年度培训计划
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAll")
	public Result getAll(@RequestParam("year") Long value) {
		return Result.ok(annualTrainingPlanService.getAll(value));
	}
	
	/**
	 * 2.2
	 * 获取某一个年度培训计划
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("planId") Long planId) {
		return Result.ok(annualTrainingPlanService.getOne(planId));
	}
	
	/**
	 * 2.3
	 * 新增年度培训计划
	 * method:POST
	 * 
	 * @param AnnualTrainingPlan
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		annualTrainingPlanService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 2.4
	 * 修改年度培训计划
	 * method:POST
	 * 
	 * @param AnnualTrainingPlan
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		annualTrainingPlanService.modifyOne(params);
		return Result.ok();
	}
	
	/**
	 * 2.5
	 * 删除年度培训计划
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("planId") Long planId ) {
		annualTrainingPlanService.deleteOne(planId);
		return Result.ok();
	}
	
	/**
	 * 2.6
	 * 新增年度培训计划
	 * method:POST
	 * 
	 * @param Long
	 * @param String
	 * @param Date
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addAnnualPlan")
	public Result addAnnualPlan(@RequestParam Map<String, String> params) {
		annualTrainingPlanService.addAnnualPlan(params);
		return Result.ok();
	}
	
	/**
	 * 2.7
	 * 批准年度培训计划
	 * method:POST
	 * 
	 * @param Long
	 * @param String
	 * @param Date
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/approveAnnualPlan")
	public Result approveAnnualPlan (@RequestParam Map<String, String> params) {
		annualTrainingPlanService.approveAnnualPlan(params);
		return Result.ok();
	}
	
	/**
	 * 2.8
	 * 获取年度培训计划
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAnnualPlan")
	public Result getAnnualPlan (@RequestParam("year") Long value) {
		
		return Result.ok(annualTrainingPlanService.getAnnualPlan(value));
	}
	
	/**
	 * 2.9
	 * 获取所有年度培训计划
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAllAnnualPlan")
	public Result getAllAnnualPlan() {
		return Result.ok(annualTrainingPlanService.getAllAnnualPlan());
	}
}
