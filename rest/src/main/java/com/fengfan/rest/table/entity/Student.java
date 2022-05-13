package com.fengfan.rest.table.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author fengfan
 * @description TODO
 * @date 2022/5/13 15:00
 */
@Data
@Entity
public class Student {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //名称
    private String name;
    //时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
}

