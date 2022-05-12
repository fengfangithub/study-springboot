package com.fengfan.web.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author fengfanTODO
 * @description Runner使用
 * @date 2022/5/12 15:57
 */
@Component
@Order(1)
public class WebCommandlineRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("我是WebCommandlineRunner1，参数为" + Arrays.toString(args));
    }
}
