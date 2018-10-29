//package com.demo.config;
//
///*
// create by yangyin 0n 2018/
//*/
//
//import org.springframework.stereotype.Component;
//
//import java.text.DateFormat;
//import java.text.FieldPosition;
//import java.text.ParsePosition;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Mydateformat extends DateFormat {
//
//    private DateFormat dateFormat;
//    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    public Mydateformat(DateFormat dateFormat) {
//        this.dateFormat = dateFormat;
//    }
//
//    @Override
//    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
//        return dateFormat.format(date, toAppendTo, fieldPosition);
//    }
//
//    @Override
//    public Date parse(String source, ParsePosition pos) {
//        Date date = null;
//        try {
//            date = format.parse(source, pos);
//            System.out.println("date: " + date);
//        } catch (Exception e) {
//            e.printStackTrace();
//            dateFormat.parse(source, pos);
//        }
//        return date;
//    }
//}
