package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.ExternalReviewDocumentMapper;
import com.cma.dao.ExternalReviewManagementMapper;
import com.cma.pojo.ExternalReviewDocument;
import com.cma.pojo.ExternalReviewManagement;

@Service
public class ExternalReviewManagementService {

	@Autowired
	ExternalReviewManagementMapper externalReviewManagementMapper;
	
	@Autowired
	ExternalReviewDocumentMapper externalReviewDocumentMapper;
	
	public static final String FILE_PATH_LIN = "/usr/java/project/file/external_review/";
	//public static final String FILE_PATH_LIN = "D:\\软件工程项目\\external_review\\";
	
	public Object getAll() {
		return externalReviewManagementMapper.selectAll();
	}

	public boolean addOne(Long year, Date date) {
		if(externalReviewManagementMapper.selectByPrimaryKey(year)!=null) {
			return false;
		}
		ExternalReviewManagement externalReviewManagement = new ExternalReviewManagement();
		externalReviewManagement.setDate(date);
		externalReviewManagement.setYear(year);
		externalReviewManagementMapper.insert(externalReviewManagement);
		return true;
	}

	public void deleteOne(Long year) {
		externalReviewManagementMapper.deleteByPrimaryKey(year);		
	}

	public List<ExternalReviewDocument> getAllFile(Long year) {
		return externalReviewDocumentMapper.selectAll();
	}

	public boolean addOneFile(Long year, MultipartFile file) throws IllegalStateException, IOException {
		String fileName = file.getOriginalFilename();
		File dest = new File(FILE_PATH_LIN+fileName);
		if(dest.exists()) {
			return false;
		}
		file.transferTo(dest);
		ExternalReviewDocument externalReviewDocument = new ExternalReviewDocument();
		externalReviewDocument.setYear(year);
		externalReviewDocument.setFileName(fileName);
		externalReviewDocumentMapper.insert(externalReviewDocument);
		return true;
	}

	public boolean modifyOneFile(Long id, MultipartFile file) throws IllegalStateException, IOException {
		File newFile = new File(FILE_PATH_LIN+file.getOriginalFilename());
		if(newFile.exists())
			return false;
		ExternalReviewDocument externalReviewDocument = externalReviewDocumentMapper.selectByPrimaryKey(id);
		String oldFileName = externalReviewDocument.getFileName();
		File oldFile = new File(FILE_PATH_LIN + oldFileName);
		oldFile.delete();
		file.transferTo(newFile);
		externalReviewDocument.setFileName(file.getOriginalFilename());
		externalReviewDocumentMapper.updateByPrimaryKey(externalReviewDocument);
		return true;
	}

	public void deleteOneFile(Long id) {
		ExternalReviewDocument externalReviewDocument = externalReviewDocumentMapper.selectByPrimaryKey(id);
		File dest = new File(FILE_PATH_LIN+externalReviewDocument.getFileName());
		dest.delete();
		externalReviewDocumentMapper.deleteByPrimaryKey(id);
	}

	public ResponseEntity<InputStreamResource> downloadFile(Long id) throws UnsupportedEncodingException {
		ExternalReviewDocument find = externalReviewDocumentMapper.selectByPrimaryKey(id);
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(FILE_PATH_LIN + find.getFileName()));
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

}
