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

import com.cma.dao.CapacityVerificationPlanMapper;
import com.cma.dao.example.CapacityVerificationPlanExample;
import com.cma.pojo.CapacityVerificationPlan;

import com.cma.dao.CapacityVerificationProjectMapper;
import com.cma.dao.example.CapacityVerificationProjectExample;
import com.cma.pojo.CapacityVerificationProject;

import com.cma.dao.CapacityVerificationRecordMapper;
import com.cma.dao.example.CapacityVerificationRecordExample;
import com.cma.dao.example.ManagementReviewFileExample;
import com.cma.pojo.CapacityVerificationRecord;
import com.cma.pojo.IntermediateChecksPlan;
import com.cma.pojo.ManagementReviewFile;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CapacityVerificationService {

	public static final String PIC_PATH_LIN = "/usr/java/project/file/capacity_verification/";
	
	@Autowired
	CapacityVerificationPlanMapper capacityVerificationPlanMapper;
	@Autowired
	CapacityVerificationProjectMapper capacityVerificationProjectMapper;
	@Autowired
	CapacityVerificationRecordMapper capacityVerificationRecordMapper;
	

	//1.1
	public List<CapacityVerificationPlan> getAll() {
		List<CapacityVerificationPlan> ans = capacityVerificationPlanMapper.selectAll();
		return ans;
	}
	//1.2
	public void addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		CapacityVerificationPlan capacityVerificationPlan = objectMapper.convertValue(params, CapacityVerificationPlan.class);
		capacityVerificationPlan.setState((long) 0);
		capacityVerificationPlanMapper.insert(capacityVerificationPlan);
	}
	//1.3
	public void deleteOne(Long id) {
		CapacityVerificationPlanExample capacityVerificationPlanExample = new CapacityVerificationPlanExample();
		CapacityVerificationPlanExample.Criteria criteria = capacityVerificationPlanExample.createCriteria();
		criteria.andPlanIdEqualTo(id);
		
		capacityVerificationPlanMapper.deleteByExample(capacityVerificationPlanExample);
	}
	//1.4
	public void modifyOne(Map<String, String> params) {
		Long planId = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		CapacityVerificationPlan capacityVerificationPlan = objectMapper.convertValue(params, CapacityVerificationPlan.class);
		capacityVerificationPlan.setPlanId(planId);
		capacityVerificationPlanMapper.updateByPrimaryKeySelective(capacityVerificationPlan);
	}
	//1.5
	public CapacityVerificationPlan getOne(Long id) {
		CapacityVerificationPlan capacityVerificationPlan = capacityVerificationPlanMapper.selectByPrimaryKey(id);
		return capacityVerificationPlan;
	}
	
	//1.6
	public void uploadAnalysis(Long id, MultipartFile analysis) throws IllegalStateException, IOException {
		CapacityVerificationPlan capacityVerificationPlan = capacityVerificationPlanMapper.selectByPrimaryKey(id);
		if (analysis != null) {
			capacityVerificationPlan.setAnalysis(analysis.getOriginalFilename());
			File dest = new File(PIC_PATH_LIN + analysis.getOriginalFilename());
			analysis.transferTo(dest);
		}
		
		capacityVerificationPlanMapper.updateByPrimaryKeySelective(capacityVerificationPlan);
	}
	//1.7
	public ResponseEntity<InputStreamResource> downloadAnalysis(Long id) throws UnsupportedEncodingException {
		
		CapacityVerificationPlan capacityVerificationPlan = capacityVerificationPlanMapper.selectByPrimaryKey(id);
		String realAnalysisName = capacityVerificationPlan.getAnalysis();
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + realAnalysisName));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/octet-stream");
			realAnalysisName = new String(realAnalysisName.getBytes("gbk"),"iso8859-1");
			headers.add("Content-Disposition", "attachment;filename="+realAnalysisName);
			ResponseEntity<InputStreamResource> response = 
					new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();	
		}
	}
	//1.8
	public void deleteAnalysis(Long id) {
		CapacityVerificationPlan capacityVerificationPlan = capacityVerificationPlanMapper.selectByPrimaryKey(id);
		String realAnalysisName = capacityVerificationPlan.getAnalysis();
		if (realAnalysisName != null) {
			File dest = new File(PIC_PATH_LIN + realAnalysisName);
			dest.delete();
		}
		
		capacityVerificationPlan.setAnalysis(null);
		capacityVerificationPlanMapper.updateByPrimaryKeySelective(capacityVerificationPlan);
	}
	
	
	
	
	//2.1
	public List<CapacityVerificationProject> getAllProject(Long planId) {
		CapacityVerificationProjectExample capacityVerificationProjectExample = new CapacityVerificationProjectExample();
		CapacityVerificationProjectExample.Criteria criteria = capacityVerificationProjectExample.createCriteria();
		criteria.andPlanIdEqualTo(planId);
		
		return capacityVerificationProjectMapper.selectByExample(capacityVerificationProjectExample);
	}
	//2.2
	public void addOneProject(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		CapacityVerificationProject capacityVerificationProject = objectMapper.convertValue(params, CapacityVerificationProject.class);
		capacityVerificationProject.setState((long) 0);
		capacityVerificationProjectMapper.insert(capacityVerificationProject);
	}
	//2.3
	public void deleteOneProject(Long id) {
		CapacityVerificationProjectExample capacityVerificationProjectExample = new CapacityVerificationProjectExample();
		CapacityVerificationProjectExample.Criteria criteria = capacityVerificationProjectExample.createCriteria();
		criteria.andProjectIdEqualTo(id);
		
		capacityVerificationProjectMapper.deleteByExample(capacityVerificationProjectExample);
	}
	//2.4
	public void modifyOneProject(Map<String, String> params) {
		Long projectId = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		CapacityVerificationProject capacityVerificationProject = objectMapper.convertValue(params, CapacityVerificationProject.class);
		capacityVerificationProject.setProjectId(projectId);
		capacityVerificationProjectMapper.updateByPrimaryKeySelective(capacityVerificationProject);
	}
	//2.5
	public CapacityVerificationProject getOneProject(Long id) {
		CapacityVerificationProject capacityVerificationProject = capacityVerificationProjectMapper.selectByPrimaryKey(id);
		return capacityVerificationProject;
	}
	
	
	
	//3.1
	public void addOneRecord(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		CapacityVerificationRecord capacityVerificationRecord = objectMapper.convertValue(params, CapacityVerificationRecord.class);
		capacityVerificationRecordMapper.insert(capacityVerificationRecord);
	}
	//3.2
	public void deleteOneRecord(Long id) {
		CapacityVerificationRecordExample capacityVerificationRecordExample = new CapacityVerificationRecordExample();
		CapacityVerificationRecordExample.Criteria criteria = capacityVerificationRecordExample.createCriteria();
		criteria.andRecordIdEqualTo(id);
		
		capacityVerificationRecordMapper.deleteByExample(capacityVerificationRecordExample);
	}
	//3.3
	public void modifyOneRecord(Map<String, String> params) {
		Long recordId = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		CapacityVerificationRecord capacityVerificationRecord = objectMapper.convertValue(params, CapacityVerificationRecord.class);
		capacityVerificationRecord.setRecordId(recordId);
		capacityVerificationRecordMapper.updateByPrimaryKeySelective(capacityVerificationRecord);
	}
	//3.4
	public CapacityVerificationRecord getOneRecord(Long id) {
		CapacityVerificationRecord capacityVerificationRecord = capacityVerificationRecordMapper.selectByPrimaryKey(id);
		return capacityVerificationRecord;
	}
	//3.5
	public List<CapacityVerificationRecord> getRecordByProjectId(Long projectId) {
		CapacityVerificationRecordExample capacityVerificationRecordExample = new CapacityVerificationRecordExample();
		CapacityVerificationRecordExample.Criteria criteria = capacityVerificationRecordExample.createCriteria();
		criteria.andProjectIdEqualTo(projectId);
		
		return capacityVerificationRecordMapper.selectByExample(capacityVerificationRecordExample);
	}
	
}