package com.cma.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cma.pojo.Certificate;
import com.cma.service.CertificateService;
import com.cma.util.Result;

@RestController	
@RequestMapping("/Certificate")
public class CertificateController {
	
	@Autowired
	private CertificateService certificateService;

	/**
	 * 1.1
	 */
	@GetMapping("/getAll")
	public Result getAll() {
		List<Certificate> data = certificateService.getAll();
		return Result.ok(data);
	}
	
	/**
	 * 1.2
	 * @throws UnsupportedEncodingException 
	 */
	@GetMapping("/getOne")
	public ResponseEntity<InputStreamResource> getOne(@RequestParam("fileId") Long id) throws UnsupportedEncodingException {
		ResponseEntity<InputStreamResource> data = certificateService.getOne(id);
		return data;
	}
	
	/**
	 * 1.3
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/addOne")
	public Result addOne(@RequestParam("fileId") Long fileId,
			@RequestParam("fileName") String fileName,
			@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		Integer code = certificateService.addOne(fileId, fileName, file);
		return Result.ok();
	}
	
	/**
	 * 1.4
	 */
	@PostMapping("/deleteOne")
	public Result deleteOne(@RequestParam("fileId") Long id) {
		Integer code = certificateService.deleteOne(id);
		return Result.ok();
	}
	
	/**
	 * 1.5
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/modifyOne")
	public Result modifyOne(@RequestParam("id") Long id,
			@RequestParam("fileId") String fileId,
			@RequestParam("fileName") String fileName,
			@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		Integer code = certificateService.modifyOne(id, fileId, fileName, file);
		return Result.ok();
	}
	
}
