package com.example.chain.rule;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author 有清 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2022/11/25 10:03 下午
 */
public class Rule3 implements IRule {

    private IRule nextRule;

    @Override
    public CheckResultDto execute(CheckParam t) {
        System.out.println("第三个执行器运行中");
        if (t.getCheckFlag() && (Objects.nonNull(nextRule))) {
            return nextRule.execute(t);
        }
        return CheckResultDto.builder().result("我是第三个执行器的输出").build();
    }

    @Override
    public IRule nextRule(Supplier<IRule> supplier) {
        this.nextRule = supplier.get();
        return nextRule;
    }
}
