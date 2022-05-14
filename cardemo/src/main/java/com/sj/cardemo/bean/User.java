package com.sj.cardemo.bean;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName(value = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String salt;
    private String password;
    private String checkPassword;
    private Integer age;
    private String gender;
    private String address;
    private String userPhone;
    private String likeModel;
    private String src;
    private String srcList;
    private String role;
    private String  perm;
}
