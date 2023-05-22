package com.example.startProject.controller;

import com.example.startProject.service.adminService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;



@WebMvcTest(adminController.class)
class adminControllerTest {

    @InjectMocks
    private adminController adminController;

    @Mock
    private adminService adminservice;

    private MockMvc mvc;

    @Test
    void adminhome() {
    }

    @Test
    void adminchecking() {
    }

    @Test
    void admincreate() {
    }

    @Test
    void adminupdate() {
    }

    @Test
    void admindelete() {
    }
}