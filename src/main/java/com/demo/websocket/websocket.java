package com.demo.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

import java.security.Principal;

/**
 * create by yangyin 0n 2018/
 */

@Controller
@RequestMapping("/websocket")
public class websocket {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RequestMapping("/send")
    public String send(){
        return "room";
    }
    @MessageMapping("/send")
    @SendTo("sub/chat")
    public String sendMsg(){
        return "index";
    }
    @MessageMapping("/sendUser")
    public void sendToUser(String body) {

    }
}