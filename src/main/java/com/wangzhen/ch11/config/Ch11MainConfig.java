package com.wangzhen.ch11.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 22:27 2018/9/12
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Configuration
@ComponentScan("com.wangzhen.ch11")
@EnableTransactionManagement
public class Ch11MainConfig {
    //创建数据源
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        //这个c3p0封装了JDBC, dataSource接口的实现
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3307/test");
        return dataSource;
    }

    //jdbcTemplate能简化增删改查的操作
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException{
        return new JdbcTemplate(dataSource());
    }
    //注册事务管理器
    @Bean
    public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException{
        return new DataSourceTransactionManager(dataSource());
    }

}
