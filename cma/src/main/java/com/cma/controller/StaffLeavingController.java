package com.cma.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffLeaving;
import com.cma.service.StaffLeavingService;
import com.cma.util.Result;

@RestController
@RequestMapping("/StaffLeaving")
public class StaffLeavingController {
	@Autowired
	StaffLeavingService staffLeavingService;
	
	/**
	 * 3.1
	 * 获取全部离任人员信息
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<StaffLeaving> data = null;
		data = staffLeavingService.getAll();
		return Result.ok(data);
	}
	
	/**
	 * 3，2
	 * 新增单个离任人员
	 * @param value
	 * @param date
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam("id") Long value, @RequestParam("leavingDate") Date leavingDate) {
		int b = staffLeavingService.addOne(value, leavingDate);
		if(b==0) {
			return Result.fail("没有此人员");
		}
		else if(b==1) {
			return Result.fail("此人员已离任");
		}
		else {
			return Result.ok();
		}
	}
}
