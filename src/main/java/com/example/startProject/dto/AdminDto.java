package com.example.startProject.dto;

import lombok.AllArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
public class AdminDto {

    private Long Articlenumber; // 상품 고유 넘버
    private String Article; // 상품이름
    private String ArticleContent; // 상품 내용
    private int Divisionnumber; // 카테고리 분류번호
    private int Articlecount; // 상품 수량

}
