package com.cma;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cma.util.TestUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.JVM)
public class AnnualTrainingPlanTest {
	@Autowired
	private MockMvc mockMvc;
	
	private byte[] testData;
	
	private List<Map<String, Object>> datas;
	
	private List<String> bodys;
	
	@Before
    public void setUp() throws Exception {
		testData = TestUtil.loadData("D:\\Git\\Project\\private\\user.json");
		datas = TestUtil.getListMapByJson(testData);
		bodys = new ArrayList<String>();
		for (Map<String, Object> data : datas) {
			String body = TestUtil.getUrlParamsByMap(data);
			bodys.add(body);
		}
    }
	
	@Test
	public void testAddOne() throws Exception {	
		for (String body : bodys) {
		    mockMvc.perform(MockMvcRequestBuilders.post("/StaffManagement/addOne")
		    		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.content(body))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
		    //.andDo(MockMvcResultHandlers.print())
		    .andReturn();
		}  
	    
	}
	
	@Test 
	public void testGetAll() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/StaffManagement/getOne"))
	    .andExpect(MockMvcResultMatchers.status().isOk())
	    //.andDo(MockMvcResultHandlers.print())
	    .andReturn();
	}
	
	@Test
	public void testGetOne() throws Exception {
		for (int i = 1; i <= datas.size(); i++) {
			mockMvc.perform(MockMvcRequestBuilders.get("/StaffManagement/getOne")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.param("id", String.valueOf(i)))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").exists())
		    .andDo(MockMvcResultHandlers.print())
		    .andReturn();
		}
	}
	
	@Test
	public void testDeleteOne() throws Exception {
		for (int i = 1; i <= datas.size(); i++) {
			String id = "id=" + i;
			mockMvc.perform(MockMvcRequestBuilders.post("/StaffManagement/deleteOne")
		    		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.content(id))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
		    //.andDo(MockMvcResultHandlers.print())
		    .andReturn();
		}
	}
	
	@Test
	public void testModifyOne() throws Exception {
//		List<Map<String, Object>> mdatas = TestUtil.getListMapByJson(TestUtil.loadData("D:\\Git\\Project\\private\\user_modify.json"));
//		List<String> mbodys = new ArrayList<String>();
//		for (Map<String, Object> data : mdatas) {
//			String body = TestUtil.getUrlParamsByMap(data);
//			mbodys.add(body);
//		}
		int i = 1;
		for (String body : bodys) {
			body += ("&id=" + i);
			mockMvc.perform(MockMvcRequestBuilders.post("/StaffManagement/modifyOne")
		    		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.content(body))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
		    .andDo(MockMvcResultHandlers.print())
		    .andReturn();
			i++;
		}
		
	}

}
