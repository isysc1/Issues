package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2023/2/19 1:48 下午
 */
@Component
public class ImproveBeanTest7 implements ApplicationContextAware, BeanPostProcessor {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("defaultConfig")) {
            // 如果遇到需要替换的Bean，我们直接换成自己实现的Bean即可（这里可以把就得removeBeanDefinition，然后注册新的registerBeanDefinition）
            // 这里的myConfig要继承自defaultConfig，否则引用的地方会报错
            return applicationContext.getBean("myConfig");
        }
        return bean;
    }
}