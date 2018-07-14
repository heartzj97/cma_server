package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.service.TestAbilityService;
import com.cma.util.Result;

@RestController
@RequestMapping("/TestAbility")
public class TestAbilityController {
	
	@Autowired
	TestAbilityService testAbilityService;
	
	
	/**
	 * 1.1
	 * 获取全部年度信息
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(testAbilityService.getAll());
	}
	
	/**
	 * 1.2
	 * 增加年度信息
	 * method:POST
	 * 
	 * @param TestAbility
	 * @return Result
	 * @author Fu
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam("year") Long year, @RequestParam("fileName") String fileName,
			@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		testAbilityService.addOne(year, fileName, file);
		return Result.ok();
	}

	/**
	 * 1.3
	 * 修改年度信息
	 * method:POST
	 * 
	 * @param TestAbility
	 * @return Result
	 * @author Fu
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam("year") Long year, @RequestParam(required = false,value = "fileName") String fileName,
			@RequestParam(required = false,value = "file") MultipartFile file) throws IllegalStateException, IOException {
		testAbilityService.modifyOne(year, fileName, file);
		return Result.ok();
	}
	
	/**
	 * 1.4
	 * 获取年度附件
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAnnex")
	public ResponseEntity<InputStreamResource> getAnnex(@RequestParam("year") Long year) throws UnsupportedEncodingException {
		return testAbilityService.getAnnex(year);
	}
	
	/**
	 * 1.5
	 * 获取年度的所有产品信息
	 * method:GET
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAllItem")
	public Result getAllItem(@RequestParam("year") Long year) {
		return Result.ok(testAbilityService.getAllItem(year));
	}
	
	/**
	 * 1.6
	 * 增加某次产品信息
	 * method:POST
	 * 
	 * @param TestItem
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addOneItem")
	public Result addOneItem(@RequestParam Map<String, String> params) {
		testAbilityService.addOneItem(params);
		return Result.ok();
	}
	
	/**
	 * 1.7
	 * 删除某次产品信息
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteOneItem")
	public Result deleteOneItem(@RequestParam("id") Long id) {
		testAbilityService.deleteOneItem(id);
		return Result.ok();
	}
}
