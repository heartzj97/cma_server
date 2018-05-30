package com.cma.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.service.StaffFileService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/StaffFile")
public class StaffFileController {
	@Autowired
	StaffFileService staffFileService;
	
	
	/**
	 * 2.1
	 * 获取全部人员档案信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 * @throws JSONException 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<Map<String, Object>> data = staffFileService.getAll();
		
		return Result.ok(data);
	}
	
	
	/**
	 * 2.2
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
	 * 2.3
	 * 增加单个人员档案信息
	 * method:GET
	 * 
	 * @param StaffFile
	 * @return Result
	 * @author Fu
	 */

	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		Boolean sign = staffFileService.addOne(params);
		if (sign) {
			return Result.ok();
		}
		else {
			return Result.fail("");
		}
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
		staffFileService.deleteOne(value);
		return Result.ok();
	}
	
	/**
	 * 2.5
	 * 修改单个人员档案信息
	 * method: POST
	 * 
	 * @param Map
	 * @return Result
	 * @author qjx
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		Boolean sign = staffFileService.modifyOne(params);
		if (sign) {
			return Result.ok();
		}
		else {
			return Result.ok();
		}
	}
}
