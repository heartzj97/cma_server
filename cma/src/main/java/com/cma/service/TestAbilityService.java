package com.cma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.TestAbilityMapper;
import com.cma.pojo.TestAbility;

@Service
public class TestAbilityService {
	
	@Autowired
	TestAbilityMapper testAbilityMapper;
	
	//1.1
	public List<TestAbility> getAll() {
		return testAbilityMapper.selectAll();
	}
}
