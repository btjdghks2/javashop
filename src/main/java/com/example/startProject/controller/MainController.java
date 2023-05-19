package com.example.startProject.controller;


import com.example.startProject.repository.AdminRepository;
import com.example.startProject.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private MainService mainService;

    @GetMapping("/index/")
    public ResponseEntity<?> indexmainpage() {
        return new ResponseEntity<>(mainService.categorymainlogic(),HttpStatus.OK);
    }

    @GetMapping("/index/{articlenumber}")
    public ResponseEntity<?> detailpage(@PathVariable Long articlenumber) {
        return new ResponseEntity<>(mainService.detailpagelogic(articlenumber), HttpStatus.OK);
    }



}
