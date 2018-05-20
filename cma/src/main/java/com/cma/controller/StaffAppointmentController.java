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

import com.cma.pojo.StaffAppointment;
import com.cma.pojo.StaffAppointmentParam;
import com.cma.service.StaffAppointmentService;

/**
 * 3.1.12 人员管理
 * ——岗位资质和授权管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("/StaffAppointment")
public class StaffAppointmentController {
	
	@Autowired
	StaffAppointmentService staffAppointmentService;
	
	/**
	 * 获取全部被授权人信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffAppointment>
	 */
	@GetMapping("/getAll")
	public List<StaffAppointment> getAll() {
		return staffAppointmentService.getAllInformation();
	}
	
	/**
	 * 添加被授权人信息
	 * method: POST
	 * 
	 * @param StaffAppointment
	 * @return String
	 */
	@PostMapping("/addStaff")
	public String addStaff(@RequestBody StaffAppointment staffAppointment) {
		if (staffAppointment != null) {
			staffAppointmentService.addStaff(staffAppointment);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 修改被授权人信息
	 * method: POST
	 * 
	 * @param name StaffAppointment
	 * @return String
	 */
	@PostMapping("/modify")
	public String modify(@RequestBody StaffAppointmentParam staffAppointmentParam) {
		if (staffAppointmentParam != null) {
			staffAppointmentService.modify(staffAppointmentParam);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 查询被授权人信息
	 * method: GET
	 * 
	 * @param name
	 * @return List<StaffAppointment>
	 */
	@GetMapping("/querybyname")
	public List<StaffAppointment> querybyname(@RequestParam("name") String staffName) {
		return staffAppointmentService.queryByName(staffName);
	}
	
	/**
	 * 删除被授权人信息
	 * method: GET
	 * 
	 * @param name
	 * @return String
	 */
	@PostMapping("/delete")
	public String delete(@RequestBody Map<String, String> param) {
		staffAppointmentService.delete(param.get("name"));
		return "Success";
	}
}
