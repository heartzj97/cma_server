package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.EquipmentMaintenance;
import com.cma.service.EquipmentMaintenanceService;
import com.cma.util.Result;

@RestController
@RequestMapping("/EquipmentMaintenance")
public class EquipmentMaintenanceController {
	
	@Autowired
	EquipmentMaintenanceService equipmentMaintenanceService;
	
	/**
	 * 4.1
	 * 获取全部仪器设备维修保养记录
	 * method:GET
	 * 
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentMaintenanceService.getAll());
	}
	
	/**
	 * 4.2
	 * 获取某个仪器设备维修保养记录
	 * method:GET
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		EquipmentMaintenance equipmentMaintenance = equipmentMaintenanceService.getOne(value);
		if(equipmentMaintenance==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(equipmentMaintenance);
		}
	}
	
	/**
	 * 4.3
	 * 新增仪器设备维修保养记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		if(equipmentMaintenanceService.addOne(params)==false) {
			return Result.fail("设备已停用");
		}
		else {
			return Result.ok();
		}
	}
	
	/**
	 * 4.4
	 * 修改某项仪器设备维修保养记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = equipmentMaintenanceService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	/**
	 * 4.5
	 * 删除某条仪器设备维修保养记录
	 * method:POST
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentMaintenanceService.deleteOne(value);
		return Result.ok();
	}

	/**
	 * 4.6
	 * 获取某个仪器设备的维修保养记录
	 * method:GET
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAllByEquipmentId")
	public Result getAllByEquipmentId(@RequestParam("equipmentId")Long value) {
		List<EquipmentMaintenance> list = equipmentMaintenanceService.getAllByEquipmentId(value);
		return Result.ok(list);
	}
}
