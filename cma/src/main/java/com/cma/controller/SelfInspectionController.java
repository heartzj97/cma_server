package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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

import com.cma.service.SelfInspectionService;
import com.cma.util.Result;

@RestController
@RequestMapping("/SelfInspection")
public class SelfInspectionController {
	
	@Autowired
	SelfInspectionService selfInspectionService;
	
	/**
	 * 1.1
	 * 获取所有自查
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author niu
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(selfInspectionService.getAll());
	}
	
	/**
	 * 1.2
	 * 增加一次自查
	 * method:POST
	 * 
	 * @param InternalAuditManagement
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		selfInspectionService.addOne(params);
		return Result.ok();
	}
	
	/**
	 * 1.3
	 * 删除某次自查
	 * method:POST
	 * 
	 * @param Long id
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long id ) {
		selfInspectionService.deleteOne(id);
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
		return selfInspectionService.getExample();
	}
	
	/**
	 * 1.5
	 * 获取某一次自查的全部文档信息
	 * method:GET
	 * 
	 * @param Long id
	 * @return Result
	 * @author niu
	 */
	@GetMapping("/getAllFile")
	public Result getAllFile(@RequestParam("id") Long id) {
		return Result.ok(selfInspectionService.getAllFile(id));
	}
	
	/**
	 * 1.6
	 * 增加某次自查的文档
	 * method:POST
	 * 
	 * @param SelfInspectionFile
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/addOneFile")
	public Result addOneFile(@RequestParam("id") Long id, @RequestParam("fileName") String fileName, 
			@RequestParam("file")  MultipartFile file) throws IllegalStateException, IOException {
		selfInspectionService.addOneFile(id,fileName,file);
		return Result.ok();
	} 
	
	/**
	 * 1.7
	 * 修改某次自查的文档
	 * method:POST
	 * 
	 * @param SelfInspectionFile
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/modifyOneFile")
	public Result modifyOneFile(@RequestParam("fileId") Long fileId,@RequestParam(required = false,value = "id") Long id, @RequestParam(required = false,value = "fileName") String fileName, 
			@RequestParam(required = false,value = "file")  MultipartFile file) throws IllegalStateException, IOException {
		selfInspectionService.modifyOneFile(fileId, id, fileName, file);
		return Result.ok();
	}
	
	/**
	 * 1.8
	 * 删除某次自查的文档
	 * method:POST
	 * 
	 * @param Long fileId
	 * @return Result
	 * @author niu
	 */
	@PostMapping("/deleteOneFile")
	public Result deleteOneFile(@RequestParam("fileId") Long fileId) {
		selfInspectionService.deleteOneFile(fileId);
		return Result.ok();
	}
	
	/**
	 * 1.9
	 * 下载某次自查的文档
	 * method:POST
	 * 
	 * @param Long fileId
	 * @return Result
	 * @author niu
	 */
	@GetMapping("/downloadFile")
	public ResponseEntity<InputStreamResource> downloadFile(@RequestParam("fileId") Long fileId) throws UnsupportedEncodingException {
		return selfInspectionService.downloadFile(fileId);
	}
	
}
