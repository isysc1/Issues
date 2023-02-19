package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;



@Component
public class ApplicationContextUtils implements ApplicationContextAware {


    private static ApplicationContext applicationContext;

    private ApplicationContextUtils() { }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }


    public static <T> T getBeanByType(Class<T> clazz) throws Exception {
        if (applicationContext == null) {
            throw new Exception("搞什么，瞎拿");
        }
        return applicationContext.getBean(clazz);
    }

    public static <T> T getBeanByName(String beanName) throws Exception {
        if (applicationContext == null) {
            throw new Exception("搞什么，瞎拿");
        }
        return (T) applicationContext.getBean(beanName);
    }
}
