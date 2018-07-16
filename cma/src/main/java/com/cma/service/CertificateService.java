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

import com.cma.dao.CertificateMapper;
import com.cma.pojo.Certificate;
import com.cma.pojo.ExternalReviewDocument;

@Service
public class CertificateService {
	
	@Autowired
	private CertificateMapper certificateMapper;
	
	private static final String FILE_PATH_LIN = "/usr/java/project/file/external_review/";

	/**
	 * 1.1
	 */
	public List<Certificate> getAll() {
		List<Certificate> result = certificateMapper.selectAll();
		return result;
	}
	
	/**
	 * 1.2
	 * @throws UnsupportedEncodingException 
	 */
	public ResponseEntity<InputStreamResource> getOne(Long id) throws UnsupportedEncodingException {
		Certificate find = certificateMapper.selectByPrimaryKey(id);
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(find.getFilePath()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(find.getFilePath().getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename=" + fileName);
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	/**
	 * 1.3
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public Integer addOne(String fileId, String fileName, MultipartFile file) throws IllegalStateException, IOException {
		String name = file.getOriginalFilename();
		File dest = new File(FILE_PATH_LIN + name);
		if(dest.exists()) {
			return 500;
		}
		file.transferTo(dest);
		Certificate certificate = new Certificate();
		certificate.setFileId(fileId);
		certificate.setFileName(fileName);
		certificate.setFilePath(FILE_PATH_LIN + name);
		certificateMapper.insert(certificate);
		return 200;
	}
	
	/**
	 * 1.4
	 */
	public Integer deleteOne(Long id) {
		certificateMapper.deleteByPrimaryKey(id);
		return 200;
	}
	
	/**
	 * 1.5
	 */
	public Integer modifyOne(Map<String, String> params) {
		
		return 200;
	}
	
}
