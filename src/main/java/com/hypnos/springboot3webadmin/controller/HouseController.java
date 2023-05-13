package com.hypnos.springboot3webadmin.controller;

import com.hypnos.springboot3webadmin.bean.House;
import com.hypnos.springboot3webadmin.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: mybatis测试
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-17:48
 */
@RestController
public class HouseController {

    @Autowired
    HouseService houseService;

    @GetMapping("/house/{id}")
    public House getHouseById(@PathVariable("id") Integer id){
        return houseService.getById(id);
    }
}
