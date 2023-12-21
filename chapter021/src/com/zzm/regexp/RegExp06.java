// 正则定位符
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 演示定位符的使用
 */
public class RegExp06 {
    public static void main(String[] args) {

        // String content = "123abc";
        // String content = "a123abc";// 起始字符不是数字则匹配不到
        // String content = "123abc12";// 匹配到 123abc
        // String content = "123";// 匹配到 123
        // 以至少1个数字开头，后接任意个小写字母的字符串
        // String regStr = "^[0-9]+[a-z]*";

        // String content = "123abc";
        // String content = "123";// 结束字符不是小写字母则匹配不到
        // 以至少1个数字开头，必须以至少一个小写字母结束
        // String regStr = "^[0-9]+[a-z]+$";

        // String content = "123-abc";
        // String regStr = "^[0-9]+\\-[a-z]+$";

        String content = "abcdefg spabc nnabc";
        // 表示匹配边界的abc[这里的边界是指:被匹配的字符串最后，
        // 也可以是空格的子字符串的后面]
        // String regStr = "abc\\b";
        // 和\b的含义刚刚相反
        String regStr = "abc\\B";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
