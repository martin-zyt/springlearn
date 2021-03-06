package com.wangzhen.ch7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:29 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Component
public class Plane implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public Plane() {
        System.out.println("Plane.....constructor........");
    }

    @PostConstruct
    public void init(){
        System.out.println("Plane.....@PostConstruct........");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Plane.....@PreDestroy......");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //将applicationContext传进来,可以拿到
        this.applicationContext = applicationContext;
    }
}
