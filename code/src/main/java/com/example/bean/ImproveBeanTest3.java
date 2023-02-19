package com.example.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2023/2/19 12:42 下午
 */
@Component
public class ImproveBeanTest3{

    @PostConstruct
    public void postConstruct() {
        System.out.println("我是构造后置");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("我是销毁前置");
    }
}