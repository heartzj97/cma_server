package com.cma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cma.service.CertificateService;
import com.cma.util.Result;

@Controller
@RequestMapping("/Certificate")
public class CertificateController {
	
	@Autowired
	private CertificateService certificateService;

	/**
	 * 1.1
	 */
	public Result getAll() {
		
		return Result.ok();
	}
	
	/**
	 * 1.2
	 */
	public Result getOne() {
		
		return Result.ok();
	}
	
	/**
	 * 1.3
	 */
	public Result addOne() {
		
		return Result.ok();
	}
	
	/**
	 * 1.4
	 */
	public Result deleteOne() {
		
		return Result.ok();
	}
	
	/**
	 * 1.5
	 */
	public Result modifyOne() {
		
		return Result.ok();
	}
	
}
