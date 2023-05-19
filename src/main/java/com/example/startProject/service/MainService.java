package com.example.startProject.service;

import com.example.startProject.Entity.AdminEntity;
import com.example.startProject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminEntity adminEntity;

    @Transactional
    public List<AdminEntity> categorymainlogic() {
        return adminRepository.findAll();
    }

    @Transactional
    public AdminEntity detailpagelogic(Long articlenumber) {
        return adminRepository.findById(articlenumber)
                .orElseThrow(() -> new IllegalArgumentException("상품을 확인하세요"));

    }





}
