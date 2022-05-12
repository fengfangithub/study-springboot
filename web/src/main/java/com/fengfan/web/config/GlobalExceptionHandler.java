package com.fengfan.web.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author fengfan
 * @description controller异常处理类
 * @date 2022/5/11 15:00
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public WebResponse exceptionHandler(Exception e) {
        e.printStackTrace();
        WebResponse webResponse = new WebResponse();
        webResponse.setCode(-1);
        webResponse.setType("error");
        webResponse.setMessage(e.getMessage());
        return webResponse;
    }
}
