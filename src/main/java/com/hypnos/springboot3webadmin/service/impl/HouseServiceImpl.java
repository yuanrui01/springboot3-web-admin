package com.hypnos.springboot3webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hypnos.springboot3webadmin.bean.House;
import com.hypnos.springboot3webadmin.dao.HouseDAO;
import com.hypnos.springboot3webadmin.service.HouseService;
import org.springframework.stereotype.Service;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-17:47
 */
@Service
public class HouseServiceImpl extends ServiceImpl<HouseDAO, House> implements HouseService {
}
