package com.cma.controller;

import java.io.IOException;
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

import com.cma.pojo.EquipmentReceive;
import com.cma.service.EquipmentReceiveService;
import com.cma.util.Result;

@RestController
@RequestMapping("/EquipmentReceive")
public class EquipmentReceiveController {
	
	@Autowired
	EquipmentReceiveService equipmentReceiveService;
	
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentReceiveService.getAll());
	}
	
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long value) {
		EquipmentReceive equipmentReceive = equipmentReceiveService.getOne(value);
		if(equipmentReceive==null) {
			return Result.fail("无此条信息");
		}
		else {
			return Result.ok(equipmentReceive);
		}
	}
	
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		equipmentReceiveService.addOne(params);
		return Result.ok();
	}
	
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		int i = equipmentReceiveService.modifyOne(params);
		if(i==1) {
			return Result.ok();
		}
		else {
			return Result.fail("修改失败");
		}
	}
	
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentReceiveService.deleteOne(value);
		return Result.ok();
	}
	
	@PostMapping("/addAttachment")
	public Result addAttachment(@RequestParam("id") Long id, @RequestParam("attachment") MultipartFile attachment) throws IllegalStateException, IOException {
		equipmentReceiveService.addAttachment(id,attachment);
		return Result.ok();
	}
	
	@GetMapping("/getAttachmentNameById")
	public Result getAttachmentNameById(@RequestParam("id") Long id) {
		return Result.ok(equipmentReceiveService.getAttachmentNameById(id));
	}
	
	@GetMapping("getOneAttachment")
	public ResponseEntity<InputStreamResource> getOneAttachment(@RequestParam("attachmentId")Long attachmentId) {
		ResponseEntity<InputStreamResource> data = equipmentReceiveService.getOneAttachment(attachmentId);
		return data;
	}
	
	@PostMapping("modifyAttachment")
	public Result modifyAttachment(@RequestParam("attachmentId")Long attachmentId, @RequestParam("attachment") MultipartFile attachment) {
		equipmentReceiveService.modifyAttachment(attachmentId, attachment);
		return Result.ok();
	}
	
}
