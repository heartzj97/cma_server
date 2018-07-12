package com.cma.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cma.dao.SampleMapper;
import com.cma.dao.SampleMaterialListMapper;
import com.cma.dao.SampleReceiptMapper;
import com.cma.dao.SampleReceiptMaterialListMapper;
import com.cma.dao.example.SampleReceiptExample;
import com.cma.dao.example.SampleReceiptMaterialListExample;
import com.cma.pojo.Sample;
import com.cma.pojo.SampleMaterialList;
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
	
	@Autowired
	private SampleMaterialListMapper sampleMaterialListMapper;

	/**
	 * 3.1
	 * @param sampleId
	 * @return
	 */
	public SampleReceipt getOne(Long sampleId) {
		SampleReceiptExample sampleReceiptExample = new SampleReceiptExample();
		SampleReceiptExample.Criteria criteria1 = sampleReceiptExample.createCriteria();
		criteria1.andSampleIdEqualTo(sampleId);
		SampleReceipt sampleReceipt = sampleReceiptMapper.selectOneByExample(sampleReceiptExample);
		
		SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
		SampleReceiptMaterialListExample.Criteria criteria2 = sampleReceiptMaterialListExample.createCriteria();
		criteria2.andReceiptIdEqualTo(sampleId);
		List<SampleReceiptMaterialList> materialLists = sampleReceiptMaterialListMapper.selectByExample(sampleReceiptMaterialListExample);
		for (SampleReceiptMaterialList materialList : materialLists) {
			if (materialList.getMaterialId() == 1L) {
				sampleReceipt.setReadMe(materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 2L) {
				sampleReceipt.setApplication(materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 3L) {
				sampleReceipt.setApplication(materialList.getMaterialType());

			}
			if (materialList.getMaterialId() == 4L) {
				sampleReceipt.setApplication(materialList.getMaterialType());

			}
			if (materialList.getMaterialId() == 5L) {
				sampleReceipt.setApplication(materialList.getMaterialType());

			}
			if (materialList.getMaterialId() == 6L) {
				sampleReceipt.setApplication(materialList.getMaterialType());

			}
			if (materialList.getMaterialId() == 7L) {
				sampleReceipt.setApplication(materialList.getMaterialType());

			}
			if (materialList.getMaterialId() == 8L) {
				sampleReceipt.setApplication(materialList.getMaterialType());

			}
			
		}
		Sample sample = sampleMapper.selectByPrimaryKey(sampleId);
		sampleReceipt.setSampleName(sample.getSampleName());
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
		sampleReceipt.setId(sampleReceiptT.getId());
		List<SampleReceiptMaterialList> sampleReceiptmaterialLists = SampleReceiptToSampleReceiptMaterialList(sampleReceipt);
//		List<Map<String, Object>> materialList = sampleReceipt.getMaterialList();
//		for (Map<String, Object> material : materialList) {
//			SampleReceiptMaterialList sampleReceiptMaterial = objectMapper.convertValue(material, SampleReceiptMaterialList.class);
//			sampleReceiptMaterial.setReceiptId(sampleReceiptT.getId());
//			sampleReceiptmaterialList.add(sampleReceiptMaterial);
//		}
		sampleReceiptMaterialListMapper.insertList(sampleReceiptmaterialLists);
		if (sampleReceipt.getOther() != null) {
			SampleMaterialList sampleMaterialList = new SampleMaterialList();
			sampleMaterialList.setMaterialName("其它");
			sampleMaterialList.setMaterialNote(sampleReceipt.getOther());
			sampleMaterialListMapper.insert(sampleMaterialList);
			SampleMaterialList sampleMaterialListT = sampleMaterialListMapper.selectOne(sampleMaterialList);
			sampleMaterialList.setMaterialId(sampleMaterialListT.getMaterialId());
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(sampleMaterialList.getMaterialId());
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.insert(sampleReceiptMaterialList);
		}
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
//		List<Map<String, Object>> materialList = sampleReceipt.getMaterialList();
//		if (materialList != null) {	
//			for (Map<String, Object> material : materialList) {
//				SampleReceiptMaterialList sampleReceiptMaterial = objectMapper.convertValue(material, SampleReceiptMaterialList.class);
//				SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
//				SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
//				criteriaT.andReceiptIdEqualTo(sampleReceiptT.getId());
//				criteriaT.andMaterialIdEqualTo((Long)material.get("materialId"));
//				sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterial, sampleReceiptMaterialListExample);
//			}
//		}
		
		return 200;
	}
	
//	private List<Map<String, Object>> linkMeterialList(Long receiptId) {
//		SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
//		SampleReceiptMaterialListExample.Criteria criteria = sampleReceiptMaterialListExample.createCriteria();
//		criteria.andReceiptIdEqualTo(receiptId);
//		List<SampleReceiptMaterialList> materialList = sampleReceiptMaterialListMapper.selectByExample(sampleReceiptMaterialListExample);
//		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
//		for (SampleReceiptMaterialList material : materialList) {
//			Map<String, Object> temp = new HashMap<String, Object>();
//			temp.put("materialId", material.getMaterialId());
//			temp.put("materialType", material.getMaterialType());
//			if (material.getMaterialId() >= 9) {
//				temp.put("materialName", null);
//			}
//			result.add(temp);
//		}		
//		return result;
//	}
	

	
	private List<SampleReceiptMaterialList> SampleReceiptToSampleReceiptMaterialList(SampleReceipt sampleReceipt) {
		List<SampleReceiptMaterialList> sampleReceiptmaterialLists = new ArrayList<SampleReceiptMaterialList>();
		if (sampleReceipt.getReadMe() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(1L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getReadMe());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getApplication() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(2L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getApplication());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getMaterialReceipt() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(3L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getMaterialReceipt());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getFunction() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(4L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getFunction());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getConfirmations() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(5L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getConfirmations());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getIntroduction() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(6L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getIntroduction());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getGuarantee() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(7L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getGuarantee());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		if (sampleReceipt.getSoftwareSample() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(8L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getSoftwareSample());
			sampleReceiptmaterialLists.add(sampleReceiptmaterialList);
		}
		return sampleReceiptmaterialLists;
	}
	
}
