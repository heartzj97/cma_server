package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.service.SampleReceiveService;
import com.cma.util.Result;

/**
 * 样品接收登记
 * 
 * @author qjx
 */

@RestController
@RequestMapping("/SampleReceive")
public class SampleReceiveController {	
	@Autowired
	private SampleReceiveService sampleReceiveService;
	
	/**
	 * 1.1
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<Map<String, Object>> data = sampleReceiveService.getAll();
		if (data == null) {
			return Result.fail("获取失败");
		}
		return Result.ok(data);
	}
	
	/**
	 * 1.2
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("sampleId") Long sampleId) {
		Map<String, Object> data = sampleReceiveService.getOne(sampleId);
		return Result.ok(data);
	}
	
	/**
	 * 1.3
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		Integer code = sampleReceiveService.addOne(params);
		return null;
	}
	
	/**
	 * 1.4
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne() {
		
		return null;
	}
	
	/**
	 * 1.5
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne() {
		
		return null;
	}
	
	
}
