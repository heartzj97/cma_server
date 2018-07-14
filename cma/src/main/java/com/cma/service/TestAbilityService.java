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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.TestAbilityMapper;
import com.cma.dao.TestItemMapper;
import com.cma.dao.example.TestItemExample;
import com.cma.pojo.ManagementReview;
import com.cma.pojo.TestAbility;
import com.cma.pojo.TestItem;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TestAbilityService {
	
	@Autowired
	TestAbilityMapper testAbilityMapper;
	
	@Autowired
	TestItemMapper testAbilityItemMapper;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/test_ability/";
	
	//1.1
	public List<TestAbility> getAll() {
		return testAbilityMapper.selectAll();
	}
	
	//1.2
	public void addOne(Long year, String fileName, MultipartFile file) throws IllegalStateException, IOException {
		TestAbility testAbility = new TestAbility();
		testAbility.setYear(year);
		testAbility.setFileName(fileName);
		if (file != null) {
			testAbility.setFile(file.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		testAbilityMapper.insertSelective(testAbility);
	}
	
	//1.3
	public void modifyOne(Long year, String fileName, MultipartFile file) throws IllegalStateException, IOException {
		TestAbility testAbility = new TestAbility();
		testAbility.setYear(year);
		if (fileName != null) {
			testAbility.setFileName(fileName);
		}
		if (file != null) {
			TestAbility testAbility2 = testAbilityMapper.selectByPrimaryKey(year);
			String realFileName = testAbility2.getFile();
			if (realFileName != null) {
				File temp = new File(PIC_PATH_LIN + realFileName);
				temp.delete();
			}
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
			testAbility.setFile(file.getOriginalFilename());
		}
		
		testAbilityMapper.updateByPrimaryKeySelective(testAbility);
	}
	
	//1.4
	public ResponseEntity<InputStreamResource> getAnnex(Long year) throws UnsupportedEncodingException {
		TestAbility testAbility = testAbilityMapper.selectByPrimaryKey(year);
		String realFileName = testAbility.getFile();
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + realFileName));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			String fileName = new String(realFileName.getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+fileName);
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();	
		}
	}
	
	//1.5
	public List<TestItem> getAllItem(Long year) {
		TestItemExample testItemExample = new TestItemExample();
		TestItemExample.Criteria criteria = testItemExample.createCriteria();
		criteria.andYearEqualTo(year);
		
		return testAbilityItemMapper.selectByExample(testItemExample);
	}
	
	//1.6
	public void addOneItem(@RequestParam Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		TestItem testItem = objectMapper.convertValue(params, TestItem.class);
		testAbilityItemMapper.insertSelective(testItem);
	}
	
	//1.7
	public void deleteOneItem(Long id) {
		TestItemExample testItemExample = new TestItemExample();
		TestItemExample.Criteria criteria = testItemExample.createCriteria();
		criteria.andIdEqualTo(id);
		
		testAbilityItemMapper.deleteByExample(testItemExample);
	}
}
