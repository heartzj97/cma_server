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

import com.cma.dao.QualityManualMapper;
import com.cma.dao.example.QualityManualExample;
import com.cma.pojo.QualityManual;

@Service
public class QualityManualService {

	@Autowired
	QualityManualMapper qualityManualMapper;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/quality_manual/";
	
	//1.1
	public void upload(MultipartFile file, String fileId, String fileName, Byte state, Byte current, String modifyTime,
			String modifier, String modifyContent) throws IllegalStateException, IOException, ParseException {
		
		QualityManual qualityManual = new QualityManual();
		qualityManual.setFileId(fileId);
		qualityManual.setFileName(fileName);
		qualityManual.setState(state);
		qualityManual.setCurrent(current);
		if (modifyTime != null) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			date = format.parse(modifyTime);
			qualityManual.setModifyTime(date);
		}
		if (modifier != null)
			qualityManual.setModifier(modifier);
		if (modifyContent != null)
			qualityManual.setModifyContent(modifyContent);
		qualityManual.setFile(file.getOriginalFilename());
		File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
		file.transferTo(dest);
		
		qualityManualMapper.insertSelective(qualityManual);
	}
	
	//1.2
	public QualityManual getCurrent() {
		QualityManualExample qualityManualExample = new QualityManualExample();
		QualityManualExample.Criteria criteria = qualityManualExample.createCriteria();
		criteria.andCurrentEqualTo((byte) 1);
		
		return qualityManualMapper.selectOneByExample(qualityManualExample);
	}
	
	//1.3
	public ResponseEntity<InputStreamResource> getCurrentFile() throws UnsupportedEncodingException {
		QualityManualExample qualityManualExample = new QualityManualExample();
		QualityManualExample.Criteria criteria = qualityManualExample.createCriteria();
		criteria.andCurrentEqualTo((byte) 1);
		QualityManual qualityManual = new QualityManual();
		qualityManual = qualityManualMapper.selectOneByExample(qualityManualExample);
		String realFileName = qualityManual.getFile();
		
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
	public List<QualityManual> getAllHistory () {
		
		QualityManualExample qualityManualExample = new QualityManualExample();
		QualityManualExample.Criteria criteria = qualityManualExample.createCriteria();
		criteria.andCurrentEqualTo((byte) 0);
		criteria.andStateEqualTo((byte) 2);
		
		return qualityManualMapper.selectByExample(qualityManualExample);
	}
	
	//1.5
	public ResponseEntity<InputStreamResource> getHistoryFile(Long id) throws UnsupportedEncodingException {
		QualityManual qualityManual = qualityManualMapper.selectByPrimaryKey(id);
		String realFileName = qualityManual.getFile();
		
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
		
		
		QualityManual qualityManual = new QualityManual();
		qualityManual.setFileId(fileId);
		qualityManual.setFileName(fileName);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = format.parse(modifyTime);
		qualityManual.setModifyTime(date);
		qualityManual.setModifyContent(modifyContent);
		qualityManual.setModifier(modifier);
		qualityManual.setCurrent((byte) 0);
		qualityManual.setState((byte) 0);
		
		qualityManual.setFile(file.getOriginalFilename());
		File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
		file.transferTo(dest);
		
		qualityManualMapper.insertSelective(qualityManual);
	}
	
	//1.7
	public void delete(Long id) {
		QualityManual qualityManual = qualityManualMapper.selectByPrimaryKey(id);
		String realFileName = qualityManual.getFile();
		if (realFileName != null) {
			File dest = new File(PIC_PATH_LIN + realFileName);
			dest.delete();
		}
		qualityManualMapper.deleteByPrimaryKey(id);
	}

	//1.8
	public void approve(Long id, Byte state) {
		
		if (state == 2) {
			QualityManual qualityManual2 =  getCurrent();
			qualityManual2.setCurrent((byte) 0);
			qualityManualMapper.updateByPrimaryKeySelective(qualityManual2);
			
			QualityManual qualityManual =  new QualityManual();
			qualityManual.setId(id);
			qualityManual.setState(state);
			qualityManual.setCurrent((byte) 1);
			qualityManualMapper.updateByPrimaryKeySelective(qualityManual);
		}
		else {
			QualityManual qualityManual =  new QualityManual();
			qualityManual.setId(id);
			qualityManual.setState(state);
			qualityManualMapper.updateByPrimaryKeySelective(qualityManual);
		}
		
	}
	
	//1.9
		public List<QualityManual> getApprove () {
			
			QualityManualExample qualityManualExample = new QualityManualExample();
			QualityManualExample.Criteria criteria = qualityManualExample.createCriteria();
			criteria.andCurrentEqualTo((byte) 0);
			criteria.andStateNotEqualTo((byte) 2);
			
			return qualityManualMapper.selectByExample(qualityManualExample);
		}
}
