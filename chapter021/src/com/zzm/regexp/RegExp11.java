// 正则验证复杂URL
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 演示正则表达式的使用
 */
public class RegExp11 {
    public static void main(String[] args) {

        /**
         * 思路
         * 1. 先确定 url 的开始部分 https://  http://
         * 2. 然后通过 ([\w-]+\.)+[\w-]+ 匹配 www.bilibili.com
         * 3. /video/BV1fh411y7R8?from=sear 匹配(\/[\w-?=&/%.#]*)?
         */
        // String content = "https://";
        // String regStr = "^((http|https)://)";

        // "\\w-";// 匹配 大小写英文字母，数字，下划线，横杠
        // "1+";// 匹配一个1或者多个1
        // String content = "https://www.bilibili.com";
        // String regStr = "^((http|https)://)([\\w-]+\\.)+[\\w-]+$";

        // ()? 括号后面的问号表示括号的内容可有可无
        // [\w-?=] 中括号里面的问号表示实实在在的问号，匹配 大小写英文字母，数字，下划线，横杠，问号...
        // "1*";// 匹配0个1或者多个1
        String content = "https://www.bilibili.com/video/BV1fh411y7R8?from=search&seid=1831060912083761326";
        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
