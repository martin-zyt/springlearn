package com.wangzhen.ch7.config;

import com.wangzhen.ch1.Person;
import com.wangzhen.ch7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 18:57 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
@ComponentScan("com.wangzhen.ch7.bean")
@Configuration
public class Ch7MainConfigOfLifeCycle {
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person.......");
        return new Person("person",20);
    }

    //@Scope("prototype")
    @Bean(initMethod="init", destroyMethod="destory")
    public Bike bike(){
        return new Bike();
    }
}
