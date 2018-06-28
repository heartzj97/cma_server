package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.EquipmentUseMapper;
import com.cma.pojo.Equipment;
import com.cma.pojo.EquipmentUse;
import com.cma.pojo.EquipmentUseExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EquipmentUseService {

	@Autowired
	EquipmentUseMapper equipmentUseMapper;
	
	@Autowired
	EquipmentService equipmentService;
	
	public List<EquipmentUse> getAll() {
		return equipmentUseMapper.selectAll();
	}

	public EquipmentUse getOne(Long value) {
		return equipmentUseMapper.selectByPrimaryKey(value);
	}

	public boolean addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentUse equipmentUse = objectMapper.convertValue(params, EquipmentUse.class);	
		Long equipmentId = equipmentUse.getEquipmentId();
		Equipment equipment = equipmentService.getOne(equipmentId);
		if(equipment.getState()==0)
			return false;
		else {
			equipmentUseMapper.insert(equipmentUse);
			return true;
		}
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentUse equipmentUse = objectMapper.convertValue(params, EquipmentUse.class);
		return equipmentUseMapper.updateByPrimaryKeySelective(equipmentUse);
	}

	public void deleteOne(Long value) {
		equipmentUseMapper.deleteByPrimaryKey(value);		
	}

	public List<EquipmentUse> getAllByEquipmentId(Long value) {
		EquipmentUseExample equipmentUseExample = new EquipmentUseExample();
		EquipmentUseExample.Criteria criteria =  equipmentUseExample.createCriteria();
		criteria.andEquipmentIdEqualTo(value);
		return equipmentUseMapper.selectByExample(equipmentUseExample);		
	}
	
}
