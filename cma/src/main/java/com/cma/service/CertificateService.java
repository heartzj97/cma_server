package com.cma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cma.dao.CertificateMapper;
import com.cma.pojo.Certificate;

@Service
public class CertificateService {
	
	@Autowired
	private CertificateMapper certificateMapper;

	/**
	 * 1.1
	 */
	public List<Certificate> getAll() {
		List<Certificate> result = certificateMapper.selectAll();
		return result;
	}
	
	/**
	 * 1.2
	 */
	public Certificate getOne(Long id) {
		
		return null;
	}
	
	/**
	 * 1.3
	 */
	public Integer addOne(MultipartFile file) {
		return 200;
	}
	
	/**
	 * 1.4
	 */
	public Integer deleteOne(Long id) {
		certificateMapper.deleteByPrimaryKey(id);
		return 200;
	}
	
	/**
	 * 1.5
	 */
	public Integer modifyOne(Map<String, String> params) {
		
		return 200;
	}
	
}
