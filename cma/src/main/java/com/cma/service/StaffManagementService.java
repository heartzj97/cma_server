package com.cma.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffFileMapper;
import com.cma.mapper.StaffMapper;
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
	public List<Staff> getAllInformation() {
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
	public List<Map<Long,String>> getAllNoFile() {
		List<Staff> list1 = new ArrayList<Staff>();
		List<Map<Long,String>> list2 = new ArrayList<Map<Long,String>>();
		List<StaffFile> fileList = new ArrayList<StaffFile>();
		list1 = staffMapper.selectAll();
		fileList = staffFileMapper.selectAll();
		for (int i = 0;i < list1.size();i++) {
			Long userId = list1.get(i).getId();
			int j = 0;
			for (;j < fileList.size();j++) {
				if (fileList.get(j).getUserId() == userId)
					break;
			}
			if (j == fileList.size()) {
				Map<Long,String> map = new HashMap<Long,String>();
				map.put(list1.get(i).getId(),list1.get(i).getName());
				list2.add(map);
			}
		}
		return list2;
	}
	
	//1.3
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		Staff staff = objectMapper.convertValue(params, Staff.class);
		staff.setIsLeaving((byte)0);
		staffMapper.insert(staff);
	}
}