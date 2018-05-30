package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.service.StaffTrainingService;

@RestController
@RequestMapping("/StaffTraining")
public class StaffTrainingController {
	@Autowired
	StaffTrainingService staffTrainingService;
	
	/**
	 * 4.5
	 * 添加单个培训项目
	 * @return
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		staffTrainingService.addOne(params);
		return Result.ok();
	}
}
