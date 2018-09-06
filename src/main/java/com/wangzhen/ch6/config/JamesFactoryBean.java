package com.wangzhen.ch6.config;

import com.wangzhen.ch6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:24 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class JamesFactoryBean implements FactoryBean<Monkey> {

    @Override
    public Monkey getObject() throws Exception {
        // TODO Auto-generated method stub
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
