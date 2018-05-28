package com.cma.service;

import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.mapper.StaffMapper;
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
	public JSONArray getAll() throws JSONException {
		List<Staff> staffs = staffMapper.selectAll();
		List<StaffFile> staffFiles = staffFileMapper.selectAll();
		JSONArray res = new JSONArray();
		for (int i = 0; i < staffFiles.size(); i++) {
			StaffFile staffFile = staffFiles.get(i);
			if (staffFile.getUserId() != null) {
				for (int j = 0; j < staffs.size(); j++) {
					Staff staff = staffs.get(j);
					if (staff.getId() == staffFile.getUserId()) {
						JSONObject json = new JSONObject();
						json.put("id", staff.getId());
						json.put("name", staff.getName());	
						json.put("department", staff.getDepartment());
						json.put("position", staff.getPosition());
						json.put("fileId", staffFile.getFileId());
						json.put("fileLocation", staffFile.getFileLocation());
						if (staffFile.getFileImage() == null) {
							json.put("fileImage", (Object)null);
						}
						else {
							json.put("fileImage", staffFile.getFileImage());
						}
						res.put(json);
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
	public Boolean addOne(Map<String, String> params) {
		Long id = Long.getLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffFile staffFile = objectMapper.convertValue(params, StaffFile.class);
		staffFile.setUserId(id);
		if (staffFile.getFileId() == null) {
			return false;
		}
		else {
			staffFileMapper.insert(staffFile);
			return true;
		}	
	}
	
	//2.4
	public void deleteOne(Long value) {
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andUserIdEqualTo(value);
		staffFileMapper.deleteByExample(staffFileExample);
	}
	
	/**
	 * 2.5
	 * 修改单个人员档案信息
	 * 
	 * @param 
	 * @return Result
	 * @author qjx
	 */
	public Boolean modifyOne(Map<String, String> params) {
		StaffFile staffFile = null;
		Long id = 1l;
		/*
		Long id = (Long)params.get("id");
		if (id == null) {
			return false;
		}*/
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		staffFileMapper.updateByExample(staffFile, staffFileExample);
		return true;
	}
}
