package com.example.startProject.controller;

import com.example.startProject.Entity.AdminEntity;
import com.example.startProject.repository.AdminRepository;
import com.example.startProject.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class adminController {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private adminService adminService;



    @GetMapping("/admin/check")
    public ResponseEntity<?> adminhome() { // 전체조회 homepage service class 반환

        return new ResponseEntity<>(adminService.homepage(),HttpStatus.OK);
    }


    @GetMapping("/admin/check/{articlenumber}")
    public ResponseEntity<?> adminchecking(@PathVariable Long articlenumber) { // 여기가 개별조회 admincheckingpage class 반환

        return new ResponseEntity<>(adminService.admincheckingpage(articlenumber),HttpStatus.OK);
    }

    @PostMapping("/admin/input")
    public ResponseEntity<?> admincreate(@RequestBody AdminEntity adminEntity) throws IllegalArgumentException {

        return new ResponseEntity<>(adminService.createpage(adminEntity), HttpStatus.OK);
    }

    @PostMapping("/admin/check/{articlenumber}/update")
    public ResponseEntity<?> adminupdate(@PathVariable Long articlenumber,@RequestBody AdminEntity adminEntity) {

        return new ResponseEntity<>(adminService.adminupdatepage(articlenumber, adminEntity), HttpStatus.OK);
    }

    @DeleteMapping("/admin/check/{articlenumber}")
    public ResponseEntity<?> admindelete(@PathVariable Long articlenumber,@RequestBody AdminEntity adminEntity) {

        return new ResponseEntity<>(adminService.admindalete(articlenumber,adminEntity),HttpStatus.OK);
    }
}
