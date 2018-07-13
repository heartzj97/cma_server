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
	
	/**
	 * 1.1
	 * 获取全部仪器设备信息
	 * @return
	 * method:GET
	 * 
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentService.getAll());
	}
	
	/**
	 * 1.2
	 * 获取某个仪器设备的信息
	 * method:GET
	 * 
	 * @param id
	 * @return Result
	 * @author qwl
	 */
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
	
	
	/**
	 * 1.3
	 * 新增仪器信息
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		equipmentService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 1.4
	 * 修改某项仪器设备信息
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 1.5
	 * 删除某条仪器设备
	 * method:POST
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentService.deleteOne(value);
		return Result.ok();
	}
}
