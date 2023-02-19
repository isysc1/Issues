package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2023/2/19 12:42 下午
 */
@Component
public class ImproveBeanTest2 implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("糟糕。我被销毁了");
    }
}