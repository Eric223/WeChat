package com.demo.dao;/*

*/

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao{

     List<User> selectAllUser();

    User selectUserRoom(@Param("username") String username);
}
