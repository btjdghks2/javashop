package com.example.startProject.service;

import com.example.startProject.Entity.AdminEntity;

import com.example.startProject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class adminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminEntity adminEntity;

    @Transactional
    public List<AdminEntity> homepage() { //전체조회
        return adminRepository.findAll();

    }

    @Transactional
    public AdminEntity createpage(AdminEntity adminEntity) {

        return adminRepository.save(adminEntity);
    }

    @Transactional
    public AdminEntity admincheckingpage(Long articlenumber) {  //개별조회

        return adminRepository.findById(articlenumber)
                .orElseThrow(()-> new IllegalArgumentException("id를 확인하세요"));
    }

    @Transactional
    public AdminEntity adminupdatepage(Long Articlenumber,AdminEntity adminEntity) {

    adminRepository.findById(Articlenumber)
            .orElseThrow(() -> new IllegalArgumentException("상품넘버를 확인해주세요"));
        adminEntity.setArticle(adminEntity.getArticle());
        adminEntity.setArticleContent(adminEntity.getArticleContent());
        adminEntity.setDivisionnumber(adminEntity.getDivisionnumber());
        adminEntity.setArticlecount(adminEntity.getArticlecount());

        return null;
    }

    @Transactional
    public AdminEntity admindalete(Long Articlenumber,AdminEntity adminEntity) {

        adminRepository.deleteById(Articlenumber);

        return null;
    }
}
