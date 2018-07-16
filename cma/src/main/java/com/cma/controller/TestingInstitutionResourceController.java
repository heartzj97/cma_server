package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cma.pojo.TestingInstitutionResource;
import com.cma.service.TestingInstitutionResourceService;
import com.cma.util.Result;

@Controller
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
	@GetMapping("/modify")
	public Result modify(@RequestParam Map<String, String> params) {
		Integer code = testingInstitutiongResourceService.modify(params);
		return Result.ok();
	}
}
