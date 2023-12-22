// Pattern方法
package com.zzm.regexp;

import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 演示 matches 方法，用于整体匹配，在验证输入的字符串是否满足条件使用
 */
public class PatternMethod {
    public static void main(String[] args) {
        String content = "hello abc hello, 你好中国";
        // String regStr = "hello";

        // ".";// 匹配出 \n 之外的所有字符
        // "1*";// 匹配0个1或者多个1
        String regStr = "hello.*";

        boolean matches = Pattern.matches(regStr, content);
        System.out.println("整体匹配= " + matches);
    }
}
