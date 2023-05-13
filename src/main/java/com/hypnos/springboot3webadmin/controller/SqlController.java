package com.hypnos.springboot3webadmin.controller;

import com.hypnos.springboot3webadmin.bean.Fruit;
import com.hypnos.springboot3webadmin.dao.FruitDAO;
import com.hypnos.springboot3webadmin.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/11-23:59
 */
@RestController
public class SqlController {

    @Autowired
    private FruitService fruitService;

    @GetMapping("/fruit/{fid}")
    public Fruit getFruit(@PathVariable("fid") Integer fid){
        return fruitService.getFruit(fid);
    }

    @GetMapping("/fruit/total")
    public Integer getTotal(){
        return fruitService.getTotal();
    }
}
