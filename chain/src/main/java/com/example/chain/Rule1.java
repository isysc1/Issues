
package com.example.chain;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author Skow 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2022/11/25 10:03 下午
 */
public class Rule1 implements IRule {

    private IRule nextRule;

    @Override
    public CheckResultDto execute(CheckParam t) {
        System.out.println("第一个执行器运行中");
        if (t.getCheckFlag() && (Objects.nonNull(nextRule))) {
            return nextRule.execute(t);
        }
        return new CheckResultDto();
    }

    @Override
    public IRule nextRule(Supplier<IRule> supplier) {
        this.nextRule = supplier.get();
        return nextRule;
    }
}
