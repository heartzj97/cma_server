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
	public Result approveOne(@RequestParam("id")Long value, @RequestParam("approver") String approver) {
		supervisionService.approveOne(value, approver);
		return Result.ok();
	}
	
	@PostMapping("/executeOne")
	public Result executeOne(@RequestParam("id")Long value) {
		supervisionService.executeOne(value);
		return Result.ok();
	}
}
