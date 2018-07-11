package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cma.dao.SampleIoMapper;
import com.cma.dao.SampleMapper;
import com.cma.pojo.Sample;
import com.cma.pojo.SampleIo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SampleIoService {
	@Autowired
	private SampleMapper sampleMapper;
	
	@Autowired
	private SampleIoMapper sampleIoMapper;
	
	/**
	 * 1.1
	 * @param 
	 * @return
	 */
	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		List<SampleIo> sampleIos = sampleIoMapper.selectAll();
		for (SampleIo sampleIo : sampleIos) {
			Map<String, Object> resultOne = linkResult(sampleIo);
			if (resultOne == null) {
				return null;
			}
			resultOne.put("sampleIoId", sampleIo.getSampleIoId());		
			result.add(resultOne);
		}
		return result;
	}
	
	/**
	 * 1.2
	 * @param sampleIoId
	 * @return
	 */
	public Map<String, Object> getOne(Long sampleIoId) {
		Map<String, Object> result = null;
		SampleIo sampleIo = sampleIoMapper.selectByPrimaryKey(sampleIoId);
		result = linkResult(sampleIo);
		return result;
	}
	
	/**
	 * 1.3
	 * @param params
	 * @return
	 */
	@Transactional
	public Integer addOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		Sample sample = objectMapper.convertValue(params, Sample.class);
		SampleIo sampleIo = objectMapper.convertValue(params, SampleIo.class);
		Sample sampleT = sampleMapper.selectOne(sample);
		if (sampleT == null) {
			return 514;
		}
		sampleIo.setSampleId(sampleT.getSampleId());
		sampleIoMapper.insertSelective(sampleIo);
		return 200;
	}
	
	/**
	 * 1.4
	 * @param sampleId
	 * @return
	 */
	@Transactional
	public Integer deleteOne(Long sampleIoId) {
		sampleIoMapper.deleteByPrimaryKey(sampleIoId);
		return 200;
	}
	
	/**
	 * 1.5
	 * @param params
	 * @return
	 */
	@Transactional
	public Integer modifyOne(Map<String, String> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		Sample sample = objectMapper.convertValue(params, Sample.class);
		SampleIo sampleIo = objectMapper.convertValue(params, SampleIo.class);
		SampleIo sampleIoT = sampleIoMapper.selectByPrimaryKey(sampleIo.getSampleIoId());
		if (sampleIoT == null) {
			return 532;
		}
		sampleIo.setSampleId(null);
		sampleIoMapper.updateByPrimaryKeySelective(sampleIo);
		sample.setSampleId(sampleIoT.getSampleId());
		sampleMapper.updateByPrimaryKeySelective(sample);
		return 200;
	}
	
	@Transactional
	private Map<String, Object> linkResult(SampleIo sampleIo) {
		if (sampleIo == null) {
			return null;
		}
		Sample sample = sampleMapper.selectByPrimaryKey(sampleIo.getSampleId());
		if (sample == null) {
			return null;
		}
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("sampleNumber", sample.getSampleNumber());
		result.put("sampleName", sample.getSampleName());
		result.put("sampleAmount", sample.getSampleAmount());
		result.put("sampleState", sample.getSampleState());
		result.put("receiver", sampleIo.getReceiver());
		result.put("sender", sampleIo.getSender());
		result.put("obtainer", sampleIo.getObtainer());
		result.put("note", sampleIo.getNote());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		result.put("sendDate", sdf.format(sampleIo.getSendDate()));
		result.put("obtainDate", sdf.format(sampleIo.getObtainDate()));
		return result;
	}
}
