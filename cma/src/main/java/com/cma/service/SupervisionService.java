package com.cma.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.mapper.SupervisionMapper;
import com.cma.pojo.Supervision;
import com.cma.pojo.SupervisionExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SupervisionService {
	
	@Autowired
	SupervisionMapper supervisionMapper;

	public List<Supervision> getAll() {
		List<Supervision> list = supervisionMapper.selectAll();
		return list;
	}

	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		Supervision supervision = objectMapper.convertValue(params, Supervision.class);
		supervisionMapper.insertSelective(supervision);
	}

	public void modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		Supervision supervision = objectMapper.convertValue(params, Supervision.class);
		supervisionMapper.updateByPrimaryKeySelective(supervision);
	}

	public void deleteOne(Long value) {
		SupervisionExample supervisionExample = new SupervisionExample();
		SupervisionExample.Criteria criteria = supervisionExample.createCriteria();
		criteria.andIdEqualTo(value);
		supervisionMapper.deleteByExample(supervisionExample);
	}

	public void approveOne(Long value, String approver) {
		Supervision supervision = new Supervision();
		supervision.setId(value);
		supervision.setApprover(approver);
		Byte b = 1;
		supervision.setSituation(b);
		Date date = new Date();
		supervision.setApproveDate(date);
		supervisionMapper.updateByPrimaryKeySelective(supervision);		
	}
	
	public void executeOne(Long value) {
		Supervision supervision = new Supervision();
		supervision.setId(value);
		Byte b = 2;
		supervision.setSituation(b);
		supervisionMapper.updateByPrimaryKeySelective(supervision);
	}

	
	
	
	
}
