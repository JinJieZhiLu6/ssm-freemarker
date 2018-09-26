/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: User
 * <p>
 * Author:   shunshikj-30
 * <p>
 * Date:     2018/9/25 17:36
 * <p>
 * Description: 用户实体类
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.sskj.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户实体类〉
 *
 * @author shunshikj-30

 * @create 2018/9/25

 * @since 1.0.0

 */

@TableName(value = "t_user")
public class User {

    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name")
    private String name;
    private Integer age;
    private String phone;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
