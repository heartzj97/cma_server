package com.cma.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.service.InternalAuditManagementService;
import com.cma.util.Result;

@RestController
@RequestMapping("/InternalAuditManagement")
public class InternalAuditManagementController {
	
	@Autowired
	InternalAuditManagementService internalAuditManagementService;
	
	/**
	 * 1.1
	 * 获取所有年度内审
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author niu
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(internalAuditManagementService.getAll());
	}
	
	/**
	 * 1.2
	 * 增加一个年份的内审
	 * method:POST
	 * 
	 * @param InternalAuditManagement
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		internalAuditManagementService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 1.3
	 * 删除某年份的内审
	 * method:POST
	 * 
	 * @param Long year
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("year") Long year ) {
		internalAuditManagementService.deleteOne(year);
		return Result.ok();
	}
	
	
	/**
	 * 1.4
	 * 获取所有样表的压缩包
	 * method:GET
	 * 
	 * @param null
	 * @return ResponseEntity
	 * @author niu
	 */
	@GetMapping("/getExample")
	public ResponseEntity<byte[]> getExample() {
		return internalAuditManagementService.getExample();
	}
	
	/**
	 * 1.5
	 * 获取某一年份内审的全部文档信息
	 * method:GET
	 * 
	 * @param Long year
	 * @return Result
	 * @author niu
	 */
	@GetMapping("/getAllFile")
	public Result getAllFile(@RequestParam("year") Long year) {
		return Result.ok(internalAuditManagementService.getAllFile(year));
	}
	
	/**
	 * 1.6
	 * 增加某次内审的文档
	 * method:POST
	 * 
	 * @param InternalAuditManagementFile
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/addOneFile")
	public Result addOneFile(@RequestParam("year") Long year, @RequestParam("fileName") String fileName, 
			@RequestParam("file")  MultipartFile file) throws IllegalStateException, IOException {
		internalAuditManagementService.addOneFile(year,fileName,file);
		return Result.ok();
	} 
	
	/**
	 * 1.7
	 * 修改某次内审的文档
	 * method:POST
	 * 
	 * @param InternalAuditManagementFile
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/modifyOneFile")
	public Result modifyOneFile(@RequestParam("fileId") Long fileId,@RequestParam(required = false,value = "year") Long year, @RequestParam(required = false,value = "fileName") String fileName, 
			@RequestParam(required = false,value = "file")  MultipartFile file) throws IllegalStateException, IOException {
		internalAuditManagementService.modifyOneFile(fileId, year, fileName, file);
		return Result.ok();
	}
	
	/**
	 * 1.8
	 * 删除某次内审的文档
	 * method:POST
	 * 
	 * @param Long fileId
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/deleteOneFile")
	public Result deleteOneFile(@RequestParam("fileId") Long fileId) {
		internalAuditManagementService.deleteOneFile(fileId);
		return Result.ok();
	}
	
	/**
	 * 1.9
	 * 下载某次内审的文档
	 * method:POST
	 * 
	 * @param Long fileId
	 * @return Result
	 * @author niu
	 */
	@GetMapping("/downloadFile")
	public ResponseEntity<byte[]> downloadFile(@RequestParam("fileId") Long fileId) {
		return internalAuditManagementService.downloadFile(fileId);
	}
	
}
