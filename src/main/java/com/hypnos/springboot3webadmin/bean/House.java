package com.hypnos.springboot3webadmin.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-17:27
 */
@Data
@TableName("house")
public class House {

    private Integer id;

    private String quarters;

    private Integer building;

    private String hourseNumber;
}
