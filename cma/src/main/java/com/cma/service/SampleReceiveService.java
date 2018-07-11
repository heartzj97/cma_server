package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cma.dao.SampleMapper;
import com.cma.dao.SampleReceiveMapper;
import com.cma.dao.example.SampleReceiveExample;
import com.cma.dao.example.SampleReceiveExample.Criteria;
import com.cma.pojo.Sample;
import com.cma.pojo.SampleReceive;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class SampleReceiveService {

	@Autowired
	private SampleMapper sampleMapper;
	
	@Autowired
	private SampleReceiveMapper sampleReceiveMapper;
	
	/**
	 * 1.1
	 * @param 
	 * @return
	 */
	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		List<Sample> samples = sampleMapper.selectAll();
		for (Sample sample : samples) {		
			Map<String, Object> resultOne = linkResult(sample);
			if (resultOne == null) {
				return null;
			}
			resultOne.put("sampleId", sample.getSampleId());		
			result.add(resultOne);
		}
		return result;
	}
	
	/**
	 * 1.2
	 * @param sampleId
	 * @return
	 */
	public Map<String, Object> getOne(Long sampleId) {
		Map<String, Object> result = null;
		Sample sample = sampleMapper.selectByPrimaryKey(sampleId);
		result = linkResult(sample);
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
		SampleReceive sampleReceive = objectMapper.convertValue(params, SampleReceive.class);
		sampleMapper.insert(sample);
		Long sampleId = sampleMapper.selectOne(sample).getSampleId();
		sampleReceive.setSampleId(sampleId);
		sampleReceiveMapper.insert(sampleReceive);
		return 200;
	}
	
	/**
	 * 1.4
	 * @param sampleId
	 * @return
	 */
	@Transactional
	public Integer deleteOne(Long sampleId) {
		Sample sample = sampleMapper.selectByPrimaryKey(sampleId);
		if (sample == null) {
			return 522;
		}
		sampleMapper.deleteByPrimaryKey(sampleId);
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
		SampleReceive sampleReceive = objectMapper.convertValue(params, SampleReceive.class);
		sampleMapper.updateByPrimaryKeySelective(sample);
		SampleReceiveExample sampleReceiveExample = new SampleReceiveExample();
		Criteria criteria = sampleReceiveExample.createCriteria();
		criteria.andSampleIdEqualTo(sample.getSampleId());
		sampleReceiveMapper.updateByExampleSelective(sampleReceive, sampleReceiveExample);
		return 200;
	}
	
	@Transactional
	private Map<String, Object> linkResult(Sample sample) {
		SampleReceiveExample sampleReceiveExample = new SampleReceiveExample();
		Criteria criteria = sampleReceiveExample.createCriteria();
		criteria.andSampleIdEqualTo(sample.getSampleId());
		SampleReceive sampleReceive = sampleReceiveMapper.selectOneByExample(sampleReceiveExample);
		if (sample == null || sampleReceive == null) {
			return null;
		}
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("sampleNumber", sample.getSampleNumber());
		result.put("sampleName", sample.getSampleName());
		result.put("sampleAmount", sample.getSampleAmount());
		result.put("sampleState", sample.getSampleState());
		result.put("requester", sampleReceive.getRequester());
		result.put("receiver", sampleReceive.getReceiver());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		result.put("receiveDate", sdf.format(sampleReceive.getReceiveDate()));
		result.put("obtainer", sampleReceive.getObtainer());
		result.put("obtainDate", sdf.format(sampleReceive.getObtainDate()));
		return result;
	}
}
