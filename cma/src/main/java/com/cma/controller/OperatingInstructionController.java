package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.service.OperatingInstructionService;
import com.cma.util.Result;

@RestController
@RequestMapping("/OperatingInstruction")
public class OperatingInstructionController {

	@Autowired
	OperatingInstructionService operatingInstructionService;
	
	/**
	 * 1.1
	 * 获取所有年度评审
	 * method:POST
	 * 
	 * @param QualityManual
	 * @return Result
	 * @author Fu
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * @throws ParseException 
	 */
	@PostMapping("/upload")
	public Result upload(@RequestParam("file") MultipartFile file, @RequestParam("fileId") String fileId,
			@RequestParam("fileName") String fileName, @RequestParam("state") Byte state,
			@RequestParam("current") Byte current,@RequestParam(required = false,value = "modifyTime") String modifyTime,
			@RequestParam(required = false,value = "modifier") String modifier, 
			@RequestParam(required = false,value = "modifyContent") String modifyContent) throws IllegalStateException, IOException, ParseException {
		
		operatingInstructionService.upload(file,fileId,fileName,state,current,modifyTime,modifier,modifyContent);
		return Result.ok();
	}
	
	/**
	 * 1.2
	 * 获取所有年度评审
	 * method:POST
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 */
	@GetMapping("/getCurrent")
	public Result getCurrent() {
		return Result.ok(operatingInstructionService.getCurrent());
	}
	
	/**
	 * 1.3
	 * 获取所有年度评审
	 * method:POST
	 * 
	 * @param null
	 * @return ResponseEntity
	 * @author Fu
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/getCurrentFile")
	public ResponseEntity<InputStreamResource> getCurrentFile() throws UnsupportedEncodingException {
		return operatingInstructionService.getCurrentFile();
	}
	
	/**
	 * 1.4
	 * 获取所有年度评审
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/getAllHistory")
	public Result getAllHistory() {
		return Result.ok(operatingInstructionService.getAllHistory());
	}
	
	/**
	 * 1.5
	 * 获取所有年度评审
	 * method:GET
	 * 
	 * @param Long
	 * @return ResponseEntity
	 * @author Fu
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/getHistoryFile")
	public ResponseEntity<InputStreamResource> getHistoryFile(@RequestParam("id") Long id) throws UnsupportedEncodingException {
		return operatingInstructionService.getHistoryFile(id);
	}
	
	/**
	 * 1.6
	 * 获取所有年度评审
	 * method:GET
	 * 
	 * @param QualityManual
	 * @return Result
	 * @author Fu
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws IllegalStateException 
	 * @throws UnsupportedEncodingException 
	 */
	@PostMapping("/modify")
	public Result modify(@RequestParam("file") MultipartFile file, @RequestParam("fileId") String fileId,
			@RequestParam("fileName") String fileName,@RequestParam("modifyTime") String modifyTime,
			@RequestParam("modifier") String modifier, @RequestParam("modifyContent") String modifyContent) throws IllegalStateException, ParseException, IOException {
		operatingInstructionService.modify(file, fileId, fileName, modifyTime, modifier, modifyContent);
		return Result.ok(); 
	}
	
	/**
	 * 1.7
	 * 获取所有年度评审
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") Long id){
		operatingInstructionService.delete(id);
		return Result.ok();
	}
	
	/**
	 * 1.8
	 * 获取所有年度评审
	 * method:POST
	 * 
	 * @param Long
	 * @return Result
	 * @author Fu
	 */
	@PostMapping("/approve")
	public Result approve(@RequestParam("id") Long id, @RequestParam("state") Byte state) {
		operatingInstructionService.approve(id,state);
		return Result.ok();
	}
	
	/**
	 * 1.9
	 * 获取所有年度评审
	 * method:GET
	 * 
	 * @param null
	 * @return Result
	 * @author Fu
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/getApprove")
	public Result getApprove() {
		return Result.ok(operatingInstructionService.getApprove());
	}
}
