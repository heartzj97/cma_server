package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.service.SupervisionRecordService;
import com.cma.util.Result;

@RestController
@RequestMapping("/SupervisionRecord")
public class SupervisionRecordController {
	
	@Autowired
	private SupervisionRecordService supervisionRecordService;
	
	/**
	 * 3.1
	 * 获取某个监督计划对应的监督记录
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author nx
	 */
	@GetMapping("/getAll")
	public Result getAll(@RequestParam("planId") Long planId) {
		List<Map<String, Object>> data = supervisionRecordService.getAll(planId);
		return Result.ok(data);
	}

	/**
	 * 3.2
	 * 新增监督记录
	 * method:POST
	 * 
	 * @param SupervisionRecord
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		supervisionRecordService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 3.3
	 * 修改单项监督记录
	 * method:POST
	 * 
	 * @param SupervisionRecord
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		supervisionRecordService.modifyOne(params);
		return Result.ok();
	}
	
	/**
	 * 3.4
	 * 删除某条监督计划
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author nx
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("recordId") Long recordId) {
		supervisionRecordService.deleteOne(recordId);
		return Result.ok();
	}
}
