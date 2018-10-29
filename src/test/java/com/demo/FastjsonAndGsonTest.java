//package com.demo;/*
// create by yangyin 0n 2018/
//*/
//
//import com.alibaba.fastjson.JSON;
//import com.demo.pojo.User;
//import com.google.gson.Gson;
//
//import java.util.Date;
//
//public class FastjsonAndGsonTest {
//    private static Long start;
//    public static void main(String[] args) {
//        Gson gson=new Gson();
//        start=new Date().getTime();
//        for (int i=0;i<500000;i++){
//           String json= JSON.toJSONString(user);
//        }
//        System.out.println("fastJsonScore: "+(new Date().getTime()-start));
//        start=new Date().getTime();
//        for (int i=0;i<500000;i++){
//            String json= gson.toJson(user);
//        }
//        System.out.println("GsonScore: "+(new Date().getTime()-start));
//    }
//}
