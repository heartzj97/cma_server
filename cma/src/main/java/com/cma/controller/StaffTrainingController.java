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
import com.cma.pojo.StaffTraining;
import com.cma.service.StaffTrainingService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/StaffTraining")
public class StaffTrainingController {

	@Autowired
	StaffTrainingService staffTrainingService;
	
	/**
	 * 4.1
	 * 获取全部培训信息
	 * method:GET
	 * 
	 * @return Result
	 * @author nx
	 * @throws JsonProcessingException 
	 */
	@GetMapping("/getAll")
	public Result getAll() throws JsonProcessingException {
		List<StaffTraining> staffTrainingInformation = staffTrainingService.getAll();
		return Result.ok(staffTrainingInformation);
	}
	
	/**
	 * 4.2
	 * 获取某次培训的参与人
	 * method:GET
	 * 
	 * @return Result
	 * @author nx
	 * @throws JsonProcessingException 
	 */
	@GetMapping("/getTrainingPeople")
	public Result getTrainingPeople(@RequestParam Long trainingId) throws JsonProcessingException {
		List<Map<String, Object>> data = staffTrainingService.getTrainingPeople(trainingId);
		return Result.ok(data);
	}
	
	
	/**
	 * 4.3
	 * 获取某个人员的培训记录
	 * method:GET
	 * 
	 * @return Result
	 * @author nx
	 * @throws JsonProcessingException 
	 */
	@GetMapping("/getAllByStaff")
	public Result getAllByStaff(@RequestParam Long userId) throws JsonProcessingException {
		List<Map<String, Object>> data = staffTrainingService.getAllByStaff(userId);
		return Result.ok(data);
	}
	
	/**
	 * 4.4 
	 * 获取单个培训结果
	 * 
	 * @param 
	 * @return Request
	 * @author qjx
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long id, @RequestParam("trainingId") Long trainingId) {
		Map<String, Object> data = staffTrainingService.getOne(id, trainingId);
		return Result.ok(data);
	}
	
	/**
	 * 4.5
	 * 添加单个培训项目
	 * @return
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		staffTrainingService.addOne(params);
		return Result.ok();
	}
	/**
	 * 4.6
	 * 对某次培训添加参与人
	 * method:POST
	 * 
	 * @param Map
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addTrainingPeople")
	public Result addTrainingPeople(@RequestBody Map<String, Object> params) {
		int sign = staffTrainingService.addTrainingPeople(params);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
	
	/**
	 * 4.7
	 * 添加单个人员的培训结果
	 * 
	 * 
	 * @return
	 * @author qwl
	 */
	@PostMapping("/addTrainingResult")
	public Result addTrainingResult(@RequestParam Map<String, String> params) {
		staffTrainingService.addTrainingResult(params);
		return Result.ok();
	}
	
	/**
	 * 4.8
	 * 修改培训信息
	 * method:POST
	 * 
	 * @param Map
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int sign = staffTrainingService.modifyOne(params);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
	
	/**
	 * 4.9
	 * 修改个培训结果
	 * 
	 * @param 
	 * @return Request
	 * @author qjx
	 */
	@PostMapping("/modifyResult")
	public Result modifyResult(@RequestParam("id") Long id, 
			@RequestParam("trainingId") Long trainingId,
			@RequestParam("result") String result) {
		Boolean sign = staffTrainingService.modifyResult(id, trainingId, result);
		if (sign) {
			return Result.ok();
		}
		else {
			return Result.fail("该人员已离任");
		}
	}
	
	/**
	 * 4.10
	 * 
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("trainingId") Long trainingId) {
		staffTrainingService.deleteOne(trainingId);
		return Result.ok();
	}
	
	/**
	 * 4.11
	 * 删除单个人员的培训结果
	 * method:POST
	 * 
	 * @param Map
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteTrainingPeople")
	public Result deleteTrainingPeople(@RequestParam Map<String,String> params) {
		int sign = staffTrainingService.deleteTrainingPeople(params);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
}
