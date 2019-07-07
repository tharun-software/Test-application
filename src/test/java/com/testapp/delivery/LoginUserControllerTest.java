package com.testapp.delivery;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class LoginUserControllerTest {

	@Autowired 
	private WebApplicationContext ctx;

	private MockMvc mockMvc;

	@Before  
	public void init() {  
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.ctx).build();
	} 

	@Test
	public void getAllEmployeesAPI() throws Exception {

		/*
		 * // List list = login.getSongss(); System.err.println();
		 * assertTrue(!list.isEmpty());
		 */

		mockMvc.perform(MockMvcRequestBuilders.get("/loginusers").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

}
