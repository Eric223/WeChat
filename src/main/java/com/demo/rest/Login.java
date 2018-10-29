package com.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by yangyin 0n 2018/
 */
@Controller
public class Login {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
