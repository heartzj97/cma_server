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
import com.cma.service.EquipmentUseService;
import com.cma.util.Result;

@RestController
@RequestMapping("/EquipmentUse")
public class EquipmentUseController {
	
	@Autowired
	EquipmentUseService equipmentUseService;
	
	/**
	 * 3.1
	 * 获取全部仪器设备使用记录
	 * method:GET
	 * 
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentUseService.getAll());
	}
	
	/**
	 * 3.2
	 * 获取某个仪器设备使用记录
	 * method:GET
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 3.3
	 * 新增仪器设备使用记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		/*if(equipmentUseService.addOne(params) == true) {
			return Result.ok();
		}
		else {
			return Result.fail("设备已停用");
		}*/
		equipmentUseService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 3.4
	 * 修改某项仪器设备使用记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 3.5
	 * 删除某条仪器设备使用记录
	 * method:POST
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentUseService.deleteOne(value);
		return Result.ok();
	}

	/**
	 * 3.6
	 * 获取某个仪器设备的使用记录
	 * method:GET
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAllByEquipmentId")
	public Result getAllByEquipmentId(@RequestParam("equipmentId")Long value) {
		List<EquipmentUse> list = equipmentUseService.getAllByEquipmentId(value);
		return Result.ok(list);
	}
}
