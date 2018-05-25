package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffTesting;
import com.cma.pojo.StaffTestingParam;
import com.cma.service.StaffTestingService;

/**
 * 3.1.12 人员管理
 * ——人员测试管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("/StaffTesting")
public class StaffTestingController {
	/**
	 * 获取全部人员考核信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffTesting>
	 */
	@Autowired
	StaffTestingService staffTestingService;	
	
	@RequestMapping("/getAll")
	public List<StaffTesting> getAll() {
		return staffTestingService.getAllInformation();
	}
	
	/**
	 * 添加人员考核信息
	 * method: POST
	 * 
	 * @param StaffTesting
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff(@RequestBody StaffTesting staffTesting) {
		if (staffTesting != null) {
			staffTestingService.addStaff(staffTesting);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 修改人员考核信息
	 * method: POST
	 * 
	 * @param 
	 * @return String
	 */
	@RequestMapping("/modify")
	public String modify(@RequestBody StaffTestingParam staffTestingParam) {
		if (staffTestingParam != null) {
			staffTestingService.modify(staffTestingParam);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 查询人员考核信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffTesting>
	 */
	@RequestMapping("/querybyname")
	public StaffTesting querybyname(@RequestParam("name") String staffName) {
		return staffTestingService.queryByName(staffName);
	}
	
	/**
	 * 删除人员考核信息
	 * method: GET
	 * 
	 * @param String
	 * @return String
	 */
	@RequestMapping("/delete")
	public String delete(@RequestBody Map<String, String> param) {
		staffTestingService.delete(param.get("name"));
		 return "Success";
	}
}
