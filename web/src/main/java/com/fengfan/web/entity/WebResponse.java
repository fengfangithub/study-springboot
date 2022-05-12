package com.fengfan.web.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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

    public Map<String, Object> toMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("code", this.code);
        map.put("type", this.type);
        map.put("message", this.message);
        map.put("data", this.data);
        return map;
    }
}
