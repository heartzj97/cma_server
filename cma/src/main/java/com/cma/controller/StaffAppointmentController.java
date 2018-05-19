package com.cma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffAppointment;

/**
 * 3.1.12 人员管理
 * ——岗位资质和授权管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("/StaffAppointment")
public class StaffAppointmentController {
	/**
	 * 获取全部被授权人信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffAppointment>
	 */
	@RequestMapping("/getAll")
	public List<StaffAppointment> getAll() {
		return null;
	}
	
	/**
	 * 添加被授权人信息
	 * method: POST
	 * 
	 * @param StaffAppointment
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff() {
		return null;
	}
	
	/**
	 * 修改被授权人信息
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
	 * 查询被授权人信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffAppointment>
	 */
	@RequestMapping("/querybyname")
	public List<StaffAppointment> querybyname() {
		return null;
	}
	
	/**
	 * 删除被授权人信息
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
