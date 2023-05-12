package com.hypnos.springboot3webadmin.bean;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/13-3:40
 */
@Data
public class Fruit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1474535727298186121L;

    private Integer fid;

    private String fname;

    private Integer fcount;

    private String remark;
}
