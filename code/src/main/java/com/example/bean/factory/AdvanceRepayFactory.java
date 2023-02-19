
package com.example.bean.factory;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description 提前还款工厂
 * @date 2022/11/11 4:28 下午
 */
@Component
@Slf4j
public class AdvanceRepayFactory implements IRepayFactory, InitializingBean {


    @Override
    public void repay(RepayRequest request) {
    }

    @Override
    public void afterPropertiesSet() {
        CommonRepayFactory.register("提前还款", this);
    }
}
