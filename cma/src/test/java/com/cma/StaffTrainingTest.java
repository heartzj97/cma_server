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
public class StaffTrainingTest {
	@Autowired
	private MockMvc mockMvc;
	
	private byte[] testData;
	
	private List<Map<String, Object>> datas;
	
	private List<String> bodys;
	
	private String ADD_PATH = "D:\\Git\\Project\\private\\cma_server\\testdate\\equipment_add.json";
	
	private String MODIFY_PATH = "D:\\Git\\Project\\private\\cma_server\\testdate\\equipment_modify.json";
	
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
		    mockMvc.perform(MockMvcRequestBuilders.post("/Equipment/addOne")
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
		mockMvc.perform(MockMvcRequestBuilders.get("/Equipment/getAll"))
	    .andExpect(MockMvcResultMatchers.status().isOk())
	    //.andDo(MockMvcResultHandlers.print())
	    .andReturn();
	}
	
	@Test
	public void tcGetOne() throws Exception {
		for (int i = 1; i <= datas.size(); i++) {
			mockMvc.perform(MockMvcRequestBuilders.get("/Equipment/getOne")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.param("id", String.valueOf(i)))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").exists())
		   // .andDo(MockMvcResultHandlers.print())
		    .andReturn();
		}
	}
	
	@Test
	public void tdModifyOne() throws Exception {
		List<Map<String, Object>> mdatas = TestUtil.getListMapByJson(TestUtil.loadData(MODIFY_PATH));
		List<String> mbodys = new ArrayList<String>();
		for (Map<String, Object> data : mdatas) {
			String body = TestUtil.getUrlParamsByMap(data);
			mbodys.add(body);
		}
		int i = 1;
		for (String mbody : mbodys) {
			mbody += ("&id=" + i);
			mockMvc.perform(MockMvcRequestBuilders.post("/Equipment/modifyOne")
		    		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.content(mbody))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
		    //.andDo(MockMvcResultHandlers.print())
		    .andReturn();
			i++;
		}	
	}
	
    @Test
	public void teDeleteOne() throws Exception {
		for (int i = 1; i <= datas.size(); i++) {
			String id = "id=" + i;
			mockMvc.perform(MockMvcRequestBuilders.post("/Equipment/deleteOne")
		    		.contentType(MediaType.APPLICATION_FORM_URLENCODED)
		    		.content(id))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
		    //.andDo(MockMvcResultHandlers.print())
		    .andReturn();
		}
	}
}
