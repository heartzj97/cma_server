package com.cma.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.pojo.SampleReceipt;
import com.cma.service.SampleReceiptService;
import com.cma.util.Result;


/**
 * 样品接收登记
 * 
 * @author qjx
 */

@RestController
@RequestMapping("/SampleReceipt")
public class SampleReceiptController {

	@Autowired
	private SampleReceiptService sampleReceiptService;
	
	/**
	 * 3.1
	 */
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("sampleId") Long sampleId) {
		SampleReceipt data = sampleReceiptService.getOne(sampleId);
		return Result.ok(data);
	}
	
	/**
	 * 3.2
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, Object> params) {
		Integer code = sampleReceiptService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 3.3
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("sampleId") Long sampleId) {
		Integer code = sampleReceiptService.deleteOne(sampleId);
		return Result.ok();
	}
	
	/**
	 * 3.4
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestBody Map<String, Object> params) {
		Integer code = sampleReceiptService.modifyOne(params);
		return Result.ok();
	}
}
