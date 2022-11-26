
package com.example.chain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Skow 微信公众号：Issues 联系邮箱：isysc1@163.com
 * @description
 * @date 2022/11/25 10:29 下午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckResultDto {
    private String result;

    @Override
    public String toString() {
        return "CheckResultDto{" + "result='" + result + '\'' + '}';
    }
}
