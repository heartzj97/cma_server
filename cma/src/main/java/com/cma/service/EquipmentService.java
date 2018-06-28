package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.EquipmentMapper;
import com.cma.pojo.Equipment;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EquipmentService {

	@Autowired
	EquipmentMapper equipmentMapper;
	
	public List<Equipment> getAll() {
		return equipmentMapper.selectAll();
	}

	public Equipment getOne(Long value) {
		return equipmentMapper.selectByPrimaryKey(value);
	}

	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		Equipment equipment = objectMapper.convertValue(params, Equipment.class);
		equipment.setState((byte) 0);		
		equipmentMapper.insert(equipment);
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		Equipment equipment = objectMapper.convertValue(params, Equipment.class);
		return equipmentMapper.updateByPrimaryKeySelective(equipment);
	}

	public void deleteOne(Long value) {
		equipmentMapper.deleteByPrimaryKey(value);		
	}
	

}
