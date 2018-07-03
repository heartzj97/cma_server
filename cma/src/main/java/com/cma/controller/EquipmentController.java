package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Equipment;
import com.cma.service.EquipmentService;
import com.cma.util.Result;

@RestController
@RequestMapping("/Equipment")
public class EquipmentController {
	
	@Autowired
	EquipmentService equipmentService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentService.getAll());
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		Equipment equipment = equipmentService.getOne(value);
		if(equipment==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(equipment);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		equipmentService.addOne(params);
		return Result.ok();
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = equipmentService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentService.deleteOne(value);
		return Result.ok();
	}
}
