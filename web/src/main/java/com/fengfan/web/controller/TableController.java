package com.fengfan.web.controller;

import com.fengfan.web.dao.TableDao;
import com.fengfan.web.entity.Table;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    public List<Table> queryAll() {
        return tableDao.queryAll(new Table());
    }
}
