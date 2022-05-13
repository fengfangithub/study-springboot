package com.fengfan.web.config;

import com.fengfan.web.exception.WebHandlerExceptionResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengfan
 * @description 配置类
 * @date 2022/5/12 15:12
 */
@Configuration
public class WebBeanConfig {

    /**
     * 异常处理类配置
     *
     * @return
     */
//    @Bean
    public WebHandlerExceptionResolver webHandlerExceptionResolver() {
        return new WebHandlerExceptionResolver();
    }

    /**
     * Gson配置
     *
     * @return
     */
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        gsonBuilder.excludeFieldsWithModifiers(Modifier.PROTECTED);
//        converter.setGson(gsonBuilder.create());
//        return converter;
//    }
}
