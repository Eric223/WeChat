package com.demo.rest;/*

*/

import com.alibaba.fastjson.JSON;
import com.demo.dao.RoomDao;
import com.demo.dao.UserDao;
import com.demo.pojo.Product;
import com.demo.pojo.Room;
import com.demo.pojo.User;
import com.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("weChat")
public class IndexController {

    @Autowired
    private RoomService roomService;
    @Autowired
    private UserDao userDao;

    @GetMapping("/index")
    public ModelAndView index(ModelAndView model) {
        model.setViewName("index");
        return model;
    }

    @GetMapping(value = "/get/{id}")
    public String addRoom(@PathVariable("id") String id) {
        System.out.println("result: " + JSON.toJSONString(this.roomService.getAllRoom(2)));
        return "success";
    }
//    @PostMapping(value = "/addRoom")
//    public ModelAndView getAllUser(ModelAndView modelAndView, @RequestBody RoomDetail roomDetail) {
//        modelAndView.addObject("message", "success");
//        modelAndView.setViewName("index");
//        System.out.println("json: " + JSON.toJSONString(roomDetail));
//        return modelAndView;
//    }

    @RequestMapping("test")
    public ModelAndView test(ModelAndView model) {
        User user = new User();
        user.setUsername("Arthur");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
