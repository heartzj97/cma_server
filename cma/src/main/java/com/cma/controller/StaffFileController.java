package com.cma.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	public static final String PIC_PATH = "D:\\Git\\Project\\private\\";
	
	@javax.annotation.Resource
	private ResourceLoader resourceLoader;
	
	@Autowired
	StaffFileService staffFileService;
	
	/**
	 * 获取全部人员信息
	 * method: GET
	 * 
	 * @param null
	 * @return List<StaffFile>
	 */
	@GetMapping("/getAll")
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
	@GetMapping("/getAllwithoutpics")
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
	@PostMapping("/addStaff")
	public String addStaff(@RequestBody StaffFile staffFile) {
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
	@GetMapping("/getStaffPicture/{pictureName:.+}") 
	@ResponseBody
	public ResponseEntity<?> getStaffPicture(@PathVariable String pictureName) {
		try {
			//InputStream inputStream = new FileInputStream(new File(PIC_PATH + pictureName));
			//InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			Resource body = resourceLoader.getResource(Paths.get("file:" + PIC_PATH + pictureName).toString());
			headers.add("Content-Type", "image/jped");
			ResponseEntity<Resource> response = new ResponseEntity<Resource>(body, headers, HttpStatus.OK);
			
			return response;//new ResponseEntity<>(inputStreamResource, headers, HttpStatus.OK);
			//return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(PIC_PATH + pictureName).toString()));
		} catch (Exception e) {  
			return ResponseEntity.notFound().build();  
		}
	}
	
	
	/**
	 * 添加人员图片
	 * method: GET
	 * 
	 * @param StaffFile
	 * @return String
	 */
	@GetMapping("/addPicture")
	public String addStaffPicture(@RequestParam("picture") MultipartFile picture) {
		if (!picture.isEmpty()) {      
            try {     
                File dest = new File(PIC_PATH + picture.getOriginalFilename());

                picture.transferTo(dest);
                
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
	@PostMapping("/modify")
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
	@PostMapping("/delete")
	public String delete(@RequestBody Map<String, String> param) {
		 staffFileService.delete(param.get("name"));
		 return "Success";
	}
	
	/**
	 * 查询指定人员
	 * method: GET
	 * 
	 * @param name
	 * @return StaffFile
	 */
	@GetMapping("/querybyname")
	public StaffFile queryByName(@RequestParam("name") String staffName) {
		return staffFileService.queryByName(staffName);
	}
	
	
}
