package com.cma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffTraining;

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
	@RequestMapping("/getAll")
	public List<StaffTraining> getAll() {
		return null;
	}
	
	/**
	 * 添加人员培训信息
	 * method: POST
	 * 
	 * @param StaffTraining
	 * @return null
	 */
	@RequestMapping("/addStaff")
	public void addStaff() {
		
	}
	
	/**
	 * 修改人员培训信息
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
	 * 查询人员培训信息
	 * method: GET
	 * 
	 * @param 
	 * @return List<StaffTraining>
	 */
	@RequestMapping("/querybyname")
	public List<StaffTraining> querybyname() {
		return null;
	}
	
	/**
	 * 删除人员培训信息
	 * method: GET
	 * 
	 * @param StaffTraining
	 * @return String
	 */
	@RequestMapping("/delete")
	public String delete() {
		return null;
	}
}
