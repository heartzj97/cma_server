package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.EquipmentUse;
import com.cma.pojo.Result;
import com.cma.service.EquipmentUseService;

@RestController
@RequestMapping("/EquipmentUse")
public class EquipmentUseController {
	
	@Autowired
	EquipmentUseService equipmentUseService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentUseService.getAll());
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		EquipmentUse equipmentUse = equipmentUseService.getOne(value);
		if(equipmentUse==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(equipmentUse);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		if(equipmentUseService.addOne(params) == true) {
			return Result.ok();
		}
		else {
			return Result.fail("设备已停用");
		}
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = equipmentUseService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentUseService.deleteOne(value);
		return Result.ok();
	}

	@PostMapping("/getAllByEquipmentId")
	public Result getAllByEquipmentId(@RequestParam("EquipmentId")Long value) {
		List<EquipmentUse> list = equipmentUseService.getAllByEquipmentId(value);
		return Result.ok(list);
	}
}
