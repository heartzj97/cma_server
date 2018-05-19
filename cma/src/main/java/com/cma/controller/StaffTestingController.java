package com.cma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffTraining;

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
	@RequestMapping("/getAll")
	public List<StaffTraining> getAll() {
		return null;
	}
	
	/**
	 * 添加人员考核信息
	 * method: POST
	 * 
	 * @param StaffTesting
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff() {
		return null;
	}
	
	/**
	 * 修改人员考核信息
	 * method: POST
	 * 
	 * @param 
	 * @return String
	 */
	@RequestMapping("/modify")
	public String modify() {
		return null;
	}
	
	/**
	 * 查询人员考核信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffTesting>
	 */
	@RequestMapping("/querybyname")
	public List<StaffTraining> querybyname() {
		return null;
	}
	
	/**
	 * 删除人员考核信息
	 * method: GET
	 * 
	 * @param String
	 * @return String
	 */
	@RequestMapping("/delete")
	public String delete() {
		return null;
	}
}
