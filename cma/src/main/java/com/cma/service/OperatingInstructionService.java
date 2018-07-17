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

import com.cma.dao.OperatingInstructionMapper;
import com.cma.dao.example.OperatingInstructionExample;
import com.cma.dao.example.ProgramFileExample;
import com.cma.pojo.OperatingInstruction;
import com.cma.pojo.ProgramFile;

@Service
public class OperatingInstructionService {

	@Autowired
	OperatingInstructionMapper operatingInstructionMapper;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/operating_instruction/";
	
	//1.1
			public void upload(MultipartFile file, String fileId, String fileName, Byte state, Byte current, String modifyTime,
					String modifier, String modifyContent) throws IllegalStateException, IOException, ParseException {
				
				OperatingInstruction operatingInstruction = new OperatingInstruction();
				operatingInstruction.setFileId(fileId);
				operatingInstruction.setFileName(fileName);
				operatingInstruction.setState(state);
				operatingInstruction.setCurrent(current);
				if (modifyTime != null) {
					DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					Date date = null;
					date = format.parse(modifyTime);
					operatingInstruction.setModifyTime(date);
				}
				if (modifier != null)
					operatingInstruction.setModifier(modifier);
				if (modifyContent != null)
					operatingInstruction.setModifyContent(modifyContent);
				operatingInstruction.setFile(file.getOriginalFilename());
				File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
				file.transferTo(dest);
				
				operatingInstructionMapper.insertSelective(operatingInstruction);
			}
			
			//1.2
			public OperatingInstruction getCurrent() {
				OperatingInstructionExample operatingInstructionExample = new OperatingInstructionExample();
				OperatingInstructionExample.Criteria criteria = operatingInstructionExample.createCriteria();
				criteria.andCurrentEqualTo((byte) 1);
				
				return operatingInstructionMapper.selectOneByExample(operatingInstructionExample);
			}
			
			//1.3
			public ResponseEntity<InputStreamResource> getCurrentFile() throws UnsupportedEncodingException {
				OperatingInstructionExample operatingInstructionExample = new OperatingInstructionExample();
				OperatingInstructionExample.Criteria criteria = operatingInstructionExample.createCriteria();
				criteria.andCurrentEqualTo((byte) 1);
				OperatingInstruction operatingInstruction = new OperatingInstruction();
				operatingInstruction = operatingInstructionMapper.selectOneByExample(operatingInstructionExample);
				String realFileName = operatingInstruction.getFile();
				
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
			public List<OperatingInstruction> getAllHistory () {
				
				OperatingInstructionExample operatingInstructionExample = new OperatingInstructionExample();
				OperatingInstructionExample.Criteria criteria = operatingInstructionExample.createCriteria();
				criteria.andCurrentEqualTo((byte) 0);
				
				return operatingInstructionMapper.selectByExample(operatingInstructionExample);
			}
			
			//1.5
			public ResponseEntity<InputStreamResource> getHistoryFile(Long id) throws UnsupportedEncodingException {
				OperatingInstruction operatingInstruction = operatingInstructionMapper.selectByPrimaryKey(id);
				String realFileName = operatingInstruction.getFile();
				
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
				
				OperatingInstruction operatingInstruction2 = new OperatingInstruction();
				OperatingInstructionExample operatingInstructionExample = new OperatingInstructionExample();
				OperatingInstructionExample.Criteria criteria = operatingInstructionExample.createCriteria();
				criteria.andCurrentEqualTo((byte) 1);
				operatingInstruction2 = operatingInstructionMapper.selectOneByExample(operatingInstructionExample);
				operatingInstruction2.setId(getCurrent().getId());
				operatingInstruction2.setCurrent((byte) 0);
				operatingInstructionMapper.updateByPrimaryKeySelective(operatingInstruction2);
				
				OperatingInstruction operatingInstruction = new OperatingInstruction();
				operatingInstruction.setFileId(fileId);
				operatingInstruction.setFileName(fileName);
				DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date date = null;
				date = format.parse(modifyTime);
				operatingInstruction.setModifyTime(date);
				operatingInstruction.setModifyContent(modifyContent);
				operatingInstruction.setModifier(modifier);
				operatingInstruction.setCurrent((byte) 1);
				operatingInstruction.setState((byte) 0);
				
				operatingInstruction.setFile(file.getOriginalFilename());
				File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
				file.transferTo(dest);
				
				operatingInstructionMapper.insertSelective(operatingInstruction);
			}
			
			//1.7
			public void delete(Long id) {
				OperatingInstruction operatingInstruction = operatingInstructionMapper.selectByPrimaryKey(id);
				String realFileName = operatingInstruction.getFile();
				if (realFileName != null) {
					File dest = new File(PIC_PATH_LIN + realFileName);
					dest.delete();
				}
				operatingInstructionMapper.deleteByPrimaryKey(id);
			}

			//1.8
			public void approve(Long id, Byte state) {
				OperatingInstruction operatingInstruction =  new OperatingInstruction();
				operatingInstruction.setId(id);
				operatingInstruction.setState(state);
				operatingInstructionMapper.updateByPrimaryKeySelective(operatingInstruction);
			}
}
