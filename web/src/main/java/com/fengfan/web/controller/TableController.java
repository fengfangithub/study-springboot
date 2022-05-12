package com.fengfan.web.controller;

import com.fengfan.web.dao.TableDao;
import com.fengfan.web.entity.Table;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author fengfan
 * @description table表控制层
 * @date 2022/5/10 14:21
 */
@RestController
public class TableController {
    @Resource
    private TableDao tableDao;

    /**
     * @return java.util.List<com.fengfan.web.entity.Table>
     * @description 查询所有数据
     * @author fengfan
     * @date 2022/5/10 14:23
     */
    @PostMapping("/queryAll")
    @CrossOrigin(value = "http://localhost:8080", maxAge = 1800, allowedHeaders = "*")
    public List<Table> queryAll() {
        return tableDao.queryAll(new Table());
    }

    @GetMapping("/testControllerAdvice")
    public Table controllerAdviceTest() {
        Table table = new Table();
        table.setId(1);
        table.setName("HandlerExceptionResolver全局异常配置");
        table.setTime(new Date());
        int a = 1 / 0;
        return table;
    }

    @GetMapping("/testBasicErrorController")
    public Table basicErrorControllerTest() {
        Table table = new Table();
        table.setId(1);
        table.setName("BasicErrorController异常配置");
        table.setTime(new Date());
        return table;
    }
}
