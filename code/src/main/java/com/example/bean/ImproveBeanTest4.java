package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2023/2/19 1:16 下午
 */
@Configuration
public class ImproveBeanTest4 {


    @Bean(initMethod = "onInitialize", destroyMethod = "onDestroy")
    public ImproveBeanTest4 mySpringBean() {
        return new ImproveBeanTest4();
    }

    public void onInitialize() {
        System.out.println("我我我我进来");
    }


    public void onDestroy() {
        System.out.println("我我我我出去了");
    }


    @Bean(destroyMethod = "")
    public ImproveBeanTest2 mySpringBean2() {
        return new ImproveBeanTest2();
    }

    public void close() {
        System.out.println("我不能被执行了");
    }
}
