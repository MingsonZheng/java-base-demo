// 字符匹配案例
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 演示字符匹配符 的使用
 */
public class RegExp03 {
    public static void main(String[] args) {

        String content = "a11c8abcABC";
        // String regStr = "[a-z]";// 匹配 a-z之间任意一个字符
        // String regStr = "[A-Z]";// 匹配 A-Z之间任意一个字符
        // String regStr = "abc";// 匹配 abc 字符串[默认区分大小写]
        // String regStr = "(?i)abc";// 匹配 abc 字符串[不区分大小写]
        // String regStr = "[1-9]";// 匹配 0-9 之间任意一个字符
        // String regStr = "[^a-z]";// 匹配 不在 a-z之间任意一个字符
        String regStr = "[^0-9]";// 匹配 不在 0-9之间任意一个字符

        // 说明
        // 1. 当创建Pattern对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写.
        Pattern pattern = Pattern.compile(regStr);
        // Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
