package com.cma.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.Result;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingResult;
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
	public Result getTrainingPeople(Long trainingId) throws JsonProcessingException {
		//Todo:这个地方需要用到StaffTrainingResult，将staffTraining和staff表做级联，以实现培训和人员的一对多关系；
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingService.getAllByTraining(trainingId);
		Map<Long,String> map = new HashMap<Long,String>();
		Iterator<StaffTrainingResult> iter = staffTrainingResultList.iterator();
		while(iter.hasNext()) {
			map.put(iter.next().getstaff().getId(), iter.next().getstaff().getName());
		}
		return Result.ok(map);
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
	public Result getAllByStaff(Long userId) throws JsonProcessingException {
		//Todo:做级联的时候有问题，包括4.2也一样，如果把这个功能直接放在StaffTrainingResult中会好写一点？？？
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingService.getAllByStaff(userId);
		List<StaffTraining> staffTrainingList = new ArrayList();
		Iterator<StaffTrainingResult> iter = staffTrainingResultList.iterator();
		while(iter.hasNext()) {
			staffTrainingList.add(iter.next().getstaffTraining());
		}
		return Result.ok(staffTrainingList);
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
	/**
	 * FIX ME 
	 */
	@PostMapping("/addTrainingPeople")
	public Result addTrainingPeople(@RequestParam Map<String, String> params) {
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
