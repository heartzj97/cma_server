package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.SelfInspectionFileMapper;
import com.cma.dao.SelfInspectionMapper;
import com.cma.dao.example.SelfInspectionExample;
import com.cma.dao.example.SelfInspectionFileExample;
import com.cma.pojo.SelfInspection;
import com.cma.pojo.SelfInspectionFile;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service
public class SelfInspectionService {

	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/self_inspection/";
	public static final String PIC_PATH_TEST = "D:\\nju_cma\\";
	String exampleFile = "Example.zip";
	
	@Autowired
	SelfInspectionMapper selfInspectionMapper;
	
	@Autowired
	SelfInspectionFileMapper selfInspectionFileMapper;
	
	//1.1
	public List<SelfInspection> getAll() {
		List<SelfInspection> ans = selfInspectionMapper.selectAll();
		return ans;
	}
	
	//1.2
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		SelfInspection selfInspection = objectMapper.convertValue(params, SelfInspection.class);
		selfInspectionMapper.insert(selfInspection);
	}
	
	//1.3
	public void deleteOne(Long id) {
		SelfInspectionExample selfInspectionExample = new SelfInspectionExample();
		SelfInspectionExample.Criteria criteria = selfInspectionExample.createCriteria();
		criteria.andIdEqualTo(id);
		
		selfInspectionMapper.deleteByExample(selfInspectionExample);
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
	public  List<SelfInspectionFile> getAllFile(Long id) {
		SelfInspectionFileExample selfInspectionFileExample = new SelfInspectionFileExample();
		SelfInspectionFileExample.Criteria criteria = selfInspectionFileExample.createCriteria();
		criteria.andSelfInspectionIdEqualTo(id);                                               //id在file操作中均指selfInspectionId；
		
		return selfInspectionFileMapper.selectByExample(selfInspectionFileExample);
	}
	
	//1.6
	public void addOneFile(Long id, String fileName,MultipartFile file) throws IllegalStateException, IOException {
		SelfInspectionFile selfInspectionFile = new SelfInspectionFile();
		selfInspectionFile.setSelfInspectionId(id);                                        //id在file操作中均指selfInspectionId；
		selfInspectionFile.setFileName(fileName);
		if (file != null) {
			selfInspectionFile.setFile(file.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		selfInspectionFileMapper.insertSelective(selfInspectionFile);
	}
	
	//1.7
	public void modifyOneFile(Long fileId,Long id, String fileName,MultipartFile file) throws IllegalStateException, IOException {
		SelfInspectionFileExample selfInspectionFileExample = new SelfInspectionFileExample();
		SelfInspectionFileExample.Criteria criteria = selfInspectionFileExample.createCriteria();
		criteria.andIdEqualTo(fileId);
		SelfInspectionFile selfInspectionFile = new SelfInspectionFile();
		selfInspectionFile.setId(fileId);
		if (id != null) {
			selfInspectionFile.setSelfInspectionId(id);
		}
		if (fileName != null) {
			selfInspectionFile.setFileName(fileName);
		}
		if (file != null) {
			selfInspectionFile.setFile(file.getOriginalFilename());
			SelfInspectionFile selfInspectionFile2 = selfInspectionFileMapper.selectOneByExample(selfInspectionFileExample);
			String image = selfInspectionFile2.getFile() ;
			if (image != null) {
				File temp = new File(PIC_PATH_LIN + image);
				temp.delete();
			}
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		selfInspectionFileMapper.updateByExampleSelective(selfInspectionFile, selfInspectionFileExample);
		
	}
	
	//1.8
	public void deleteOneFile(Long fileId) {
		SelfInspectionFileExample selfInspectionFileExample = new SelfInspectionFileExample();
		SelfInspectionFileExample.Criteria criteria = selfInspectionFileExample.createCriteria();
		criteria.andIdEqualTo(fileId);
		
		SelfInspectionFile selfInspectionFile = selfInspectionFileMapper.selectOneByExample(selfInspectionFileExample);
		String realFileName = selfInspectionFile.getFile();
		if (realFileName != null) {
			File dest = new File(PIC_PATH_LIN + realFileName);
			dest.delete();
		}
		
		selfInspectionFileMapper.deleteByExample(selfInspectionFileExample);
	}
	
	//1.9
	public ResponseEntity<InputStreamResource> downloadFile(Long fileId) throws UnsupportedEncodingException {
		
		SelfInspectionFileExample selfInspectionFileExample = new SelfInspectionFileExample();
		SelfInspectionFileExample.Criteria criteria = selfInspectionFileExample.createCriteria();
		criteria.andIdEqualTo(fileId);
		
		SelfInspectionFile selfInspectionFile = selfInspectionFileMapper.selectOneByExample(selfInspectionFileExample);
		String realFileName = selfInspectionFile.getFile();
		
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
