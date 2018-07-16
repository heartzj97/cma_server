package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cma.dao.TestingInstitutionResourceMapper;
import com.cma.pojo.TestingInstitutionInformation;
import com.cma.pojo.TestingInstitutionResource;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestingInstitutionResourceService {
	@Autowired
	private TestingInstitutionResourceMapper testingInstitutionResourceMapper;
	
	
	/**
	 * 1.1
	 */
	public TestingInstitutionResource get() {
		List<TestingInstitutionResource> result = testingInstitutionResourceMapper.selectAll();
		if (result != null) {
			return result.get(0);
		}
		else {
			return null;
		}
	}
	

	/**
	 * 1.2
	 */
	public Integer modify(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		TestingInstitutionResource testingInstitutionResource = objectMapper.convertValue(params, TestingInstitutionResource.class);
		testingInstitutionResource.setId(1L);;
		testingInstitutionResourceMapper.updateByPrimaryKeySelective(testingInstitutionResource);
		return 200;
	}
}
