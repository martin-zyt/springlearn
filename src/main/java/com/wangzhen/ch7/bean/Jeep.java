package com.wangzhen.ch7.bean;

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
public class Jeep {
    public Jeep(){
        System.out.println("Jeep.....constructor........");
    }
    @PostConstruct
    public void init(){
        System.out.println("Jeep.....@PostConstruct........");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Jeep.....@PreDestroy......");
    }

}
