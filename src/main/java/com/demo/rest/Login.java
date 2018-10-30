package com.demo.rest;

import com.alibaba.fastjson.JSON;
import com.demo.dao.UserDao;
import com.demo.pojo.Room;
import com.demo.pojo.User;
import com.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

/**
 * create by yangyin 0n 2018/
 */
@Controller
public class Login {
    @Autowired
    private RoomService roomService;

    @Autowired
    private UserDao userDao;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/index")
    public ModelAndView index(ModelAndView modelAndView,Principal principal){
       String username= principal.getName();
        System.out.println("username: "+username);
        User user= this.userDao.selectUserRoom(username);
        System.out.println("list: "+ JSON.toJSONString(user));
       modelAndView.addObject("rooms",user.getRooms());
        return modelAndView;
    }
}
