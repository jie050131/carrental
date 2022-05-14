package com.sj.cardemo.vo;

import com.sj.cardemo.bean.Admin;
import com.sj.cardemo.bean.User;
import lombok.Data;

@Data
public class AccountVO {
    private User user;
    private Admin admin;
}
