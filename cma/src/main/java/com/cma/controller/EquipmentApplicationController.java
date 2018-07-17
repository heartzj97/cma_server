package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.EquipmentApplication;
import com.cma.service.EquipmentApplicationService;
import com.cma.util.Result;

@RestController
@RequestMapping("/EquipmentApplication")
public class EquipmentApplicationController {
	
	@Autowired
	EquipmentApplicationService equipmentApplicationService;
	
	/**
	 * 5.1
	 * 获取全部仪器设备使用申请记录
	 * method:GET
	 * 
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentApplicationService.getAll());
	}
	
	/**
	 * 5.2
	 * 获取某个仪器设备使用申请记录
	 * method:GET
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 5.3
	 * 新增仪器设备使用申请记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		equipmentApplicationService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 5.4
	 * 修改某项仪器设备使用申请记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 5.5
	 * 删除某条仪器设备使用申请记录
	 * method:POST
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentApplicationService.deleteOne(value);
		return Result.ok();
	}
}
