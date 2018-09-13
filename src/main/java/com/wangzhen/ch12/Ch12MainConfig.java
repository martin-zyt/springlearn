package com.wangzhen.ch12;

import com.wangzhen.ch9.bean.Moon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @Author : Wang Zhen.
 * @Date : Created in 20:52 2018/9/13
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Configuration
@ComponentScan("com.wangzhen.ch12.processor")
public class Ch12MainConfig  {
    @Bean
    public Moon getMoon(){
        return new Moon();
    }
}
