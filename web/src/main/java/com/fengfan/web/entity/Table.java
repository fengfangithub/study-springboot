package com.fengfan.web.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author fengfan
 * @description 表实体
 * @date 2022/5/10 9:39
 */
@Data
public class Table {
    //主键
    private Integer id;
    //名称
    private String name;
    //时间
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
}
