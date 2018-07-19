package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.ProgramFileMapper;
import com.cma.dao.example.ProgramFileExample;
import com.cma.dao.example.QualityManualExample;
import com.cma.pojo.ProgramFile;
import com.cma.pojo.QualityManual;

@Service
public class ProgramFileService {

	@Autowired
	ProgramFileMapper programFileMapper;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/program_file/";
	
	//1.1
		public void upload(MultipartFile file, String fileId, String fileName, Byte state, Byte current, String modifyTime,
				String modifier, String modifyContent) throws IllegalStateException, IOException, ParseException {
			
			ProgramFile programFile = new ProgramFile();
			programFile.setFileId(fileId);
			programFile.setFileName(fileName);
			programFile.setState(state);
			programFile.setCurrent(current);
			if (modifyTime != null) {
				DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date date = null;
				date = format.parse(modifyTime);
				programFile.setModifyTime(date);
			}
			if (modifier != null)
				programFile.setModifier(modifier);
			if (modifyContent != null)
				programFile.setModifyContent(modifyContent);
			programFile.setFile(file.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
			
			programFileMapper.insertSelective(programFile);
		}
		
		//1.2
		public ProgramFile getCurrent() {
			ProgramFileExample programFileExample = new ProgramFileExample();
			ProgramFileExample.Criteria criteria = programFileExample.createCriteria();
			criteria.andCurrentEqualTo((byte) 1);
			
			return programFileMapper.selectOneByExample(programFileExample);
		}
		
		//1.3
		public ResponseEntity<InputStreamResource> getCurrentFile() throws UnsupportedEncodingException {
			ProgramFileExample programFileExample = new ProgramFileExample();
			ProgramFileExample.Criteria criteria = programFileExample.createCriteria();
			criteria.andCurrentEqualTo((byte) 1);
			ProgramFile programFile = new ProgramFile();
			programFile = programFileMapper.selectOneByExample(programFileExample);
			String realFileName = programFile.getFile();
			
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
		
		//1.4
		public List<ProgramFile> getAllHistory () {
			
			ProgramFileExample programFileExample = new ProgramFileExample();
			ProgramFileExample.Criteria criteria = programFileExample.createCriteria();
			criteria.andCurrentEqualTo((byte) 0);
			
			return programFileMapper.selectByExample(programFileExample);
		}
		
		//1.5
		public ResponseEntity<InputStreamResource> getHistoryFile(Long id) throws UnsupportedEncodingException {
			ProgramFile programFile = programFileMapper.selectByPrimaryKey(id);
			String realFileName = programFile.getFile();
			
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
		
		//1.6
		public void modify(MultipartFile file, String fileId, String fileName, String modifyTime,
				String modifier, String modifyContent) throws ParseException, IllegalStateException, IOException {
			
			ProgramFile programFile = new ProgramFile();
			programFile.setFileId(fileId);
			programFile.setFileName(fileName);
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			date = format.parse(modifyTime);
			programFile.setModifyTime(date);
			programFile.setModifyContent(modifyContent);
			programFile.setModifier(modifier);
			programFile.setCurrent((byte) 1);
			programFile.setState((byte) 0);
			
			programFile.setFile(file.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
			
			programFileMapper.insertSelective(programFile);
		}
		
		//1.7
		public void delete(Long id) {
			ProgramFile programFile = programFileMapper.selectByPrimaryKey(id);
			String realFileName = programFile.getFile();
			if (realFileName != null) {
				File dest = new File(PIC_PATH_LIN + realFileName);
				dest.delete();
			}
			programFileMapper.deleteByPrimaryKey(id);
		}

		//1.8
		public void approve(Long id, Byte state) {
			if (state == 2) {
				ProgramFile programFile2 =  getCurrent();
				programFile2.setCurrent((byte) 0);
				programFileMapper.updateByPrimaryKeySelective(programFile2);
				
				ProgramFile programFile =  new ProgramFile();
				programFile.setId(id);
				programFile.setState(state);
				programFile.setCurrent((byte) 1);
				programFileMapper.updateByPrimaryKeySelective(programFile);
			}
			else {
				ProgramFile programFile =  new ProgramFile();
				programFile.setId(id);
				programFile.setState(state);
				programFileMapper.updateByPrimaryKeySelective(programFile);
			}
		}
		
		//1.9
				public List<ProgramFile> getApprove () {
					
					ProgramFileExample programFileExample = new ProgramFileExample();
					ProgramFileExample.Criteria criteria = programFileExample.createCriteria();
					criteria.andCurrentEqualTo((byte) 0);
					criteria.andStateNotEqualTo((byte) 2);
					
					return programFileMapper.selectByExample(programFileExample);
				}
}
