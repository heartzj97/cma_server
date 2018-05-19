package com.cma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffResigning;

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
	@RequestMapping("/getAll")
	public List<StaffResigning> getAll() {
		return null;
	}
	
	/**
	 * 添加离任人员信息
	 * method: POST
	 * 
	 * @param StaffResigning
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff() {
		return null;
	}
	
	/**
	 * 修改离任人员信息
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
	 * 查询离任人员信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffResigning>
	 */
	@RequestMapping("/querybyname")
	public List<StaffResigning> querybyname() {
		return null;
	}
	
	/**
	 * 删除离任人员信息
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
