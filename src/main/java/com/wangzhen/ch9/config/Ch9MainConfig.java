package com.wangzhen.ch9.config;

import com.wangzhen.ch9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:36 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */

@Configuration
@ComponentScan({"com.wangzhen.ch9.controller","com.wangzhen.ch9.service","com.wangzhen.ch9.dao","com.wangzhen.ch9.bean"})
public class Ch9MainConfig {
    //spring进行自装配的时候默认首选的bean
    @Primary //只要在这里申请Primary, 代表所有要注入TestDao的bean,
    //@Bean("testDao2")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}