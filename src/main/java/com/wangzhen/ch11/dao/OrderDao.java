package com.wangzhen.ch11.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 22:28 2018/9/12
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Repository
public class OrderDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //操作数据的方法
    public void insert(){
        String sql = "insert into order_tbl (ordertime, ordermoney, orderstatus) values(?,?,?)";
        jdbcTemplate.update(sql,new Date(),20,0);
    }
}
