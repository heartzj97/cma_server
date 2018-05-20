package com.cma.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileParam;
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
	@RequestMapping(value="/addStaff", method=RequestMethod.POST)
	public String addStaff(StaffFile staffFile) {
		if (staffFile != null) {
			staffFileService.addStaff(staffFile);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 获取人员图片
	 * method: GET
	 * 
	 * @param null
	 * @return String
	 */
	public String getStaffPicture() {
		return null;
	}
	
	
	/**
	 * 添加人员图片
	 * method: GET
	 * 
	 * @param StaffFile
	 * @return String
	 */
	@RequestMapping("/addPicture")
	public String addStaffPicture(@RequestParam("picture") MultipartFile picture) {
		if (!picture.isEmpty()) {      
            try {     
                BufferedOutputStream out = new BufferedOutputStream(      
                        new FileOutputStream(new File(      
                                picture.getOriginalFilename())));      
                System.out.println(picture.getName());    
                out.write(picture.getBytes());      
                out.flush();      
                out.close();  
            } catch (FileNotFoundException e) {      
                e.printStackTrace();      
                return "Fail" + e.getMessage();      
            } catch (IOException e) {      
                e.printStackTrace();      
                return "Fail" + e.getMessage();      
            }     
            return "Success";      
      
        } else {      
            return "Fail";      
        }      
	}
	
	/**
	 * 修改指定人员
	 * method: POST
	 * 
	 * @param name StaffFile
	 * @return String
	 */
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(@RequestBody StaffFileParam staffFileParam) {
		if (staffFileParam != null) {
			staffFileService.modify(staffFileParam);
			return "Success";
		}
		else {
			return "Fail";
		}
	}
	
	/**
	 * 删除指定人员
	 * method: POST
	 * 
	 * @param name
	 * @return String
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(@RequestParam("name") String staffName) {
		 staffFileService.delete(staffName);
		 return "Success";
	}
	
	/**
	 * 查询指定人员
	 * method: GET
	 * 
	 * @param name
	 * @return StaffFile
	 */
	@RequestMapping("/querybyname")
	public StaffFile queryByName(@PathVariable("name") String staffName) {
		return staffFileService.queryByName(staffName);
	}
	
	
}
