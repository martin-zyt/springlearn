package com.wangzhen.ch7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:24 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public Train(){
        System.out.println("Train......constructor............");
    }
    //当我们bean销毁时,调用此方法
    @Override
    public void destroy() throws Exception {
        System.out.println("Train......destory......");
        //logger.error
    }
    //当我们的bean属性赋值和初始化完成时调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train.......afterPropertiesSet()...");
    }
}
