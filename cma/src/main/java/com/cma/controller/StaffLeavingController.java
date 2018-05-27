package com.cma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffLeaving;
import com.cma.service.StaffLeavingService;

@RestController
@RequestMapping("/StaffLeaving")
public class StaffLeavingController {
	@Autowired
	StaffLeavingService staffLeavingService;
	
	/**
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
	
}
