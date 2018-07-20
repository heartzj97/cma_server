package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.pojo.CapacityVerificationPlan;
import com.cma.pojo.CapacityVerificationProject;
import com.cma.pojo.CapacityVerificationRecord;
import com.cma.service.CapacityVerificationService;
import com.cma.util.Result;

@RestController
@RequestMapping("/CapacityVerification")
public class CapacityVerificationController {
	
	@Autowired
	CapacityVerificationService capacityVerificationService;

	
	//1.1
	@GetMapping("/getAll")
	public Result getAll() {
		List<CapacityVerificationPlan> data = capacityVerificationService.getAll();
		return Result.ok(data);
	}
	

	//1.2
	@PostMapping("/addOne")
	public Result addOne(@RequestParam Map<String, String> params) {
		capacityVerificationService.addOne(params);
		return Result.ok();
	}
	
	//1.3
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("id") Long id) {
		if(capacityVerificationService.deleteOne(id)==0)
			return Result.ok();
		else
			return Result.errorMsg("some project has been executed, can't delete");
	}
	
	//1.4
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam Map<String, String> params) {
		capacityVerificationService.modifyOne(params);
		return Result.ok();
	}


	//1.5
	@GetMapping("/getOne")
	public Result getOne(@RequestParam("id") Long id) {
		CapacityVerificationPlan capacityVerificationPlan = capacityVerificationService.getOne(id);
		return Result.ok(capacityVerificationPlan);
	}
	
	//1.6
	@PostMapping("/uploadAnalysis")
	public Result uploadAnalysis(@RequestParam("id") Long id, @RequestParam("analysis")  MultipartFile analysis) throws IllegalStateException, IOException {
		int judge = capacityVerificationService.uploadAnalysis(id,analysis);
		if(judge==0)
			return Result.ok();
		else if(judge==2)
			return Result.errorMsg("fileName already exists,please change it");
		else
			return Result.errorMsg("please choose a file");
	} 
	
	//1.7
	@GetMapping("/downloadAnalysis")
	public ResponseEntity<InputStreamResource> downloadAnalysis(@RequestParam("id") Long id) throws UnsupportedEncodingException {
		return capacityVerificationService.downloadAnalysis(id);
	}
	
	//1.8
	@PostMapping("/deleteAnalysis")
	public Result deleteAnalysis(@RequestParam("id") Long id) {
		capacityVerificationService.deleteAnalysis(id);
		return Result.ok();
	}
	
	
	
	
	
	//2.1
	@GetMapping("/getAllProject")
	public Result getAllProject(@RequestParam("planId") Long planId) {
		List<CapacityVerificationProject> data = capacityVerificationService.getAllProject(planId);
		return Result.ok(data);
	}
	
	//2.2
	@PostMapping("/addOneProject")
	public Result addOneProject(@RequestParam Map<String, String> params) {
		capacityVerificationService.addOneProject(params);
		return Result.ok();
	}
	
	//2.3
	@PostMapping("/deleteOneProject")
	public Result deleteOneProject(@RequestParam("id") Long id) {
		if(capacityVerificationService.deleteOneProject(id)==0)
			return Result.ok();
		else
			return Result.errorMsg("please delete its record first");
	}
	
	//2.4
	@PostMapping("/modifyOneProject")
	public Result modifyOneProject(@RequestParam Map<String, String> params) {
		capacityVerificationService.modifyOneProject(params);
		return Result.ok();
	}
	
	//2.5
	@GetMapping("/getOneProject")
	public Result getOneProject(@RequestParam("id") Long id) {
		CapacityVerificationProject capacityVerificationProject = capacityVerificationService.getOneProject(id);
		return Result.ok(capacityVerificationProject);
	}
	
	
	
	//3.1
	@PostMapping("/addOneRecord")
	public Result addOneRecord(@RequestParam Map<String, String> params) {
		capacityVerificationService.addOneRecord(params);
		return Result.ok();
	}
	
	//3.2
	@PostMapping("/deleteOneRecord")
	public Result deleteOneRecord(@RequestParam("id") Long id) {
		capacityVerificationService.deleteOneRecord(id);
		return Result.ok();
	}
	
	//3.3
	@PostMapping("/modifyOneRecord")
	public Result modifyOneRecord(@RequestParam Map<String, String> params) {
		capacityVerificationService.modifyOneRecord(params);
		return Result.ok();
	}
	
	//3.4
	@GetMapping("/getOneRecord")
	public Result getOneRecord(@RequestParam("id") Long id) {
		CapacityVerificationRecord capacityVerificationRecord = capacityVerificationService.getOneRecord(id);
		return Result.ok(capacityVerificationRecord);
	}
	
	//3.5
	@GetMapping("/getRecordByProjectId")
	public Result getRecordByProjectId(@RequestParam("projectId") Long projectId) {
		CapacityVerificationRecord data = capacityVerificationService.getRecordByProjectId(projectId);
		return Result.ok(data);
	}
	
	
}