package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffResigning;
import com.cma.pojo.StaffResigningParam;
import com.cma.service.StaffResigningService;

/**
 * 3.1.12 人员管理
 * ——离任人员管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("/StaffResigning")
public class StaffResigningController {
	/**
	 * 获取全部离任人员信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffResigning>
	 */
	@Autowired
	StaffResigningService staffResigningService;
	
	@RequestMapping("/getAll")
	public List<StaffResigning> getAll() {
		return staffResigningService.getAllInformation();
	}
	
	/**
	 * 添加离任人员信息
	 * method: POST
	 * 
	 * @param StaffResigning
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff(@RequestBody StaffResigning staffResigning) {
		if (staffResigning != null) {
			staffResigningService.addStaff(staffResigning);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 修改离任人员信息
	 * method: POST
	 * 
	 * @param 
	 * @return String
	 */
	@RequestMapping("/modify")
	public String modify(@RequestBody StaffResigningParam staffResigningParam) {
		if (staffResigningParam != null) {
			staffResigningService.modify(staffResigningParam);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 查询离任人员信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffResigning>
	 */
	@RequestMapping("/querybyname")
	public StaffResigning querybyname(@RequestParam("name") String staffName) {
		return staffResigningService.queryByName(staffName);
	}
	
	/**
	 * 删除离任人员信息
	 * method: GET
	 * 
	 * @param String
	 * @return String
	 */
	@RequestMapping("/delete")
	public String delete(@RequestBody Map<String, String> param) {
		staffResigningService.delete(param.get("name"));
		 return "Success";
	}
}
