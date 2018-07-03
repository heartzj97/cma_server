package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.EquipmentReceiveMapper;
import com.cma.pojo.EquipmentReceive;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EquipmentReceiveService {

	@Autowired
	EquipmentReceiveMapper equipmentReceiveMapper;
	
	public List<EquipmentReceive> getAll() {
		return equipmentReceiveMapper.selectAll();
	}

	public EquipmentReceive getOne(Long value) {
		return equipmentReceiveMapper.selectByPrimaryKey(value);
	}

	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentReceive equipmentReceive = objectMapper.convertValue(params, EquipmentReceive.class);
		equipmentReceiveMapper.insert(equipmentReceive);
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentReceive equipmentReceive = objectMapper.convertValue(params, EquipmentReceive.class);
		return equipmentReceiveMapper.updateByPrimaryKeySelective(equipmentReceive);
	}

	public void deleteOne(Long value) {
		equipmentReceiveMapper.deleteByPrimaryKey(value);		
	}

}
