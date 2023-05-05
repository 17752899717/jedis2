package com.huaheng.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangcong
 * @version 1.0
 * @date 2023/5/5 - 14:35
 */
@Data
public class Student implements Serializable {
    private int stuId;
    private String studentName;
    private String studentSex;
    private String studentAge;
    private String studentImg;
}
