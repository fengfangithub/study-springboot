package com.fengfan.basis.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author fengfan
 * @description TODO
 * @date 2022/5/6 16:33
 */
//@Component
//@PropertySource(value = "classpath:student.properties", ignoreResourceNotFound = true, encoding = "utf-8")
//@ConfigurationProperties(prefix = "student")
public class StudentPropertis {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentPropertis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
