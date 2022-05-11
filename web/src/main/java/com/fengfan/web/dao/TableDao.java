package com.fengfan.web.dao;

import com.fengfan.web.entity.Table;

import java.util.List;

/**
 * @author fengfan
 * @description table1表数据库访问层
 * @date 2022/5/10 9:39
 */
public interface TableDao {

    /**
     * @param table
     * @return java.util.List<com.fengfan.web.entity.Table>
     * @description 根据条件查询数据
     * @author fengfan
     * @date 2022/5/10 13:39
     */
    List<Table> queryAll(Table table);

    /**
     * @param table
     * @return int
     * @description 插入
     * @author fengfan
     * @date 2022/5/11 16:19
     */
    int insert(Table table);

}
