package com.fengfan.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengfan
 * @description 全局异常配置
 * @date 2022/5/11 17:14
 */
@Configuration
public class WebHandlerExceptionResolverConfig {

    @Bean
    public WebHandlerExceptionResolver webHandlerExceptionResolver(){
        return new WebHandlerExceptionResolver();
    }

}
