package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.TestingInstitutionResource;
import com.cma.service.TestingInstitutionResourceService;
import com.cma.util.Result;

@RestController
@RequestMapping("/TestingInstitutionResource")
public class TestingInstitutionResourceController {
	@Autowired
	private TestingInstitutionResourceService testingInstitutiongResourceService;
	
	/**
	 * 1.1
	 * @return
	 */
	@GetMapping("/get")
	public Result get() {
		TestingInstitutionResource data = testingInstitutiongResourceService.get();
		return Result.ok(data);
	}
	
	/**
	 * 1.2
	 * @return
	 */
	@PostMapping("/modify")
	public Result modify(@RequestParam Map<String, String> params) {
		Integer code = testingInstitutiongResourceService.modify(params);
		return Result.ok();
	}
}
