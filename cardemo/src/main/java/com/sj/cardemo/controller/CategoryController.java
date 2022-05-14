package com.sj.cardemo.controller;


import com.sj.cardemo.bean.CarCategory;
import com.sj.cardemo.mapper.CarCategoryMapper;
import com.sj.cardemo.util.ResultUtil;
import com.sj.cardemo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CarCategoryMapper carCategoryMapper;

//    @GetMapping("/findAll")
//    public ResultVO findAll(){
//        List<CarCategory> data=;
//        return ResultUtil.success(data);
//    }

    @GetMapping("/findAllNot5")
    public ResultVO findAllNot5(){
        List<CarCategory> data=categoryRepository.findAllNot5();
        return ResultUtil.success(data);
    }
}
