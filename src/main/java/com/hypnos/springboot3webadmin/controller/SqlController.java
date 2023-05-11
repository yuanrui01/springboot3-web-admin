package com.hypnos.springboot3webadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/11-23:59
 */
@RestController
public class SqlController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping("sql")
    public String queryFruitNums(){
        Long count = jdbcTemplate.queryForObject("select count(*) from t_fruit", Long.class);

        return count.toString();
    }
}
