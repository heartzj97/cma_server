package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.EquipmentMaintenanceMapper;
import com.cma.pojo.Equipment;
import com.cma.pojo.EquipmentMaintenance;
import com.cma.pojo.EquipmentMaintenanceExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EquipmentMaintenanceService {

	@Autowired
	EquipmentMaintenanceMapper equipmentMaintenanceMapper;
	
	@Autowired
	EquipmentService equipmentService;
	
	public List<EquipmentMaintenance> getAll() {
		return equipmentMaintenanceMapper.selectAll();
	}

	public EquipmentMaintenance getOne(Long value) {
		return equipmentMaintenanceMapper.selectByPrimaryKey(value);
	}

	public boolean addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentMaintenance equipmentMaintenance = objectMapper.convertValue(params, EquipmentMaintenance.class);
		Long equipmentId = equipmentMaintenance.getEquipmentId();
		Equipment equipment = equipmentService.getOne(equipmentId);
		if(equipment.getState()==0)
			return false;
		else {
			equipmentMaintenanceMapper.insert(equipmentMaintenance);
			return true;
		}
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentMaintenance equipmentMaintenance = objectMapper.convertValue(params, EquipmentMaintenance.class);
		return equipmentMaintenanceMapper.updateByPrimaryKeySelective(equipmentMaintenance);
	}

	public void deleteOne(Long value) {
		equipmentMaintenanceMapper.deleteByPrimaryKey(value);		
	}

	public List<EquipmentMaintenance> getAllByEquipmentId(Long value) {
		EquipmentMaintenanceExample equipmentMaintenanceExample = new EquipmentMaintenanceExample();
		EquipmentMaintenanceExample.Criteria criteria =  equipmentMaintenanceExample.createCriteria();
		criteria.andEquipmentIdEqualTo(value);
		return equipmentMaintenanceMapper.selectByExample(equipmentMaintenanceExample);		
	}
	
}
