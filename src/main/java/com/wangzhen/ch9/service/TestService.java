package com.wangzhen.ch9.service;

import com.wangzhen.ch9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:40 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Service
public class TestService {
    @Qualifier("testDao")//指定名称来加载
    @Autowired
    //@Resource
    //@Inject
    private TestDao testDao2;//如果使用Autowired, testDao2, 找到TestDao类型的

    public void println(){
        System.out.println("Service...dao...."+testDao2);
    }
}