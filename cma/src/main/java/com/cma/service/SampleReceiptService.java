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
import com.cma.dao.SampleReceiptMapper;
import com.cma.dao.SampleReceiptMaterialListMapper;
import com.cma.dao.example.SampleReceiptExample;
import com.cma.dao.example.SampleReceiptMaterialListExample;
import com.cma.pojo.SampleReceipt;
import com.cma.pojo.SampleReceiptMaterialList;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SampleReceiptService {
	@Autowired
	private SampleMapper sampleMapper;

	@Autowired
	private SampleReceiptMapper sampleReceiptMapper;
	
	@Autowired
	private SampleReceiptMaterialListMapper sampleReceiptMaterialListMapper;
	
	/**
	 * 3.1
	 * @param sampleId
	 * @return
	 */
	public SampleReceipt getOne(Long sampleId) {
		SampleReceiptExample sampleReceiptExample = new SampleReceiptExample();
		SampleReceiptExample.Criteria criteria = sampleReceiptExample.createCriteria();
		criteria.andSampleIdEqualTo(sampleId);
		SampleReceipt sampleReceipt = sampleReceiptMapper.selectOneByExample(sampleReceiptExample);
		List<Map<String, Object>> materialList = linkMeterialList(sampleReceipt.getId());
		sampleReceipt.setMaterialList(materialList);
		sampleMapper.selectByPrimaryKey(sampleId);
		return sampleReceipt;
	}
	
	/**
	 * 3.2
	 * @param params
	 * @return
	 */
	@Transactional
	public Integer addOne(Map<String, Object> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		SampleReceipt sampleReceipt = objectMapper.convertValue(params, SampleReceipt.class);
		sampleReceiptMapper.insert(sampleReceipt);
		SampleReceipt sampleReceiptT = sampleReceiptMapper.selectOne(sampleReceipt);
		if (sampleReceiptT == null) {
			return 500;
		}
		List<SampleReceiptMaterialList> sampleReceiptmaterialList = new ArrayList<SampleReceiptMaterialList>();
		List<Map<String, Object>> materialList = sampleReceipt.getMaterialList();
		for (Map<String, Object> material : materialList) {
			SampleReceiptMaterialList sampleReceiptMaterial = objectMapper.convertValue(material, SampleReceiptMaterialList.class);
			sampleReceiptMaterial.setReceiptId(sampleReceiptT.getId());
			sampleReceiptmaterialList.add(sampleReceiptMaterial);
		}
		sampleReceiptMaterialListMapper.insertList(sampleReceiptmaterialList);
		return 200;
	}
	
	/**
	 * 3.3
	 * @param sampleId
	 * @return
	 */
	@Transactional
	public Integer deleteOne(Long sampleId) {
		SampleReceiptExample sampleReceiptExample = new SampleReceiptExample();
		SampleReceiptExample.Criteria criteria = sampleReceiptExample.createCriteria();
		criteria.andSampleIdEqualTo(sampleId);
		sampleReceiptMapper.deleteByExample(sampleReceiptExample);
		return 200;
	}
	
	/**
	 * 3.4
	 * @param params
	 * @return
	 */
	@Transactional
	public Integer modifyOne(Map<String, Object> params) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		SampleReceipt sampleReceipt = objectMapper.convertValue(params, SampleReceipt.class);
		
		SampleReceiptExample sampleReceiptExample = new SampleReceiptExample();
		SampleReceiptExample.Criteria criteria = sampleReceiptExample.createCriteria();
		criteria.andSampleIdEqualTo(sampleReceipt.getSampleId());
		
		SampleReceipt sampleReceiptT = sampleReceiptMapper.selectOneByExample(sampleReceiptExample);
		if (sampleReceiptT == null) {
			return 500;
		}
		sampleReceiptMapper.updateByExampleSelective(sampleReceipt, sampleReceiptExample);
		List<Map<String, Object>> materialList = sampleReceipt.getMaterialList();
		if (materialList != null) {	
			for (Map<String, Object> material : materialList) {
				SampleReceiptMaterialList sampleReceiptMaterial = objectMapper.convertValue(material, SampleReceiptMaterialList.class);
				SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
				SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
				criteriaT.andReceiptIdEqualTo(sampleReceiptT.getId());
				criteriaT.andMaterialIdEqualTo((Long)material.get("materialId"));
				sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterial, sampleReceiptMaterialListExample);
			}
		}
		
		return 200;
	}
	
	private List<Map<String, Object>> linkMeterialList(Long receiptId) {
		SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
		SampleReceiptMaterialListExample.Criteria criteria = sampleReceiptMaterialListExample.createCriteria();
		criteria.andReceiptIdEqualTo(receiptId);
		List<SampleReceiptMaterialList> materialList = sampleReceiptMaterialListMapper.selectByExample(sampleReceiptMaterialListExample);
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (SampleReceiptMaterialList material : materialList) {
			Map<String, Object> temp = new HashMap<String, Object>();
			temp.put("materialId", material.getMaterialId());
			temp.put("materialType", material.getMaterialType());
			result.add(temp);
		}		
		return result;
	}
	
}
