package com.example.startProject;

import com.example.startProject.controller.adminController;
import com.example.startProject.service.adminService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(adminController.class)
class StartProjectApplicationTests {


	@Autowired
	private MockMvc mvc;

	@Test
	public void adminhome() throws Exception {

		String hello = "hello";

		mvc.perform(get("/admin/check"))
				.andExpect(status().isOk())
				.andExpect(content().string(hello));

	}




}
