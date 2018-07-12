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

import com.cma.service.ManagementReviewService;
import com.cma.util.Result;

@RestController
@RequestMapping("/ManagementReview")
public class ManagementReviewController {
	
	@Autowired
	ManagementReviewService managementReviewService;
	
	/**
	 * 1.1
	 * 获取所有年度评审
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(managementReviewService.getAll());
	}
	
	/**
	 * 1.2
	 * 增加一个年份的内审
	 * method:POST
	 * 
	 * @param ManagementReview
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		managementReviewService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 1.3
	 * 删除某年份的内审
	 * method:POST
	 * 
	 * @param Long year
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("year") Long year ) {
		managementReviewService.deleteOne(year);
		return Result.ok();
	}
	
	
	/**
	 * 1.4
	 * 获取所有样表的压缩包
	 * method:GET
	 * 
	 * @param null
	 * @return ResponseEntity
	 * @author Fu
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/getExample")
	public ResponseEntity<InputStreamResource> getExample() throws UnsupportedEncodingException {
		return managementReviewService.getExample();
	}
	
	/**
	 * 1.5
	 * 获取某一年份内审的全部文档信息
	 * method:GET
	 * 
	 * @param Long year
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getAllFile")
	public Result getAllFile(@RequestParam("year") Long year) {
		return Result.ok(managementReviewService.getAllFile(year));
	}
	
	/**
	 * 1.6
	 * 增加某次内审的文档
	 * method:POST
	 * 
	 * @param ManagementReviewFile
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/addOneFile")
	public Result addOneFile(@RequestParam("year") Long year, @RequestParam("fileName") String fileName, 
			@RequestParam("file")  MultipartFile file) throws IllegalStateException, IOException {
		managementReviewService.addOneFile(year,fileName,file);
		return Result.ok();
	} 
	
	/**
	 * 1.7
	 * 修改某次评审的文档
	 * method:POST
	 * 
	 * @param ManagementReviewFile
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/modifyOneFile")
	public Result modifyOneFile(@RequestParam("fileId") Long fileId,@RequestParam(required = false,value = "year") Long year, @RequestParam(required = false,value = "fileName") String fileName, 
			@RequestParam(required = false,value = "file")  MultipartFile file) throws IllegalStateException, IOException {
		managementReviewService.modifyOneFile(fileId, year, fileName, file);
		return Result.ok();
	}
	
	/**
	 * 1.8
	 * 删除某次评审的文档
	 * method:POST
	 * 
	 * @param Long fileId
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/deleteOneFile")
	public Result deleteOneFile(@RequestParam("fileId") Long fileId) {
		managementReviewService.deleteOneFile(fileId);
		return Result.ok();
	}
	
	/**
	 * 1.8
	 * 删除某次评审的文档
	 * method:POST
	 * 
	 * @param Long fileId
	 * @return Result
	 * @author Fu
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/downloadFile")
	public ResponseEntity<InputStreamResource> downloadFile(@RequestParam("fileId") Long fileId) throws UnsupportedEncodingException {
		return managementReviewService.downloadFile(fileId);
	}
	
}
