package com.hypnos.springboot3webadmin.service;

import com.hypnos.springboot3webadmin.bean.Fruit;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-5:17
 */
public interface FruitService {
    Fruit getFruit(Integer fid);

    Integer getTotal();
}
