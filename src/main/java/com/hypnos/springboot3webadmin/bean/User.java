package com.hypnos.springboot3webadmin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1212327841575507342L;
    /**
     * 所有属性都应该在数据库中
     */
    private String userName;
    private String password;


    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;


}
