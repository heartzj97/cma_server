package com.cma;

import java.util.HashMap;
import java.util.Map;

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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cma.util.Convert;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) 
//@EnableAutoConfiguration
@FixMethodOrder(MethodSorters.JVM)
public class StaffManagementTest {
	@Autowired
	private MockMvc mockMvc;
	
	//@Autowired
    //private TestRestTemplate testRestTemplate;
		
//	@Before
//    public void setUp() throws Exception {
//		mockMvc = MockMvcBuilders.standaloneSetup(new StaffManagementController()).build();
//    }
		 
	@Test
	public void testControllerMethods() throws Exception {
	    mockMvc.perform(MockMvcRequestBuilders.get("/StaffManagement/getAll"))
	    .andExpect(MockMvcResultMatchers.status().isOk())
	    .andDo(MockMvcResultHandlers.print())
	    .andReturn();
		
	}

	//@Test
    public void oldPost() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
	    data.put("name", "lake");
	    data.put("department", "狮鹰兽");
	    data.put("position", "大主任");
	    data.put("gender", 0);
	    data.put("title", "驾驶");
	    data.put("degree", "博彦");
	    data.put("graduationSchool", "山鸡大学");
	    data.put("graduationMajor", "巴啦啦");
	    data.put("graduationDate", "1997-11-11");
	    data.put("workingYears", 13);
	    String body = Convert.getUrlParamsByMap(data);
	    System.out.println(body);
	    MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/StaffManagement/addOne").contentType(MediaType.APPLICATION_FORM_URLENCODED).content(body))
        .andExpect(MockMvcResultMatchers.status().isOk())
	    .andDo(MockMvcResultHandlers.print())
	    .andReturn();
	    System.out.println(result.getResponse().getContentAsString());
    }
	
    
	    
}
