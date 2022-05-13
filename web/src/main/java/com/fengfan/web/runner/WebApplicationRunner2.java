package com.fengfan.web.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author fengfan
 * @description ApplicationRunner使用
 * @date 2022/5/12 16:06
 */
//@Component
//@Order(2)
public class WebApplicationRunner2 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("我是WebApplicationRunner2，参数为" + args.getNonOptionArgs());
    }
}
