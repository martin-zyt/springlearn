package com.wangzhen.ch1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:53 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class MainTest1 {
    public static void main(String args[]){
        //把beans.xml的类加载到容器
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean
        Person person = (Person) app.getBean("person");

        System.out.println(person);
    }
}
