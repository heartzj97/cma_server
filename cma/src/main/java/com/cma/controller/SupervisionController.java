package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.Supervision;
import com.cma.service.SupervisionService;

@RestController
@RequestMapping("/Supervision")
public class SupervisionController {

	@Autowired
	SupervisionService supervisionService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		List<Supervision> supervisionInfo = supervisionService.getAll();
		return Result.ok(supervisionInfo);
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		supervisionService.addOne(params);
		return Result.ok();
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		supervisionService.modifyOne(params);
		return Result.ok();
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long value) {
		supervisionService.deleteOne(value);
		return Result.ok();
	}
	
	@PostMapping("/approveOne")
	public Result approveOne(@RequestParam("id")Long value, @RequestParam("approver")String approver) {
		boolean t = supervisionService.approveOne(value, approver);
		if(t==false) {
			return Result.fail("请勿重复批准");
		}
		return Result.ok();
	}
	
	@PostMapping("/executeOne")
	public Result executeOne(@RequestParam("id")Long value) {
		int t = supervisionService.executeOne(value);
		if(t==0) {
			return Result.fail("该监督未获得批准");
		}
		else if(t==2) {
			return Result.fail("请勿重复执行");
		}
		else {
			return Result.ok();
		}
	}
}
