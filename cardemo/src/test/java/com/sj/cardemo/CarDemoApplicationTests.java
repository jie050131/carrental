package com.sj.cardemo;

import com.sj.cardemo.mapper.CarMenuMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class CarDemoApplicationTests {

    @Autowired
    private CarMenuMapper carMenuRepository;

    @Test
    void contextLoads() {
        System.out.println(carMenuRepository.getAllCarId());
    }



}
