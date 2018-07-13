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

import com.cma.dao.ManagementReviewFileMapper;
import com.cma.dao.ManagementReviewMapper;
import com.cma.dao.example.ManagementReviewExample;
import com.cma.dao.example.ManagementReviewFileExample;
import com.cma.pojo.ManagementReview;
import com.cma.pojo.ManagementReviewFile;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service
public class ManagementReviewService {

	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/management_review/";
	String exampleFile = "Example.zip";
	
	@Autowired
	ManagementReviewMapper managementReviewMapper;
	
	@Autowired
	ManagementReviewFileMapper managementReviewFileMapper;
	
	//1.1
	public List<ManagementReview> getAll() {
		List<ManagementReview> ans = managementReviewMapper.selectAll();
		return ans;
	}
	
	//1.2
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		ManagementReview managementReview = objectMapper.convertValue(params, ManagementReview.class);
		managementReviewMapper.insert(managementReview);
	}
	
	//1.3
	public void deleteOne(Long year) {
		ManagementReviewExample managementReviewExample = new ManagementReviewExample();
		ManagementReviewExample.Criteria criteria = managementReviewExample.createCriteria();
		criteria.andYearEqualTo(year);
		
		managementReviewMapper.deleteByExample(managementReviewExample);
	}
	
	
	//1.4
	public ResponseEntity<InputStreamResource> getExample() throws UnsupportedEncodingException {
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + exampleFile));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(exampleFile.getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+fileName);
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();	
		}		
	}
	
	//1.5
	public  List<ManagementReviewFile> getAllFile(Long year) {
		ManagementReviewFileExample managementReviewFileExample = new ManagementReviewFileExample();
		ManagementReviewFileExample.Criteria criteria = managementReviewFileExample.createCriteria();
		criteria.andYearEqualTo(year);
		
		return managementReviewFileMapper.selectByExample(managementReviewFileExample);
	}
	
	//1.6
	public void addOneFile(Long year, String fileName,MultipartFile file) throws IllegalStateException, IOException {
		ManagementReviewFile managementReviewFile = new ManagementReviewFile();
		managementReviewFile.setYear(year);
		managementReviewFile.setFileName(fileName);
		if (file != null) {
			managementReviewFile.setFile(file.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		managementReviewFileMapper.insertSelective(managementReviewFile);
	}
	
	//1.7
	public void modifyOneFile(Long fileId,Long year, String fileName,MultipartFile file) throws IllegalStateException, IOException {
		ManagementReviewFileExample managementReviewFileExample = new ManagementReviewFileExample();
		ManagementReviewFileExample.Criteria criteria = managementReviewFileExample.createCriteria();
		criteria.andFileIdEqualTo(fileId);
		
		ManagementReviewFile managementReviewFile = new ManagementReviewFile();
		managementReviewFile.setFileId(fileId);
		if (year != null) {
			managementReviewFile.setYear(year);
		}
		if (fileName != null) {
			managementReviewFile.setFileName(fileName);
		}
		if (file != null) {
			managementReviewFile.setFile(file.getOriginalFilename());
			ManagementReviewFile managementReviewFile2 = managementReviewFileMapper.selectOneByExample(managementReviewFileExample);
			String image = managementReviewFile2.getFile() ;
			if (image != null) {
				File temp = new File(PIC_PATH_LIN + image);
				temp.delete();
			}
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		managementReviewFileMapper.updateByExampleSelective(managementReviewFile, managementReviewFileExample);
		
	}
	
	//1.8
	public void deleteOneFile(Long fileId) {
		ManagementReviewFileExample managementReviewFileExample = new ManagementReviewFileExample();
		ManagementReviewFileExample.Criteria criteria = managementReviewFileExample.createCriteria();
		criteria.andFileIdEqualTo(fileId);
		
		ManagementReviewFile managementReviewFile = managementReviewFileMapper.selectOneByExample(managementReviewFileExample);
		String realFileName = managementReviewFile.getFile();
		if (realFileName != null) {
			File dest = new File(PIC_PATH_LIN + realFileName);
			dest.delete();
		}
		
		managementReviewFileMapper.deleteByExample(managementReviewFileExample);
	}
	
	//1.9
	public ResponseEntity<InputStreamResource> downloadFile(Long fileId) throws UnsupportedEncodingException {
		
		ManagementReviewFileExample managementReviewFileExample = new ManagementReviewFileExample();
		ManagementReviewFileExample.Criteria criteria = managementReviewFileExample.createCriteria();
		criteria.andFileIdEqualTo(fileId);
		
		ManagementReviewFile managementReviewFile = managementReviewFileMapper.selectOneByExample(managementReviewFileExample);
		String realFileName = managementReviewFile.getFile();
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + realFileName));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			realFileName = new String(realFileName.getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+realFileName);
			ResponseEntity<InputStreamResource> response = 
					new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();	
		}
		
	}
}
