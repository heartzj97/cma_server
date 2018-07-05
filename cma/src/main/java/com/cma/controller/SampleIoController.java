package com.cma.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cma.service.SampleIoService;
import com.cma.util.Result;

/**
 * 样品进出登记
 * 
 * @author qjx
 */

@RestController
@RequestMapping("/SampleIo")
public class SampleIoController {
	@Autowired
	private SampleIoService sampleIoService;
	
	/**
	 * 1.1
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<Map<String, Object>> data = sampleIoService.getAll();
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
		Map<String, Object> data = null; 
		return Result.ok(data);
	}
	
	/**
	 * 1.3
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		Integer code = sampleIoService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 1.4
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("sampleIoId") Long sampleIoId) {
		Integer code = sampleIoService.deleteOne(sampleIoId);
		return Result.ok();
	}
	
	/**
	 * 1.5
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		Integer code = sampleIoService.modifyOne(params);
		return Result.ok();
	}
	
	
	
}
