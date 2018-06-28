package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.EquipmentApplication;
import com.cma.pojo.Result;
import com.cma.service.EquipmentApplicationService;

@RestController
@RequestMapping("/EquipmentApplication")
public class EquipmentApplicationController {
	
	@Autowired
	EquipmentApplicationService equipmentApplicationService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentApplicationService.getAll());
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		EquipmentApplication equipmentApplication = equipmentApplicationService.getOne(value);
		if(equipmentApplication==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(equipmentApplication);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		equipmentApplicationService.addOne(params);
		return Result.ok();
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = equipmentApplicationService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentApplicationService.deleteOne(value);
		return Result.ok();
	}
}
