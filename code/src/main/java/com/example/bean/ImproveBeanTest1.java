package com.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2023/2/19 12:42 下午
 */
@Component
public class ImproveBeanTest1 implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我进来了。。。");
    }
}
