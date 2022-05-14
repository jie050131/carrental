package com.sj.cardemo.bean;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "car_return")
public class CarReturn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer returnId;

    private String orderId;
    private String userName;
    private String userPhone;
    private String carName;
    private BigDecimal carPrice;
    private Integer days;
    private BigDecimal totalPrice;
    private Date  createTime;
    private Date updateTime;
    private String  adminName;
    private Integer adminId;
    private Integer able;
}
