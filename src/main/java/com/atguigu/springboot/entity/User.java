package com.atguigu.springboot.entity;

import javax.persistence.*;

//使用JPA注解，配置映射关系
@Entity
@Table(name = "tbl_user")//指定对应的数据表，省略就是user
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private Integer id;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
