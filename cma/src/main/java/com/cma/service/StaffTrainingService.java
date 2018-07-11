package com.cma.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.StaffMapper;
import com.cma.dao.StaffTrainingMapper;
import com.cma.dao.StaffTrainingResultMapper;
import com.cma.pojo.Staff;
import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingExample;
import com.cma.pojo.StaffTrainingResult;
import com.cma.pojo.StaffTrainingResultExample;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StaffTrainingService {
	
	@Autowired
	private StaffMapper staffMapper;
	
	@Autowired
	private StaffTrainingMapper staffTrainingMapper;
	
	@Autowired
	private StaffTrainingResultMapper staffTrainingResultMapper;
	
	@Autowired
	private StaffManagementService staffManagementService;
	
	public static final String PIC_PATH_WIN = "E:\\软件工程项目\\";
	public static final String PIC_PATH_LIN = "/usr/java/project/file/staff_training/";
	
	//4.1
	public List<StaffTraining> getAll() {
		List<StaffTraining> staffTrainingInformation = staffTrainingMapper.selectAll();
		return staffTrainingInformation;
	}
	
	//4.2
	public List<Map<String, Object>> getTrainingPeople(Long trainingId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingResultMapper.selectByExample(staffTrainingResultExample);
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		Iterator<StaffTrainingResult> iter = staffTrainingResultList.iterator();
		while(iter.hasNext()) {
			Staff staff = staffManagementService.queryById(iter.next().getUserId());
			res.put("name", staff.getName());
			res.put("id", staff.getId());
			resList.add(res);
			res = new HashMap<String, Object>();
		}
		return resList;
	}
	
	//4.3
	public List<Map<String, Object>> getAllByStaff(Long userId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<StaffTrainingResult> staffTrainingResultList = staffTrainingResultMapper.selectByExample(staffTrainingResultExample);
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		Iterator<StaffTrainingResult> iter = staffTrainingResultList.iterator();
		while(iter.hasNext()) {
			StaffTraining staffTraining = staffTrainingMapper.selectByPrimaryKey(iter.next().getTrainingId());
			res.put("trainingId", staffTraining.getTrainingId());
			res.put("program", staffTraining.getProgram());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			res.put("trainingDate", sdf.format(staffTraining.getTrainingDate()));
			//res.put("trainingDate", staffTraining.getTrainingDate());
			res.put("place", staffTraining.getPlace());
			res.put("presenter", staffTraining.getPresenter());
			res.put("content", staffTraining.getContent());
			res.put("note", staffTraining.getNote());
			resList.add(res);
			res = new HashMap<String, Object>();
			
		}
		return resList;
	}
	
	//4.4
	public Map<String, Object> getOne(Long id, Long trainingId) {
		Map<String, Object> res = new HashMap<String, Object>();
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		criteria.andTrainingIdEqualTo(trainingId);
		StaffTrainingResult staffTrainingResult = staffTrainingResultMapper.selectOneByExample(staffTrainingResultExample);
		//StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		StaffTraining staffTraining = staffTrainingMapper.selectByPrimaryKey(trainingId);
		res.put("trainingId", trainingId);
		res.put("program", staffTraining.getProgram());
		res.put("result", staffTrainingResult.getResult());
		res.put("note", staffTrainingResult.getNote());
		return res;
	}
	
	//4.5
	public void addOne(String program, String trainingDate, String place, String presenter
			, String content, String note, MultipartFile file) throws IllegalStateException, IOException, ParseException {
		StaffTraining staffTraining = new StaffTraining();
		staffTraining.setProgram(program);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = format.parse(trainingDate);
		staffTraining.setTrainingDate(date);
		staffTraining.setPlace(place);
		staffTraining.setPresenter(presenter);
		staffTraining.setContent(content);
		staffTraining.setNote(note);
		
		if (file != null) {
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
			staffTraining.setFile(file.getOriginalFilename());
		}
		
		staffTrainingMapper.insertSelective(staffTraining);
	}
	
	//4.6
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int addTrainingPeople(Map<String, Object> params) {
		Long trainingId = ((Integer)params.get("trainingId")).longValue();		
		ArrayList<LinkedHashMap> param =  (ArrayList<LinkedHashMap>) params.get("data");
		List<StaffTrainingResult> res = new ArrayList<StaffTrainingResult>();
		for (LinkedHashMap map : param) {
			StaffTrainingResult result = new StaffTrainingResult();
			result.setTrainingId(trainingId);
			result.setUserId(((Integer)map.get("id")).longValue());
			res.add(result);
		}
		staffTrainingResultMapper.insertList(res);
		return 1;
	}
	
	//4.7
	public void addTrainingResult(Map<String,String> params) {
		Long id = Long.parseLong(params.get("id"));
		params.remove("id");
		ObjectMapper objectMapper = new ObjectMapper();
		StaffTrainingResult staffTrainingResult = objectMapper.convertValue(params, StaffTrainingResult.class);
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		criteria.andTrainingIdEqualTo(staffTrainingResult.getTrainingId());
		staffTrainingResult.setUserId(id);
		staffTrainingResultMapper.updateByExampleSelective(staffTrainingResult, staffTrainingResultExample);
	}
	
	//4.8
	public int modifyOne(Long trainingId, String program, String trainingDate, String place, String presenter
			, String content, String note, MultipartFile file) throws ParseException, IllegalStateException, IOException {
		
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		StaffTrainingExample.Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		
		StaffTraining staffTraining = new StaffTraining();
		staffTraining.setTrainingId(trainingId);
		staffTraining.setProgram(program);
		if (trainingDate == "") {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			date = format.parse(trainingDate);
			staffTraining.setTrainingDate(date);
		}
		staffTraining.setPlace(place);
		staffTraining.setPresenter(presenter);
		staffTraining.setContent(content);
		staffTraining.setNote(note);
		
		if (file != null) {
			staffTraining.setFile(file.getOriginalFilename());
			StaffTraining staffTraining2 = staffTrainingMapper.selectOneByExample(staffTrainingExample);
			String fileName = staffTraining2.getFile();
			if (fileName != null) {
				File dest = new File(PIC_PATH_LIN + fileName);
				dest.delete();
			}
			File dest = new File(PIC_PATH_LIN + file.getOriginalFilename());
			file.transferTo(dest);
		}
		
		staffTrainingMapper.updateByPrimaryKeySelective(staffTraining);
		
		return 1;
	}
	
	//4.9
	public Boolean modifyResult(Long id, Long trainingId, String result) {
		Staff staff = staffMapper.selectByPrimaryKey(id);
		if (staff.getIsLeaving() == 1) {
			return false;
		}
		StaffTrainingResult res = new StaffTrainingResult();
		res.setId(id);
		res.setTrainingId(trainingId);
		res.setResult(result);
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		criteria.andTrainingIdEqualTo(trainingId);
		staffTrainingResultMapper.updateByExampleSelective(res, staffTrainingResultExample);
		return true;
	}
	
	//4.10
	public void deleteOne(Long trainingId) {
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		StaffTrainingExample.Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		
		StaffTraining staffTraining = staffTrainingMapper.selectOneByExample(staffTrainingExample);
		String file = staffTraining.getFile();
		if (file != null) {
			File dest = new File(PIC_PATH_LIN + file);
			dest.delete();
		}
		
		staffTrainingMapper.deleteByExample(staffTrainingExample);
	}
	
	//4.11
	public int deleteTrainingPeople(Map<String,String> params) {
		Long id = Long.parseLong(params.get("id"));
		Long trainingId = Long.parseLong(params.get("trainingId"));
		
		StaffTrainingResultExample staffTrainingResultExample = new StaffTrainingResultExample();
		StaffTrainingResultExample.Criteria criteria = staffTrainingResultExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		criteria.andUserIdEqualTo(id);
		staffTrainingResultMapper.deleteByExample(staffTrainingResultExample);
		return 1;
	}
	
	//4.12
	public ResponseEntity<InputStreamResource> getFile(Long trainingId) {
		StaffTrainingExample staffTrainingExample = new StaffTrainingExample();
		com.cma.pojo.StaffTrainingExample.Criteria criteria = staffTrainingExample.createCriteria();
		criteria.andTrainingIdEqualTo(trainingId);
		StaffTraining find = staffTrainingMapper.selectOneByExample(staffTrainingExample);
		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(PIC_PATH_LIN + find.getFile()));
			InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "image/jped");
			ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(inputStreamResource, headers, HttpStatus.OK);
			return response;
			
		} catch (FileNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

}
