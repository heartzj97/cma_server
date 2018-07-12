package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.StaffFileMapper;
import com.cma.dao.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffExample;
import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileExample;
import com.cma.pojo.StaffFileExample.Criteria;
import com.cma.pojo.StaffFileGetOneParam;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class StaffFileService {
	
	@Autowired
	private StaffFileMapper staffFileMapper;
	
	@Autowired
	private StaffMapper staffMapper;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/staff_image/";
	
	/**
	 * 2.1
	 * 获取全部人员档案信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 * @throws JSONException 
	 */
	public List<Map<String, Object>> getAll() {
		List<Staff> staffs = staffMapper.selectAll();
		List<StaffFile> staffFiles = staffFileMapper.selectAll();
		List<Map<String, Object>> res = new ArrayList<Map<String, Object>>();
		
		for (int i = 0; i < staffFiles.size(); i++) {
			StaffFile staffFile = staffFiles.get(i);
			if (staffFile.getUserId() != null) {
				for (int j = 0; j < staffs.size(); j++) {
					Staff staff = staffs.get(j);
					if (staff.getId() == staffFile.getUserId()) {
						Map<String, Object> data = new HashMap<String, Object>();
						data.put("id", staff.getId());
						data.put("name", staff.getName());	
						data.put("department", staff.getDepartment());
						data.put("position", staff.getPosition());
						data.put("fileId", staffFile.getFileId());
						data.put("fileLocation", staffFile.getFileLocation());
						data.put("fileImage", staffFile.getFileImage());
						res.add(data);
					}
				}
			}
		}		
		return res;
	}
	
	//2.2
	public StaffFileGetOneParam getOne(Long id) {
		StaffFileGetOneParam staffFileGetOneParam = new StaffFileGetOneParam();
		StaffFile staffFlie = new StaffFile();
		Staff staff = new Staff();
		
		StaffFileExample staffFileExample = new StaffFileExample();
		StaffFileExample.Criteria criteria1 = staffFileExample.createCriteria();
		criteria1.andUserIdEqualTo(id);
		staffFlie = staffFileMapper.selectOneByExample(staffFileExample);
		
		StaffExample staffExample = new StaffExample();
		StaffExample.Criteria criteria2 = staffExample.createCriteria();
		criteria2.andIdEqualTo(id);
		staff = staffMapper.selectOneByExample(staffExample);
		
		staffFileGetOneParam.setId(staff.getId());
		staffFileGetOneParam.setName(staff.getName());
		if (staffFlie != null) {
			staffFileGetOneParam.setFileId(staffFlie.getFileId());
			staffFileGetOneParam.setFileLocation(staffFlie.getFileLocation());
			staffFileGetOneParam.setFileImage(staffFlie.getFileImage());
			return staffFileGetOneParam;
		}
		else {
			return null;
		}		
	}
	
	//2.3
	public Boolean addOne(Long id ,String fileId ,String fileLocation ,MultipartFile picture) throws IllegalStateException, IOException {
		StaffFile staffFile = new StaffFile();
		staffFile.setUserId(id);
		staffFile.setFileId(fileId);
		
		if (fileLocation != null) {
			staffFile.setFileLocation(fileLocation);
		}
		if(picture != null) {
			staffFile.setFileImage(picture.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + picture.getOriginalFilename());
			picture.transferTo(dest);
			
		}	
		staffFileMapper.insertSelective(staffFile);
		return true;
	}
	
	//2.4
	public void deleteOne(Long value) {
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andUserIdEqualTo(value);
		
		StaffFile staffFile = staffFileMapper.selectOneByExample(staffFileExample);
		String image = staffFile.getFileImage() ;
		if (image != null) {
			File file = new File(PIC_PATH_LIN + image);
			file.delete();
		}
		
		staffFileMapper.deleteByExample(staffFileExample);
	}
	
	/**
	 * 2.5
	 * 修改单个人员档案信息
	 * 
	 * @param 
	 * @return Result
	 * @author qjx
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public Boolean modifyOne(Long id, String fileId, String fileLocation, MultipartFile picture) throws IllegalStateException, IOException {
		
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		
		StaffFile staffFile = new StaffFile();
		staffFile.setUserId(id);
		if (fileId != null) {
			staffFile.setFileId(fileId);
		}
		if (fileLocation != null) {
			staffFile.setFileLocation(fileLocation);
		}
		if (picture != null) {
			staffFile.setFileImage(picture.getOriginalFilename());
			StaffFile staffFile2 = staffFileMapper.selectOneByExample(staffFileExample);
			String image = staffFile2.getFileImage() ;
			if (image != null) {
				File file = new File(PIC_PATH_LIN + image);
				file.delete();
			}
			File dest = new File(PIC_PATH_LIN + picture.getOriginalFilename());
			picture.transferTo(dest);
			
		}
		
		
		staffFileMapper.updateByExampleSelective(staffFile, staffFileExample);
		return true;
	}
	
	//2.6
	public ResponseEntity<InputStreamResource> getImage(Long value) throws UnsupportedEncodingException {
		
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andUserIdEqualTo(value);
		StaffFile find = staffFileMapper.selectOneByExample(staffFileExample);
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + find.getFileImage()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(find.getFileImage().getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+fileName);
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
		
	}
}
