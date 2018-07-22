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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cma.util.TestUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaffLeavingTest {
	@Autowired
	private MockMvc mockMvc;
	
	private byte[] testData;
	
	private List<Map<String, Object>> datas;
	
	private List<String> bodys;
	
	private String ADD_PATH = "D:\\Git\\Project\\private\\cma_server\\testdate\\user_add.json";
	
	@Before
    public void setUp() throws Exception {
		testData = TestUtil.loadData(ADD_PATH);
		datas = TestUtil.getListMapByJson(testData);
		bodys = new ArrayList<String>();
		for (Map<String, Object> data : datas) {
			String body = TestUtil.getUrlParamsByMap(data);
			bodys.add(body);
		}
    }
	
	@Test
	public void taAddOne() throws Exception {	
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
	public void tbGetAll() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/StaffManagement/getAll"))
	    .andExpect(MockMvcResultMatchers.status().isOk())
	    //.andDo(MockMvcResultHandlers.print())
	    .andReturn();
	}
	
}
