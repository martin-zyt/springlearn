package com.wangzhen.ch2.config;

import com.wangzhen.ch1.Person;
import com.wangzhen.ch2.controller.OrderController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 9:49 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Configuration
//@Controller  @Service  @Repository  @Component

//@ComponentScan(value="com.wangzhen.ch2")

//@ComponentScan(value="com.wangzhen.ch2", includeFilters={
//        @ComponentScan.Filter(type=FilterType.ANNOTATION, classes={Controller.class})
//}, useDefaultFilters=false)

//@ComponentScan(value="com.wangzhen.ch2", excludeFilters={
//        @ComponentScan.Filter(type=FilterType.ANNOTATION, classes={Controller.class})
//}, useDefaultFilters=true)

//@ComponentScan(value="com.wangzhen.ch2", includeFilters={
//        @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes={OrderController.class})
//}, useDefaultFilters=false)

@ComponentScan(value="com.wangzhen.ch2", includeFilters={
        @ComponentScan.Filter(type=FilterType.CUSTOM, classes={WzTypeFilter.class})
}, useDefaultFilters=false)


public class Cap2MainConfig {
    //给容器中注册一个bean, 类型为返回值的类型,
    @Bean
    public Person person01(){
        return new Person("james",20);
    }
}