package com.cma.controller;

import java.util.List;
import java.util.Map;

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
	 * 获取全部人员档案信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<StaffFile> data = null;
		data = staffFileService.getAll();
		return Result.ok(data);
	}
	
	
	/**
	 * 获取单个人员档案信息
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		return Result.ok(staffFileService.getOne(value));
	}
	
	/**
	 * 增加单个人员档案信息
	 * method:GET
	 * 
	 * @param StaffFile
	 * @return Result
	 * @author Fu
	 */
	/*
	 * FIXME
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		if (params != null) {
			staffFileService.addOne(params);
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
	 * @author nx
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long value) {
		staffFileService.delete(value);
		return Result.ok();
	}
	
	/**
	 * 修改单个人员档案信息
	 * method: POST
	 * 
	 * @param Map
	 * @return Result
	 * @author qjx
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		return Result.ok();
	}
}
