package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.IntermediateChecksRecord;
import com.cma.pojo.Result;
import com.cma.service.IntermediateChecksRecordService;

@RestController
@RequestMapping("/IntermediateChecksRecord")
public class IntermediateChecksRecordController {
	
	@Autowired
	private IntermediateChecksRecordService intermediateChecksRecordService;
	
	/**
	 * 2.1
	 * 获取全部期间核查记录
	 * method:GET
	 * 
	 * @return Result
	 * @author nx
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<IntermediateChecksRecord> data = intermediateChecksRecordService.getAll();
		return Result.ok(data);
	}
	
	/**
	 * 2.2
	 * 根据记录号查询一条期间核查记录
	 * method:GET
	 * 
	 * @return result
	 * @author nx
	 */
	@GetMapping("/getOneByRecordId")
	public Result getOneByRecordId(@RequestParam("recordId") Long recordId) {
		Map<String, Object> data = intermediateChecksRecordService.getOneByRecordId(recordId);
		return Result.ok(data);
	}

	/**
	 * 2.3
	 * 新增期间核查记录
	 * method:POST
	 * 
	 * @param IntermediateChecksRecord
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		intermediateChecksRecordService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 2.4
	 * 修改单项期间核查记录
	 * method:POST
	 * 
	 * @param IntermediateChecksRecord
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		intermediateChecksRecordService.modifyOne(params);
		return Result.ok();
	}
	
	/**
	 * 2.5
	 * 删除某条期间核查计划
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("recordId") Long recordId) {
		intermediateChecksRecordService.deleteOne(recordId);
		return Result.ok();
	}
	
	/**
	 * 2.6
	 * 根据计划号查询一条期间核查记录
	 * method:GET
	 * 
	 * @return result
	 * @author nx
	 */
	@GetMapping("/getOneByPlanId")
	public Result getOneByPlanId(@RequestParam("planId") Long planId) {
		Map<String, Object> data = intermediateChecksRecordService.getOneByPlanId(planId);
		return Result.ok(data);
	}
}
