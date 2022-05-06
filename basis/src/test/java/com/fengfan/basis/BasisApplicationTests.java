package com.fengfan.basis;

import com.fengfan.basis.entity.PersonPropertis;
import com.fengfan.basis.entity.StudentPropertis;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BasisApplicationTests {
    @Resource
    private PersonPropertis personPropertis;
    @Resource
    private StudentPropertis studentPropertis;

    @Test
    void contextLoads() {
    }


    @Test
    void personPropertis(){
        System.out.println(personPropertis.toString());
    }

    @Test
    void studentPropertis(){
        System.out.println(studentPropertis.toString());
    }

}
