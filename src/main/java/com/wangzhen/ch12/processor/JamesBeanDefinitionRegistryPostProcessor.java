package com.wangzhen.ch12.processor;

import com.wangzhen.ch9.bean.Moon;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 20:51 2018/9/13
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Component
public class JamesBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("JamesBeanDefinitionProcessor..postProcessBeanFactory(),Bean的数量"+beanFactory.getBeanDefinitionCount());
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("amesBeanDefinition.postProcessBeanDefinitionRegistry()...bean的数量"+registry.getBeanDefinitionCount());
        //RootBeanDefinition rbd = new RootBeanDefinition(Moon.class);
        AbstractBeanDefinition rbd = BeanDefinitionBuilder.rootBeanDefinition(Moon.class).getBeanDefinition();
        registry.registerBeanDefinition("hello", rbd);
    }
}