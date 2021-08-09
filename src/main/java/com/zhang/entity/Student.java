package com.zhang.entity;

import lombok.Data;

import javax.persistence.*;

@Entity//标识实体类
@Table(name = "student")//建立的实体类会有多个，进行区别
@Data
public class Student {

    @Id//标识id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置id字段进行自增操作
    private Integer id;

    @Column(length = 22)//设置字段长度
    private String stuname;

    @Column(length = 11)
    private String password;

    @Column(length = 2)
    private String gender;
}
