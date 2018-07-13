package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.StandardManagementMapper;
import com.cma.pojo.StandardManagement;

@Service
public class StandardManagementService {

	public static final String PIC_PATH_LIN = "/usr/java/project/file/standard_management/";
	public static final String PIC_PATH_WIN = "D:\\软件工程项目\\standard_management\\";
	
	@Autowired
	StandardManagementMapper standardManagementMapper;
	
	public List<StandardManagement> getAll() {
		return standardManagementMapper.selectAll();
	}

	public ResponseEntity<InputStreamResource> downloadFile(Long id) throws UnsupportedEncodingException {
		StandardManagement find = standardManagementMapper.selectByPrimaryKey(id);
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + find.getFileName()));
			//inputStream = new FileInputStream(new File(PIC_PATH_WIN + find.getReceiveId().toString() + "\\" + find.getName()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(find.getFileName().getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+fileName);
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

	public boolean addAttachment(MultipartFile file) throws IllegalStateException, IOException {
		File dest = new File(PIC_PATH_LIN+file.getOriginalFilename());
		if(dest.exists())
			return false;
		file.transferTo(dest);		
		StandardManagement standardManagement = new StandardManagement();
		standardManagement.setFileName(file.getOriginalFilename());
		standardManagementMapper.insert(standardManagement);
		return true;
	}

	public boolean modifyOne(Long id, MultipartFile file) throws IllegalStateException, IOException {
		StandardManagement find = standardManagementMapper.selectByPrimaryKey(id);
		File dest = new File(PIC_PATH_LIN+find.getFileName());
		dest.delete();
		File newDest = new File(PIC_PATH_LIN+file.getOriginalFilename());
		if(dest.exists())
			return false;
		file.transferTo(newDest);	
		StandardManagement standardManagement = new StandardManagement();
		standardManagement.setFileId(id);
		standardManagement.setFileName(file.getOriginalFilename());
		standardManagementMapper.updateByPrimaryKey(standardManagement);
		return true;
		
	}

	public void deleteOne(Long id) {
		StandardManagement find = standardManagementMapper.selectByPrimaryKey(id);
		File dest = new File(PIC_PATH_LIN+find.getFileName());
		dest.delete();
		standardManagementMapper.deleteByPrimaryKey(id);
	}
}
