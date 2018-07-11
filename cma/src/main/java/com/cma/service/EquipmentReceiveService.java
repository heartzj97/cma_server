package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.EquipmentReceiveAttachmentMapper;
import com.cma.dao.EquipmentReceiveMapper;
import com.cma.dao.example.EquipmentReceiveAttachmentExample;
import com.cma.dao.example.EquipmentReceiveAttachmentExample.Criteria;
import com.cma.pojo.EquipmentReceive;
import com.cma.pojo.EquipmentReceiveAttachment;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service
public class EquipmentReceiveService {

	@Autowired
	EquipmentReceiveMapper equipmentReceiveMapper;
	
	@Autowired
	EquipmentReceiveAttachmentMapper equipmentReceiveAttachmentMapper;
		
	public static final String PIC_PATH_LIN = "/usr/java/project/file/equipment_receive";
	public static final String PIC_PATH_WIN = "D:\\软件工程项目\\";
	
	public List<EquipmentReceive> getAll() {
		return equipmentReceiveMapper.selectAll();
	}

	public EquipmentReceive getOne(Long value) {
		return equipmentReceiveMapper.selectByPrimaryKey(value);
	}

	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentReceive equipmentReceive = objectMapper.convertValue(params, EquipmentReceive.class);
		equipmentReceiveMapper.insert(equipmentReceive);
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentReceive equipmentReceive = objectMapper.convertValue(params, EquipmentReceive.class);
		return equipmentReceiveMapper.updateByPrimaryKeySelective(equipmentReceive);
	}

	public void deleteOne(Long value) {
		equipmentReceiveMapper.deleteByPrimaryKey(value);		
	}

	public void addAttachment(Long id, MultipartFile attachment) throws IllegalStateException, IOException {
		if(attachment != null) {
			String attachmentName = attachment.getOriginalFilename();
			File file1 = new File(PIC_PATH_LIN+id.toString());
			file1.mkdirs();
			File dest = new File(PIC_PATH_LIN + id.toString() + "/" + attachmentName);
			attachment.transferTo(dest);
			EquipmentReceiveAttachment equipmentReceiveAttachment = new EquipmentReceiveAttachment();
			equipmentReceiveAttachment.setReceiveId(id);
			equipmentReceiveAttachment.setName(attachmentName);
			equipmentReceiveAttachmentMapper.insert(equipmentReceiveAttachment);
		}
	}

	public List<EquipmentReceiveAttachment> getAttachmentNameById(Long id) {
		EquipmentReceiveAttachmentExample equipmentReceiveAttachmentExample = new EquipmentReceiveAttachmentExample();
		Criteria criteria = equipmentReceiveAttachmentExample.createCriteria();
		criteria.andReceiveIdEqualTo(id);
		List<EquipmentReceiveAttachment> list = equipmentReceiveAttachmentMapper.selectByExample(equipmentReceiveAttachmentExample);
		return list;
	}

	public ResponseEntity<InputStreamResource> getOneAttachment(Long attachmentId) {
		EquipmentReceiveAttachment find = equipmentReceiveAttachmentMapper.selectByPrimaryKey(attachmentId);
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + find.getName().toString() + "/" + find.getName()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

	public void deleteAttachment(Long attachmentId) {
		EquipmentReceiveAttachment find = equipmentReceiveAttachmentMapper.selectByPrimaryKey(attachmentId);
		File dest = new File(PIC_PATH_LIN + find.getReceiveId().toString() + "/" + find.getName());
		dest.delete();
		equipmentReceiveAttachmentMapper.deleteByPrimaryKey(attachmentId);
	}

}
