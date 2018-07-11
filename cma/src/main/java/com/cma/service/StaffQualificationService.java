package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.StaffQualificationMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffQualification;
import com.cma.pojo.StaffQualificationExample;
import com.cma.pojo.StaffQualificationExample.Criteria;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffQualificationService {
	
	@Autowired
	private StaffQualificationMapper staffQualificationMapper;
	
	@Autowired
	StaffManagementService staffManagementService;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/qualification/";
	
	//5.1
	public List<Map<String,Object>> getAllByStaff(Long userId) {
		Map<String,Object> res = new HashMap<String,Object>();
		List<Map<String,Object>> resList = new ArrayList<Map<String,Object>>();
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<StaffQualification> staffQualificationList = staffQualificationMapper.selectByExample(staffQualificationExample);
		Iterator<StaffQualification> iter = staffQualificationList.iterator();
		while(iter.hasNext()) {
			StaffQualification staffQualification = iter.next();
			res.put("qualificationId",staffQualification.getQualificationId());
			res.put("qualificationName",staffQualification.getQualificationName());
			resList.add(res);
			res = new HashMap<String,Object>();
		}
		return resList;
	}
	
	//5.2
	public int addOne( Long id, String qualificationName, MultipartFile picture) throws IllegalStateException, IOException {
		
		
		
		StaffQualification staffQualification = new StaffQualification();
		
		staffQualification.setUserId(id);
		staffQualification.setQualificationName(qualificationName);
		
		if (picture != null) {
			File dest = new File(PIC_PATH_LIN + picture.getOriginalFilename());
			picture.transferTo(dest);
			staffQualification.setQualificationImage(picture.getOriginalFilename());
		}
		
		staffQualificationMapper.insertSelective(staffQualification);
		
		return 1;
	}
	
	public void deleteOne(Long value) {
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andQualificationIdEqualTo(value);
		staffQualificationMapper.deleteByExample(staffQualificationExample);
	}
	
	public boolean modifyOne(Map<String,String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		StaffQualification staffQualification = objectMapper.convertValue(params, StaffQualification.class);
		
		Long value = staffQualification.getQualificationId();
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andQualificationIdEqualTo(value);
		StaffQualification find =  staffQualificationMapper.selectOneByExample(staffQualificationExample);
		
		Long user_id = find.getUserId();
		Staff staff = staffManagementService.queryById(user_id);
		if(staff.getIsLeaving()==1) {
			return false;
		}
		
		staffQualificationMapper.updateByPrimaryKeySelective(staffQualification);
		return true;
	}
	
	//5.5
	public ResponseEntity<InputStreamResource> getImage(Long value) {
		StaffQualificationExample staffQualificationExample = new StaffQualificationExample();
		Criteria criteria = staffQualificationExample.createCriteria();
		criteria.andQualificationIdEqualTo(value);
		StaffQualification find =  staffQualificationMapper.selectOneByExample(staffQualificationExample);
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + find.getQualificationImage()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "image/jped");
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
		
		
	}
	
	//5.6
	public List<Map<String, Object>> getAll() {
		Map<String, Object> res = new HashMap<String, Object>();
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		
		List<StaffQualification> list = new ArrayList<StaffQualification>();
		list = staffQualificationMapper.selectAll();
		
		for (int i = 0;i < list.size();i++) {
			Long userId = list.get(i).getUserId();
			Staff staff = staffManagementService.queryById(userId);
			res.put("id", staff.getId());
			res.put("name", staff.getName());
			res.put("department", staff.getDepartment());
			res.put("position", staff.getPosition());
			res.put("qualificationId", list.get(i).getQualificationId());
			res.put("qualificationName", list.get(i).getQualificationName());
			resList.add(res);
			res = new HashMap<String, Object>();
		}
		
		return resList;
	}

	public Map<String, Object> getOne(Long value) {
		StaffQualification staffQualification = staffQualificationMapper.selectByPrimaryKey(value);
		Long userId = staffQualification.getUserId();
		Staff staff = staffManagementService.queryById(userId);
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("id",staff.getId());
		res.put("name", staff.getName());
		res.put("department", staff.getDepartment());
		res.put("position", staff.getPosition());
		res.put("qualificationId", staffQualification.getQualificationId());
		res.put("qualificationName", staffQualification.getQualificationName());
		res.put("qualificationImage", staffQualification.getQualificationImage());
		return res;
	}

}
