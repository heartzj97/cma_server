package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
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
		
	public static final String FILE_PATH_LIN = "/usr/java/project/file/equipment_receive/";
	public static final String FILE_PATH_WIN = "D:\\软件工程项目\\";
	
	public List<EquipmentReceive> getAll() {
		return equipmentReceiveMapper.selectAll();
	}

	public EquipmentReceive getOne(Long value) {
		return equipmentReceiveMapper.selectByPrimaryKey(value);
	}

	public String addOne(List<MultipartFile>files,  Map<String, String> params) throws IllegalStateException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentReceive equipmentReceive = objectMapper.convertValue(params, EquipmentReceive.class);
		equipmentReceiveMapper.insert(equipmentReceive);
		if(files!=null) {
			String message = null;
			List<EquipmentReceive> list = equipmentReceiveMapper.select(equipmentReceive);
			EquipmentReceive find = list.get(list.size()-1);
			for(MultipartFile o : files) {
				if(addAttachment(find.getId(), (MultipartFile) o)==false) {
					if(message==null) {
						message = o.getOriginalFilename()+" ";
					}
					else {
						message+=o.getOriginalFilename()+" ";
					}
				}
			}
			return message;
			}
		return null;
	}

	public int modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		EquipmentReceive equipmentReceive = objectMapper.convertValue(params, EquipmentReceive.class);
		return equipmentReceiveMapper.updateByPrimaryKeySelective(equipmentReceive);
	}

	public void deleteOne(Long value) {
		equipmentReceiveMapper.deleteByPrimaryKey(value);		
	}

	public boolean addAttachment(Long id, MultipartFile attachment) throws IllegalStateException, IOException {
			String attachmentName = attachment.getOriginalFilename();
			File file1 = new File(FILE_PATH_LIN+id.toString());
			//File file1 = new File(FILE_PATH_LIN+id.toString());
			file1.mkdirs();
			File dest = new File(FILE_PATH_LIN + id.toString() + "/" + attachmentName);
			//File dest = new File(FILE_PATH_LIN + id.toString() + "\\" + attachmentName);
			if(dest.exists()) 
				return false;
			attachment.transferTo(dest);
			EquipmentReceiveAttachment equipmentReceiveAttachment = new EquipmentReceiveAttachment();
			equipmentReceiveAttachment.setReceiveId(id);
			equipmentReceiveAttachment.setName(attachmentName);
			equipmentReceiveAttachmentMapper.insert(equipmentReceiveAttachment);
			return true;
	}

	public List<EquipmentReceiveAttachment> getAttachmentNameById(Long id) {
		EquipmentReceiveAttachmentExample equipmentReceiveAttachmentExample = new EquipmentReceiveAttachmentExample();
		Criteria criteria = equipmentReceiveAttachmentExample.createCriteria();
		criteria.andReceiveIdEqualTo(id);
		List<EquipmentReceiveAttachment> list = equipmentReceiveAttachmentMapper.selectByExample(equipmentReceiveAttachmentExample);
		return list;
	}

	public ResponseEntity<InputStreamResource> getOneAttachment(Long attachmentId) throws UnsupportedEncodingException {
		EquipmentReceiveAttachment find = equipmentReceiveAttachmentMapper.selectByPrimaryKey(attachmentId);
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(FILE_PATH_LIN + find.getReceiveId().toString() + "/" + find.getName()));
			//inputStream = new FileInputStream(new File(FILE_PATH_LIN + find.getReceiveId().toString() + "\\" + find.getName()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(find.getName().getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+fileName);
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

	public void deleteAttachment(Long attachmentId) {
		EquipmentReceiveAttachment find = equipmentReceiveAttachmentMapper.selectByPrimaryKey(attachmentId);
		File dest = new File(FILE_PATH_LIN + find.getReceiveId().toString() + "/" + find.getName());
		//File dest = new File(FILE_PATH_LIN + find.getReceiveId().toString() + "\\" + find.getName());
		dest.delete();
		equipmentReceiveAttachmentMapper.deleteByPrimaryKey(attachmentId);
	}
}
