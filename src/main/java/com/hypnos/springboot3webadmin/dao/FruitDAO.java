package com.hypnos.springboot3webadmin.dao;

import com.hypnos.springboot3webadmin.bean.Fruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-3:39
 */
public interface FruitDAO {

    Fruit selectOne(@Param("fid") Integer fid);

    @Select("select count(*) from t_fruit")
    Integer getTotal();
}
