package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.EquipmentApplicationMapper;
import com.cma.pojo.EquipmentApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EquipmentApplicationService {

	@Autowired
	EquipmentApplicationMapper equipmentApplicationMapper;
	
	public List<EquipmentApplication> getAll() {
		return equipmentApplicationMapper.selectAll();
	}

	public EquipmentApplication getOne(Long value) {
		return equipmentApplicationMapper.selectByPrimaryKey(value);
	}

	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentApplication equipmentApplication = objectMapper.convertValue(params, EquipmentApplication.class);		
		equipmentApplicationMapper.insertSelective(equipmentApplication);
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentApplication equipmentApplication = objectMapper.convertValue(params, EquipmentApplication.class);
		return equipmentApplicationMapper.updateByPrimaryKeySelective(equipmentApplication);
	}

	public void deleteOne(Long value) {
		equipmentApplicationMapper.deleteByPrimaryKey(value);		
	}

}
