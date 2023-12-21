// 正则限定符
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 演示限定符的使用
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content = "a1111111aaaahello";
        // a{3},1{4},\\d{2}
        // String regStr = "a{3}";// 表示匹配 aaa
        // String regStr = "1{4}";// 表示匹配 1111
        // String regStr = "\\d{2}";// 表示匹配 两位的任意数字字符

        // a{3,4},1{4,5},\\d{2,5}
        // 细节:java匹配默认贪焚匹配，即尽可能匹配多的
        // String regStr = "a{3,4}";// 表示匹配 aaa 或者 aaaa
        // String regStr = "1{4,5}";// 表示匹配 1111 或者 11111
        // String regStr = "\\d{2,5}";// 匹配2位数或者3,4,5

        // String regStr = "1+";// 匹配一个1或者多个1
        // String regStr = "\\d+";// 匹配一个数字或者多个数字
        // String regStr = "1*";// 匹配0个1或者多个1
        String regStr = "a1?";// 匹配 a 或者 a1

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
