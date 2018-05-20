package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingParam;
import com.cma.service.StaffTrainingService;

/**
 * 3.1.12 人员管理
 * ——人员培训管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("/StaffTraining")
public class StaffTrainingController {
	/**
	 * 获取全部人员培训信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffTraining>
	 */
	
	@Autowired
	StaffTrainingService staffTrainingService;
	
	@RequestMapping("/getAll")
	public List<StaffTraining> getAll() {
		return staffTrainingService.getAllInformation();
	}
	
	/**
	 * 添加人员培训信息
	 * method: POST
	 * 
	 * @param StaffTraining
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff(@RequestBody StaffTraining staffTraining) {
		if (staffTraining != null) {
			staffTrainingService.addStaff(staffTraining);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 修改人员培训信息
	 * method: POST
	 * 
	 * @param 
	 * @return String
	 */
	@RequestMapping("/modify")
	public String modify(@RequestBody StaffTrainingParam staffTrainingParam) {
		if (staffTrainingParam != null) {
			staffTrainingService.modify(staffTrainingParam);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 查询人员培训信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffTraining>
	 */
	@RequestMapping("/querybyname")
	public StaffTraining querybyname(@RequestParam("name") String staffName) {
		return staffTrainingService.queryByName(staffName);
	}
	
	/**
	 * 删除人员培训信息
	 * method: GET
	 * 
	 * @param StaffTraining
	 * @return String
	 */
	@RequestMapping("/delete")
	public String delete(@RequestBody Map<String, String> param) {
		 staffTrainingService.delete(param.get("name"));
		 return "Success";
	}
}
