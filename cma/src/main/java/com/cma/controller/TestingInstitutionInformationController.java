package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.TestingInstitutionInformation;
import com.cma.service.TestingInstitutionInformationService;
import com.cma.util.Result;

@RestController
@RequestMapping("/TestingInstitutionInformation")
public class TestingInstitutionInformationController {
	@Autowired
	private TestingInstitutionInformationService testingInstitutionInformationService;
	/**
	 * 1.1
	 * @return
	 */
	@GetMapping("/get")
	public Result get() {
		TestingInstitutionInformation data = testingInstitutionInformationService.get();
		
		return Result.ok(data);
	}
	
	/**
	 * 1.2
	 * @return
	 */
	@GetMapping("/modify")
	public Result modify(@RequestParam Map<String, String> params) {
		Integer code = testingInstitutionInformationService.modify(params);
		return Result.ok();
	}
	
}
