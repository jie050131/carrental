package com.sj.cardemo.bean;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;


import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "car_order")
public class CarOrder {

    private String orderId;
    private Integer userId;
    private String userAddress;
    private String userPhone;
    private Integer carId;
    private String src;
    private BigDecimal carPrice;
    private Integer days;
    private BigDecimal totalPrice;
    private Date createTime;
    private Date updateTime;
    private Integer state;
    private Integer adminId;
}
