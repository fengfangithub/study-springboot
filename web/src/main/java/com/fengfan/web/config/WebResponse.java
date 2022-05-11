package com.fengfan.web.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fengfan
 * @description 响应信息
 * @date 2022/5/11 15:14
 */
@Data
public class WebResponse <T> implements Serializable {
    private int code;
    private String type;
    private String message;
    private T data;
}
