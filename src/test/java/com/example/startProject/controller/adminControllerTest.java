package com.example.startProject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(adminController.class)
class adminControllerTest {

    @Autowired
    MockMvc mvc;
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