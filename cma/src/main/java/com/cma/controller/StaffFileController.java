package com.cma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.StaffFile;
import com.cma.service.StaffFileService;

@RestController
@RequestMapping("/StaffFile")
public class StaffFileController {
	@Autowired
	StaffFileService staffFileService;
	
	/**
	 * 获取单个人员档案信息
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 */
	
	/*
	 * FIXME
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestBody Long id) {
		return Result.ok(staffFileService.getOne(id));
	}
	
	/**
	 * 增加单个人员档案信息
	 * method:GET
	 * 
	 * @param StaffFile
	 * @return Result
	 */
	/*
	 * FIXME
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestBody StaffFile staffFile) {
		if (staffFile != null) {
			staffFileService.addOne(staffFile);
			}
		return Result.ok();
	}
	
	/**
	 * 2.4
	 * 删除单个人员档案信息
	 * method:POST
	 * 
	 * @param Long id
	 * @return Result
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long value) {
		staffFileService.delete(value);
		return Result.ok();
	}
}
