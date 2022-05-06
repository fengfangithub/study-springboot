package com.fengfan.basis.config;

import com.fengfan.basis.entity.StudentPropertis;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author fengfan
 * @description TODO
 * @date 2022/5/6 16:49
 */
@Configuration
@PropertySource(value = "classpath:application-student.properties", ignoreResourceNotFound = true, encoding = "utf-8")
public class StudentConfig {

    @Bean
    @ConfigurationProperties(prefix = "student")
    public StudentPropertis studentPropertis(){
        return new StudentPropertis();
    }
}
