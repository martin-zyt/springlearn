package com.wangzhen.ch8.config;

import com.wangzhen.ch8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:21 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */


@Configuration
@PropertySource(value="classpath:/test.properties")
public class Ch8MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }
}
