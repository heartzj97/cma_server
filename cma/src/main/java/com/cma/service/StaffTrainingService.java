package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.StaffTrainingMapper;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingExample;
import com.cma.pojo.StaffTrainingParam;
import com.cma.pojo.StaffTrainingExample.Criteria;



@Service
public class StaffTrainingService {
	@Autowired
	private StaffTrainingMapper staffTrainingMapper;
	
	public List<StaffTraining> getAllInformation() {
		return staffTrainingMapper.selectAll();
	}
	
	public void addStaff(StaffTraining staffTraining) {
		staffTrainingMapper.insert(staffTraining);
	}
	
	public void delete(String staffName) {
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		staffTrainingMapper.deleteByExample(staffTrainingExample);
	}
	
	public void modify(StaffTrainingParam staffTrainingParam) {
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andNameEqualTo(staffTrainingParam.getName());
		staffTrainingMapper.updateByExample(staffTrainingParam.getStaffTraining(), staffTrainingExample);
	}
	
	public StaffTraining queryByName(String staffName) {
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andNameEqualTo(staffName);
		return staffTrainingMapper.selectOneByExample(staffTrainingExample);
	}
}
