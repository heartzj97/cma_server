package com.cma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.StaffFile;
import com.cma.service.StaffFileService;

/**
 * 3.1.12 人员管理
 * ——人员档案管理
 * 
 * @version V1.0.0
 */
@RestController
@RequestMapping("StaffFile")
public class StaffFileController {
	
	@Autowired
	StaffFileService staffFileService;
	
	/**
	 * 获取全部人员信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffFile>
	 */
	@RequestMapping("/getAll")
	public List<StaffFile> getAll() {
		return staffFileService.getAllInformation();
	}
	
	/**
	 * 获取全部人员信息(不含图片)
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffFile>
	 */
	@RequestMapping("/getAllwithoutpics")
	public List<StaffFile> getAllInformation() {
		return staffFileService.getAllInformation();
	}

	/**
	 * 添加人员的个人信息
	 * method: POST
	 * 
	 * @param StaffFile
	 * @return String
	 */
	@RequestMapping("/addStaff")
	public String addStaff(StaffFile staffFile) {
		if (staffFile != null) {
			
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 查询指定人员
	 * method: GET
	 * 
	 * @param name
	 * @return StaffFile
	 */
	@RequestMapping(value="/querybyname/{name}", method=RequestMethod.GET)
	public StaffFile queryByName(@PathVariable String staffName) {
		
		return null;
	}

}
