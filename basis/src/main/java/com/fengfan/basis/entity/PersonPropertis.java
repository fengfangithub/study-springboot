package com.fengfan.basis.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author fengfan
 * @description TODO
 * @date 2022/5/6 15:53
 */
@Component
@PropertySource(value = "classpath:application-persion.properties", ignoreResourceNotFound = true, encoding = "utf-8")
public class PersonPropertis {

    @Value("${persion.name}")
    private String name;
    @Value("${persion.age}")
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
        return "PersonPropertis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
