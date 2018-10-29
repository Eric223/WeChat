package com.demo.pojo;/*

*/

import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * create by yangyin on 2018/10/26 22:42
 *  用户信息表
 */
public class User {
    @NotNull(message = "用户id不能为空")
    private String uid;
    @Length(min = 2,max = 10,message = "长度必须在2和10之间")
    private String nickname;
    private String password;
    private String username;
    private Integer Sex;
    private Integer age;

    public User() {
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return Sex;
    }

    public void setSex(Integer sex) {
        Sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
