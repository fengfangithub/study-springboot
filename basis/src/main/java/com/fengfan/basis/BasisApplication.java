package com.fengfan.basis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BasisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasisApplication.class, args);
    }

}
