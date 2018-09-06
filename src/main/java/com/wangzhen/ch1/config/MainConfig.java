package com.wangzhen.ch1.config;

import com.wangzhen.ch1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:06 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
//配置类====配置文件
@Configuration
public class MainConfig {
    //给容器中注册一个bean, 类型为返回值的类型,
    @Bean("abcPerson")
//    @Bean
    public Person person01(){
        return new Person("wz",20);
    }
}
