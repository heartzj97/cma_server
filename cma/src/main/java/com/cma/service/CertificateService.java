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

import com.cma.dao.CertificateMapper;
import com.cma.pojo.Certificate;

@Service
public class CertificateService {
	
	@Autowired
	private CertificateMapper certificateMapper;
	
	private static final String FILE_PATH_LIN = "/usr/java/project/file/certificate/";
	//private static final String FILE_PATH_LIN = "D:\\";

	/**
	 * 1.1
	 */
	public List<Certificate> getAll() {
		List<Certificate> result = certificateMapper.selectAll();
		return result;
	}
	
	/**
	 * 1.1
	 */
	public Certificate getOne(Long id) {
		Certificate result = certificateMapper.selectByPrimaryKey(id);
		return result;
	}
	
	/**
	 * 1.2
	 * @throws UnsupportedEncodingException 
	 */
	public ResponseEntity<InputStreamResource> downloadOne(Long id) throws UnsupportedEncodingException {
		Certificate find = certificateMapper.selectByPrimaryKey(id);
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(FILE_PATH_LIN + find.getFileName()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(find.getFileName().getBytes("gbk"),"iso8859-1");
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
	public Integer addOne(MultipartFile file) throws IllegalStateException, IOException {
		String name = file.getOriginalFilename();
		File dest = new File(FILE_PATH_LIN + name);
		if(dest.exists()) {
			return 210;
		}
		file.transferTo(dest);
		Certificate certificate = new Certificate();
		certificate.setFileName(name);
		certificateMapper.insert(certificate);
		return 200;
	}
	
	/**
	 * 1.4
	 */
	public Integer deleteOne(Long id) {
		Certificate certificate = certificateMapper.selectByPrimaryKey(id); 
		if (certificate != null) {
			String realFileName = certificate.getFileName();
			if (realFileName != null) {
				File dest = new File(FILE_PATH_LIN + realFileName);
				dest.delete();
			}
		}
		certificateMapper.deleteByPrimaryKey(id);
		return 200;
	}
	
	/**
	 * 1.5
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public Integer modifyOne(Long id, MultipartFile file) throws IllegalStateException, IOException {
		File newFile = new File(FILE_PATH_LIN + file.getOriginalFilename());
//		if(newFile.exists())
//			return 500;
		List<Certificate> certificates = certificateMapper.selectAll();
		Certificate certificate = certificateMapper.selectByPrimaryKey(id);
		if (certificates == null || certificate == null) {
			return 500;
		}
		for (Certificate certificateT : certificates) {
			if (certificate.getFileName() != null && certificate.getFileName().equals(certificateT.getFileName())) {
				return 210;
			}
		}
		String oldFilePath = FILE_PATH_LIN + certificate.getFileName();
		if (file != null) {
			File oldFile = new File(oldFilePath);
			oldFile.delete();
			file.transferTo(newFile);
		}
		certificate.setFileName(file.getOriginalFilename());
		certificate.setFileId(id);
		certificateMapper.updateByPrimaryKey(certificate);
		return 200;
	}
	
}
