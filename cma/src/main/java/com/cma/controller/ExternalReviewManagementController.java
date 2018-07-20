package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.service.ExternalReviewManagementService;
import com.cma.util.Result;

@RestController
@RequestMapping("/ExternalReviewManagement")
public class ExternalReviewManagementController {

	@Autowired
	ExternalReviewManagementService externalReviewManagementService;
	
	/**
	 * 1.1
	 * 获取全部外部评审与上报信息
	 * method:GET
	 * 
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(externalReviewManagementService.getAll());
	}
	
	/**
	 * 1.2
	 * 增加一个年份的外部评审
	 * method:POST
	 * 
	 * @param year
	 * @param date
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam("year")Long year, @RequestParam("date")Date date) {
		boolean b = externalReviewManagementService.addOne(year, date);
		if(b==false) {
			return Result.fail(year+"年的外部评审已存在");
		}
		else {
			return Result.ok();
		}
	}
	
	/**
	 * 1.3
	 * 删除某年份的外部评审
	 * method:POST
	 * 
	 * @param year
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("year")Long year) {
		externalReviewManagementService.deleteOne(year);
		return Result.ok();
	}
	
	/**
	 * 1.4
	 * 获取某一年份外部评审的全部文档信息
	 * method:GET
	 * 
	 * @param year
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAllFile")
	public Result getAllFile(@RequestParam("year")Long year) {
		return Result.ok(externalReviewManagementService.getAllFile(year));
	}
	
	/**
	 * 1.5
	 * 增加某次外部评审的文档
	 * method:POST
	 * 
	 * @param year
	 * @param file
	 * @return Result
	 * @author qwl
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/addOneFile")
	public Result addOneFile(@RequestParam("year")Long year, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		boolean b = externalReviewManagementService.addOneFile(year,file);
		if(b==true) {
			return Result.ok();
		}
		else {
			return Result.fail("文件 " + file.getOriginalFilename() + " 已存在");
		}		
	}
	
	/**
	 * 1.6
	 * 修改某个文档(实际上是通过覆盖)
	 * method:POST
	 * 
	 * @param id
	 * @param file
	 * @return Result
	 * @author qwl
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/modifyOneFile")
	public Result modifyOneFile(@RequestParam("fileId")Long id, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		boolean b = externalReviewManagementService.modifyOneFile(id,file);
		if(b==true) {
			return Result.ok();
		}
		else {
			return Result.fail("文件 " + file.getOriginalFilename() + " 已存在");
		}	
	}
	
	/**
	 * 1.7
	 * 删除某个文档
	 * method:POST
	 * 
	 * @param id
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOneFile")
	public Result deleteOneFile(@RequestParam("fileId")Long id) {
		externalReviewManagementService.deleteOneFile(id);
		return Result.ok();
	}
	
	/**
	 * 1.8
	 * 下载某个具体文档
	 * method:GET
	 * 
	 * @param id
	 * @return ResponseEntity
	 * @author qwl
	 * @throws UnsupportedEncodingException 
 	 */
	@GetMapping("/downloadFile")
	public ResponseEntity<InputStreamResource> downloadFile(@RequestParam("fileId")Long id) throws UnsupportedEncodingException {
		ResponseEntity<InputStreamResource> data = externalReviewManagementService.downloadFile(id);
		return data;
	}
	
	/**
	 * 1.9
	 * 获取某一个文档的信息
	 * method:GET
	 * 
	 * @param id
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getOneFile")
	public Result getOneFile(@RequestParam("fileId")Long id) {
		return Result.ok(externalReviewManagementService.getOneFile(id));
	}
	
}
