package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.service.StandardManagementService;
import com.cma.util.Result;

@RestController
@RequestMapping("/StandardManagement")
public class StandardManagementController {
	
	@Autowired
	StandardManagementService standardManagementService;
	
	/**
	 * 1.1
	 * 获取全部标准文档信息
	 * method:GET
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("getAll")
	public Result getAll() {
		return Result.ok(standardManagementService.getAll());
	}
	
	/**
	 * 1.2
	 * 下载某个标准文档
	 * method:GET
	 * 
	 * @param fileId
	 * @return ResponseRntity<InputStreamResource>
	 * @throws UnsupportedEncodingException
	 * @author qwl
	 */
	@GetMapping("downloadFile")
	public ResponseEntity<InputStreamResource> downloadFile(@RequestParam("fileId") Long id) throws UnsupportedEncodingException {
		ResponseEntity<InputStreamResource> data = standardManagementService.downloadFile(id);
		return data;
	}
	
	
	/**
	 * 1.3
	 * 新增一个标准文档
	 * method:POST
	 * 
	 * @param file
	 * @return Result
	 * @throws IOException 
	 * @throws IllegalStateException
	 * @author qwl 
	 */
	@PostMapping("addOne")
	public Result addOne(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		boolean b = standardManagementService.addAttachment(file);
		if(b==true) {
			return Result.ok();
		}
		else {
			return Result.fail("文件 " + file.getOriginalFilename() + " 已存在");
		}
	}
	
	/**
	 * 1.4
	 * 修改某个标准文档
	 * method:POST
	 * 
	 * @param id
	 * @param file
	 * @return Result
	 * @author qwl
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("modifyOne")
	public Result modifyOne(@RequestParam("fileId")Long id, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		Boolean b = standardManagementService.modifyOne(id, file);
		if(b==true) {
			return Result.ok();
		}
		else {
			return Result.fail("文件 " + file.getOriginalFilename() + " 已存在");
		}
	}
	
	/**
	 * 1.5
	 * 删除某个标准文档
	 * method:POST
	 * 
	 * 
	 * @param id
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("deleteOne")
	public Result deleteOne(@RequestParam("fileId")Long id) {
		standardManagementService.deleteOne(id);
		return Result.ok();
	}
	
}
