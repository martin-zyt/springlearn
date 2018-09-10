package com.wangzhen.ch9.bean;

import org.springframework.stereotype.Component;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:39 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Component
public class Moon {
    public Moon(){
        System.out.println("Moon constructor........");
    }

    public void init(){
        System.out.println("Moon....init......");
    }


    public void destroy(){
        System.out.println("Moon....destroy......");
    }
}
