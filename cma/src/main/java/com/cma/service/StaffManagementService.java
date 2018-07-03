package com.cma.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.StaffFileMapper;
import com.cma.dao.StaffMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffExample;
import com.cma.pojo.StaffExample.Criteria;
import com.cma.pojo.StaffFile;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffManagementService {
	@Autowired
	private StaffMapper staffMapper;
	
	@Autowired
	private StaffFileMapper staffFileMapper;
	
	/**
	 * 通过id查询人员
	 * 
	 * @param value
	 * @return
	 * @author qwl
	 */
	public Staff queryById(Long value) {
		StaffExample staffExample = new StaffExample();
		Criteria criteria = staffExample.createCriteria();
		criteria.andIdEqualTo(value);
		return staffMapper.selectOneByExample(staffExample);
	}
	
	/**
	 * 删除人员
	 * 
	 * @param value
	 * @author qwl
	 */
	public void delete(Long value) {
		StaffExample staffExample = new StaffExample();
		Criteria criteria = staffExample.createCriteria();
		criteria.andIdEqualTo(value);
		staffMapper.deleteByExample(staffExample);
	}
	
	//1.1
	public List<Staff> getAllNoLeaving() {
		StaffExample staffExample = new StaffExample();
		Criteria criteria = staffExample.createCriteria();
		criteria.andIsLeavingEqualTo((byte)0);
		return staffMapper.selectByExample(staffExample);
	}
	
	/**
	 * 1.5
	 * 修改单个人员
	 * 
	 * @param Map
	 * @return Result
	 * @author qjx
	 */
	public Boolean modifyOne(Map<String, String> params) {		
		ObjectMapper objectMapper = new ObjectMapper();
		Staff staff = objectMapper.convertValue(params, Staff.class);
		staffMapper.updateByPrimaryKeySelective(staff);
		return true;
	}
	
	//1.6
	public JSONArray getAllNoFile() throws JSONException {
		List<Staff> staffs = getAllNoLeaving();
		List<StaffFile> staffFiles = staffFileMapper.selectAll();
		ArrayList<Long> files = new ArrayList<Long>();
		for (StaffFile staffFile : staffFiles) {
			files.add(staffFile.getUserId());
		}
		JSONArray res = new JSONArray();
		for (Staff staff : staffs) {
			if (!files.contains(staff.getId())) {
				JSONObject json = new JSONObject();
				json.put("id", staff.getId());
				json.put("name", staff.getName());
				res.put(json);
			}
		}	
		return res;
	}
	
	//1.3
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		Staff staff = objectMapper.convertValue(params, Staff.class);
		staff.setIsLeaving((byte)0);
		staffMapper.insert(staff);
	}
}