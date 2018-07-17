package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.dao.TestingInstitutionInformationMapper;
import com.cma.pojo.TestingInstitutionInformation;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TestingInstitutionInformationService {
	@Autowired
	private TestingInstitutionInformationMapper testingInstitutionInformationMapper;
	
	
	/**
	 * 1.1
	 */
	public TestingInstitutionInformation get() {
		List<TestingInstitutionInformation> result = testingInstitutionInformationMapper.selectAll();
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
		TestingInstitutionInformation testingInstitutionInformation = objectMapper.convertValue(params, TestingInstitutionInformation.class);
		testingInstitutionInformation.setId(1L);;
		testingInstitutionInformationMapper.updateByPrimaryKeySelective(testingInstitutionInformation);
		return 200;
	}
}
