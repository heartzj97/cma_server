package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.EquipmentReceive;
import com.cma.service.EquipmentReceiveService;
import com.cma.util.Result;

@RestController
@RequestMapping("/EquipmentReceive")
public class EquipmentReceiveController {
	
	@Autowired
	EquipmentReceiveService equipmentReceiveService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentReceiveService.getAll());
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		EquipmentReceive equipmentReceive = equipmentReceiveService.getOne(value);
		if(equipmentReceive==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(equipmentReceive);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		equipmentReceiveService.addOne(params);
		return Result.ok();
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = equipmentReceiveService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentReceiveService.deleteOne(value);
		return Result.ok();
	}
	
}
