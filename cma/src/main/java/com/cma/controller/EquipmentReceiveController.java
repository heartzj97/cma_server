package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
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
	
	/**
	 * 2.1
	 * 获取全部仪器设备验收记录
	 * method:GET
	 * 
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		return Result.ok(equipmentReceiveService.getAll());
	}
	
	/**
	 * 2.2
	 * 获取某个仪器设备验收记录
	 * method:GET
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 2.3
	 * 新增仪器设备验收记录
	 * method:POST
	 * 
	 * @param files
	 * @param params
	 * @return Result
	 * @throws IllegalStateException
	 * @throws IOException
	 * @author qwl
	 */
	@PostMapping("/addOne")
	public Result addOne( @RequestParam(value="attachment", required=false) List<MultipartFile> files, @RequestParam Map<String, String> params) throws IllegalStateException, IOException {
		String message = equipmentReceiveService.addOne(files, params);
		if(message== null) {
			return Result.ok();
		}
		else {
			return Result.fail("文件 " + message + "已存在");
		}
	}
	
	/**
	 * 2.4
	 * 修改某项仪器设备验收记录
	 * method:POST
	 * 
	 * @param params
	 * @return Result
	 * @author qwl
	 */
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
	
	/**
	 * 2.5
	 * 删除某条仪器设备验收记录
	 * method:Post
	 * 
	 * @param value
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id")Long value) {
		equipmentReceiveService.deleteOne(value);
		return Result.ok();
	}
	
	/**
	 * 2.9
	 * 添加一个附件
	 * @param id
	 * @param attachment
	 * @return Result
	 * @throws IllegalStateException
	 * @throws IOException
	 * @author qwl
	 */
	@PostMapping("/addAttachment")
	public Result addAttachment(@RequestParam("id") Long id, @RequestParam("attachment") MultipartFile attachment) throws IllegalStateException, IOException {
		boolean b = equipmentReceiveService.addAttachment(id,attachment);
		if(b==true) {
			return Result.ok();
		}
		else {
			return Result.fail("文件 " + attachment.getOriginalFilename() + " 已存在");
		}
		
	}
	
	/**
	 * 2.6
	 * 获取某条仪器设备验收记录的附件列表
	 * method:GET
	 * 
	 * @param id
	 * @return Result
	 * @author qwl
	 */
	@GetMapping("/getAllAttachmentNameById")
	public Result getAttachmentNameById(@RequestParam("id") Long id) {
		return Result.ok(equipmentReceiveService.getAttachmentNameById(id));
	}
	
	/**
	 * 2.7
	 * 获取某个附件
	 * method:GET
	 * @param attachmentId
	 * @return Result
	 * @throws UnsupportedEncodingException
	 * @author qwl
	 */
	@GetMapping("getOneAttachment")
	public ResponseEntity<InputStreamResource> getOneAttachment(@RequestParam("attachmentId")Long attachmentId) throws UnsupportedEncodingException {
		ResponseEntity<InputStreamResource> data = equipmentReceiveService.getOneAttachment(attachmentId);
		return data;
	}
	
	/**
	 * 2.8
	 * 删除某个附件
	 * method:Post
	 * 
	 * @param attachmentId
	 * @return Result
	 * @author qwl
	 */
	@PostMapping("deleteAttachment")
	public Result deleteAttachment(@RequestParam("attachmentId")Long attachmentId) {
		equipmentReceiveService.deleteAttachment(attachmentId);
		return Result.ok();
	}
	
}
