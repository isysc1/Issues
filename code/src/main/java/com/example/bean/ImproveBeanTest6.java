package com.example.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2023/2/19 1:40 下午
 */
@Component
public class ImproveBeanTest6 implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("-------" + name);
    }
}
