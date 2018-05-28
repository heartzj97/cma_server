package com.cma.service;

import java.util.List;
import java.util.Map;

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

@Service
public class StaffFileService {
	
	@Autowired
	private StaffFileMapper staffFileMapper;
	
	@Autowired
	private StaffMapper staffMapper;
	
	/**
	 * 获取全部人员档案信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author qjx
	 */
	public List<StaffFile> getAll() {
		List<StaffFile> res = null;
		res = staffFileMapper.selectAll();
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
		}
		
		
		return staffFileGetOneParam;
	}
	
	//2.3
	public void addOne(Map<String, String> request) {
		StaffFile staffFile = null;
		staffFileMapper.insert(staffFile);
	}
	
	//2.4
	public void delete(Long value) {
		StaffFileExample staffFileExample = new StaffFileExample();
		Criteria criteria = staffFileExample.createCriteria();
		criteria.andFileIdEqualTo(getOne(value).getFileId());       //将user_id转化为file_id
		staffFileMapper.deleteByExample(staffFileExample);
	}
	
	/**
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
