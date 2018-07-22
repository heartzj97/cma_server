package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.InternalAuditManagementFileMapper;
import com.cma.dao.InternalAuditManagementMapper;
import com.cma.dao.example.InternalAuditManagementExample;
import com.cma.dao.example.InternalAuditManagementFileExample;
import com.cma.pojo.CapacityVerificationProject;
import com.cma.pojo.InternalAuditManagement;
import com.cma.pojo.InternalAuditManagementFile;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service
public class InternalAuditManagementService {

	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/internal_audit_management/";
	public static final String PIC_PATH_TEST = "D:\\nju_cma\\";
	String exampleFile = "Example.zip";
	
	@Autowired
	InternalAuditManagementMapper internalAuditManagementMapper;
	
	@Autowired
	InternalAuditManagementFileMapper internalAuditManagementFileMapper;
	
	//1.1
	public List<InternalAuditManagement> getAll() {
		List<InternalAuditManagement> ans = internalAuditManagementMapper.selectAll();
		return ans;
	}
	
	//1.2
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		InternalAuditManagement internalAuditManagement = objectMapper.convertValue(params, InternalAuditManagement.class);
		internalAuditManagementMapper.insert(internalAuditManagement);
	}
	
	//1.3
	public void deleteOne(Long year) {
		InternalAuditManagementExample internalAuditManagementExample = new InternalAuditManagementExample();
		InternalAuditManagementExample.Criteria criteria = internalAuditManagementExample.createCriteria();
		criteria.andYearEqualTo(year);
		InternalAuditManagementFileExample internalAuditManagementFileExample = new InternalAuditManagementFileExample();
		InternalAuditManagementFileExample.Criteria fileCriteria = internalAuditManagementFileExample.createCriteria();
		fileCriteria.andYearEqualTo(year);
		List<InternalAuditManagementFile> fileList = internalAuditManagementFileMapper.selectByExample(internalAuditManagementFileExample);
		Iterator<InternalAuditManagementFile> iterator = fileList.iterator();
		while(iterator.hasNext()) {
			deleteOneFile(iterator.next().getId());
		}
		internalAuditManagementMapper.deleteByExample(internalAuditManagementExample);
	}
	
	
	//1.4
	public ResponseEntity<byte[]> getExample() {
		String fileName = exampleFile;
		String path = PIC_PATH_LIN+fileName;
		File f = new File(path);
		InputStream inputStream;
		ResponseEntity<byte[]> response=null;
		try {
			inputStream = new FileInputStream(f);
			byte[] b=new byte[inputStream.available()];
			inputStream.read(b);
			HttpHeaders headers = new HttpHeaders();
			fileName = new String(fileName.getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+fileName);
			HttpStatus statusCode=HttpStatus.OK;
			response = new ResponseEntity<byte[]>(b, headers, statusCode);
			inputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return response;
	}
	
	//1.5
	public  List<InternalAuditManagementFile> getAllFile(Long year) {
		InternalAuditManagementFileExample internalAuditManagementFileExample = new InternalAuditManagementFileExample();
		InternalAuditManagementFileExample.Criteria criteria = internalAuditManagementFileExample.createCriteria();
		criteria.andYearEqualTo(year);
		
		return internalAuditManagementFileMapper.selectByExample(internalAuditManagementFileExample);
	}
	
	//1.6
	public void addOneFile(Long year, String fileName,MultipartFile file) throws IllegalStateException, IOException {
		InternalAuditManagementFile internalAuditManagementFile = new InternalAuditManagementFile();
		internalAuditManagementFile.setYear(year);
		internalAuditManagementFile.setFileName(fileName);
		if (file != null) {
			internalAuditManagementFile.setFile(file.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		internalAuditManagementFileMapper.insertSelective(internalAuditManagementFile);
	}
	
	//1.7
	public void modifyOneFile(Long fileId,Long year, String fileName,MultipartFile file) throws IllegalStateException, IOException {
		InternalAuditManagementFileExample internalAuditManagementFileExample = new InternalAuditManagementFileExample();
		InternalAuditManagementFileExample.Criteria criteria = internalAuditManagementFileExample.createCriteria();
		criteria.andIdEqualTo(fileId);
		InternalAuditManagementFile internalAuditManagementFile = new InternalAuditManagementFile();
		internalAuditManagementFile.setId(fileId);
		if (year != null) {
			internalAuditManagementFile.setYear(year);
		}
		if (fileName != null) {
			internalAuditManagementFile.setFileName(fileName);
		}
		if (file != null) {
			internalAuditManagementFile.setFile(file.getOriginalFilename());
			InternalAuditManagementFile internalAuditManagementFile2 = internalAuditManagementFileMapper.selectOneByExample(internalAuditManagementFileExample);
			String image = internalAuditManagementFile2.getFile() ;
			if (image != null) {
				File temp = new File(PIC_PATH_LIN + image);
				temp.delete();
			}
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		internalAuditManagementFileMapper.updateByExampleSelective(internalAuditManagementFile, internalAuditManagementFileExample);
		
	}
	
	//1.8
	public void deleteOneFile(Long fileId) {
		InternalAuditManagementFileExample internalAuditManagementFileExample = new InternalAuditManagementFileExample();
		InternalAuditManagementFileExample.Criteria criteria = internalAuditManagementFileExample.createCriteria();
		criteria.andIdEqualTo(fileId);
		
		InternalAuditManagementFile internalAuditManagementFile = internalAuditManagementFileMapper.selectOneByExample(internalAuditManagementFileExample);
		String realFileName = internalAuditManagementFile.getFile();
		if (realFileName != null) {
			File dest = new File(PIC_PATH_LIN + realFileName);
			dest.delete();
		}
		
		internalAuditManagementFileMapper.deleteByExample(internalAuditManagementFileExample);
	}
	
	//1.9
	public ResponseEntity<InputStreamResource> downloadFile(Long fileId) throws UnsupportedEncodingException {
		
		InternalAuditManagementFileExample internalAuditManagementFileExample = new InternalAuditManagementFileExample();
		InternalAuditManagementFileExample.Criteria criteria = internalAuditManagementFileExample.createCriteria();
		criteria.andIdEqualTo(fileId);
		
		InternalAuditManagementFile internalAuditManagementFile = internalAuditManagementFileMapper.selectOneByExample(internalAuditManagementFileExample);
		String realFileName = internalAuditManagementFile.getFile();
		
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
