package com.hypnos.springboot3webadmin.service.impl;

import com.hypnos.springboot3webadmin.bean.Fruit;
import com.hypnos.springboot3webadmin.dao.FruitDAO;
import com.hypnos.springboot3webadmin.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-5:18
 */
@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitDAO fruitDAO;

    @Override
    public Fruit getFruit(Integer fid) {
        return fruitDAO.selectOne(fid);
    }

    @Override
    public Integer getTotal() {
        return fruitDAO.getTotal();
    }
}
