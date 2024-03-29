//package com.demo.config;/*
// create by yangyin 0n 2018/
//*/
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//
///**
// * create by yangyin on 2018/10/27 8:10
// */
//@Configuration
//public class WebConfig {
//
//    @Autowired
//    private Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder;
//
//    @Bean
//    public MappingJackson2HttpMessageConverter MappingJsonpHttpMessageConverter() {
//
//        ObjectMapper mapper = jackson2ObjectMapperBuilder.build();
//
//        // ObjectMapper为了保障线程安全性，里面的配置类都是一个不可变的对象
//        // 所以这里的setDateFormat的内部原理其实是创建了一个新的配置类
//        DateFormat dateFormat = mapper.getDateFormat();
//        mapper.setDateFormat(new Mydateformat(dateFormat));
//
//        MappingJackson2HttpMessageConverter mappingJsonpHttpMessageConverter = new MappingJackson2HttpMessageConverter(
//                mapper);
//        return mappingJsonpHttpMessageConverter;
//    }
//}
