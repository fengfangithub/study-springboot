//package com.fengfan.web.config;
//
//import com.google.gson.GsonBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.GsonHttpMessageConverter;
//
//import java.lang.reflect.Modifier;
//
///**
// * @author fengfan
// * @description 配置gson格式化时间
// * @date 2022/5/10 16:14
// */
//@Configuration
//public class GsonConfig {
//
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        gsonBuilder.excludeFieldsWithModifiers(Modifier.PROTECTED);
//        converter.setGson(gsonBuilder.create());
//        return converter;
//    }
//}
