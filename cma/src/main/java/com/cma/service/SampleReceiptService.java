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
		criteria2.andReceiptIdEqualTo(sampleReceipt.getId());
		List<SampleReceiptMaterialList> materialLists = sampleReceiptMaterialListMapper.selectByExample(sampleReceiptMaterialListExample);
		for (SampleReceiptMaterialList materialList : materialLists) {
			if (materialList.getMaterialId() == 1L) {
				sampleReceipt.setReadMe(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 2L) {
				sampleReceipt.setApplication(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 3L) {
				sampleReceipt.setMaterialReceipt(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 4L) {
				sampleReceipt.setFunctions(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 5L) {
				sampleReceipt.setConfirmations(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 6L) {
				sampleReceipt.setIntroduction(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 7L) {
				sampleReceipt.setGuarantee(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() == 8L) {
				sampleReceipt.setSoftwareSample(materialList.getMaterialType() == null ? 0 : materialList.getMaterialType());
			}
			if (materialList.getMaterialId() >= 9L) {
				SampleMaterialList sampleMaterialList = sampleMaterialListMapper.selectByPrimaryKey(materialList.getMaterialId());
				sampleReceipt.setOther(sampleMaterialList.getMaterialNote());
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
		//判断是否存在
		SampleReceiptExample sampleReceiptExample = new SampleReceiptExample();
		SampleReceiptExample.Criteria criteria = sampleReceiptExample.createCriteria();
		criteria.andSampleIdEqualTo(sampleReceipt.getSampleId());
		
		SampleReceipt sampleReceiptT = sampleReceiptMapper.selectOneByExample(sampleReceiptExample);
		if (sampleReceiptT == null) {
			return 500;
		}
		sampleReceipt.setId(sampleReceiptT.getId());
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
		if (sampleReceipt.getReadMe() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(1L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getReadMe());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(1L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getApplication() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(2L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getApplication());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(2L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getMaterialReceipt() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(3L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getMaterialReceipt());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(3L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getFunctions() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(4L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getFunctions());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(4L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getConfirmations() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(5L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getConfirmations());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(5L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getIntroduction() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(6L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getIntroduction());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(6L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getGuarantee() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(7L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getGuarantee());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(7L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getSoftwareSample() != null) {
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList.setMaterialId(8L);
			sampleReceiptMaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptMaterialList.setMaterialType(sampleReceipt.getSoftwareSample());
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdEqualTo(8L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			sampleReceiptMaterialListMapper.updateByExampleSelective(sampleReceiptMaterialList, sampleReceiptMaterialListExample);
		}
		if (sampleReceipt.getOther() != null) {
			SampleReceiptMaterialListExample sampleReceiptMaterialListExample = new SampleReceiptMaterialListExample();
			SampleReceiptMaterialListExample.Criteria criteriaT = sampleReceiptMaterialListExample.createCriteria();
			criteriaT.andMaterialIdGreaterThanOrEqualTo(9L);
			criteriaT.andReceiptIdEqualTo(sampleReceipt.getId());
			SampleReceiptMaterialList sampleReceiptMaterialList = new SampleReceiptMaterialList();
			sampleReceiptMaterialList = sampleReceiptMaterialListMapper.selectOneByExample(sampleReceiptMaterialListExample);
			SampleMaterialList sampleMaterialList = new SampleMaterialList();
			sampleMaterialList.setMaterialId(sampleReceiptMaterialList.getMaterialId());
			sampleMaterialList.setMaterialNote(sampleReceipt.getOther());
			sampleMaterialListMapper.updateByPrimaryKeySelective(sampleMaterialList);
		}
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
		if (sampleReceipt.getFunctions() != null) {
			SampleReceiptMaterialList sampleReceiptmaterialList = new SampleReceiptMaterialList();
			sampleReceiptmaterialList.setMaterialId(4L);
			sampleReceiptmaterialList.setReceiptId(sampleReceipt.getId());
			sampleReceiptmaterialList.setMaterialType(sampleReceipt.getFunctions());
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
