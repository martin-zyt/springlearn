package com.wangzhen.ch11.service;

import com.wangzhen.ch11.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 22:28 2018/9/12
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;
    @Transactional
    public void addOrder(){
        orderDao.insert();
        System.out.println("操作完成.........");

        int a = 1/0;
    }
}
