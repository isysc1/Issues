
package com.example.chain.rule;

/**
 * @author Skow 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description 测试类
 * @date 2022/11/25 10:03 下午
 */
public class Test {

    public static void main(String[] args) {


        CheckParam checkParam = new CheckParam();
        checkParam.setCheckFlag(Boolean.TRUE);

        Rule1 rule1 = new Rule1();
        rule1.nextRule(Rule2::new).nextRule(Rule3::new);
        CheckResultDto execute = rule1.execute(checkParam);

        System.out.println(execute.toString());
    }
}
