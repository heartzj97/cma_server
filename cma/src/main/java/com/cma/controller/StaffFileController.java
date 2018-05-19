package com.cma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffFile;

/**
 * 3.1.12 人员管理
 * ——人员档案管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("/StaffFile")
public class StaffFileController {
	
	/**
	 * 获取全部人员信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffFile>
	 */
	public List<StaffFile> getAll() {
		return null;
	}
	
	/**
	 * 获取全部人员信息(不含图片)
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffFile>
	 */
	public List<StaffFile> getAllwithoutpics() {
		return null;
	}

	/**
	 * 添加人员的个人信息
	 * method: GET
	 * 
	 * @param null
	 * @return String
	 */
	public String addStaff() {
		return null;
	}
	
	
}
