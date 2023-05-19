package com.example.startProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Articlenumber;  // 상품 고유 넘버

    @Column
    private String Article; // 상품이름

    @Column
    private String ArticleContent; // 상품 내용

    @ManyToOne
    @JoinColumn
    private int Divisionnumber; // 카테고리 분류번호

    @Column
    private int Articlecount; // 상품 수량
}
