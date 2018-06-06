package com.cma.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.pojo.Result;
import com.cma.service.StaffQualificationService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/StaffQualification")
public class StaffQualificationController {
	@Autowired
	StaffQualificationService staffQualificationService;
	
	//public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/staff_picture/";
	
	/**
	 * 5.1 
	 * 鑾峰彇鏌愬憳宸ュ叏閮ㄥ煿璁俊鎭�
	 * @param id
	 * @return Result
	 * @author nx
	 */
	@GetMapping("/getAllByStaff")
	public Result getAllByStaff(@RequestParam Long id) throws JsonProcessingException {
		List<Map<String,Object>> data = staffQualificationService.getAllByStaff(id);
		//List<StaffQualification> data = staffQualificationService.getAllByStaff(userId);
		return Result.ok(data);
	}
	/**
	 * 5.2
	 * 添加某个人员资质认定信息
	 * @param StaffQualification
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam("id") Long id, @RequestParam("qualificationName") String qualificationName,
			@RequestParam("qualificationImage") MultipartFile picture) throws IllegalStateException, IOException {
		int sign = staffQualificationService.addOne(id,qualificationName,picture);
		if (sign == 1) {
			return Result.ok();
		}
		else {
			return Result.fail("添加失败！");
		}
	}
	
	/**
	 * 5.3 
	 * 删除某个人员资质认定信息
	 * @param qualificationId
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("qualificationId") Long value) {
		staffQualificationService.deleteOne(value);
		return Result.ok();
	}
	
	/**
	 * 5.4
	 * 修改某个人员资质认定信息
	 * @param params
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String,String> params) {
		boolean sign = staffQualificationService.modifyOne(params);
		if(sign) {
			return Result.ok();
		}
		else {
			return Result.fail("离任人员不能修改");
		}
	}
	
	/**
	 * 5.5
	 * 获取某个人员资质认定扫描件
	 * @param Long
	 * @return Result
	 * @author Fu
	 */

	@GetMapping("/getImage")
	public ResponseEntity<InputStreamResource> getImage(@RequestParam("qualificationId") Long value) {
		ResponseEntity<InputStreamResource> data = staffQualificationService.getImage(value);
		return data;
		
	}
	
	
	/**	
	 * 5.6
	 * 获取培训信息
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<Map<String, Object>> data = staffQualificationService.getAll();
		return Result.ok(data);
	}
}
