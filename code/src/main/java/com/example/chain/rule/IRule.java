
package com.example.chain.rule;

import java.util.function.Supplier;

/**
 * @author Skow 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description 规则实现接口
 * @date 2022/11/25 10:00 下午
 */
public interface IRule{

    /**
     * 规则执行
     *
     * @param t 校验参数
     * @return 执行结果
     */
    CheckResultDto execute(CheckParam t);

    /**
     * 指定下一个执行器
     *
     * @param supplier 利用其来创建对象
     * @return 规则执行器
     */
    IRule nextRule(Supplier<IRule> supplier);
}
