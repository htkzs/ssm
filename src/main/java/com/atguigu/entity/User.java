package com.atguigu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName : User
 * @Description : 用户实体
 * @Author : 20609
 * @Date: 2022/11/20  8:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
