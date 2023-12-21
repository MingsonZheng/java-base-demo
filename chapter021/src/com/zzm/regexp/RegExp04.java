// 选择匹配符
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 选择匹配符
 */
public class RegExp04 {
    public static void main(String[] args) {

        String content = "abcdefg 你好 中国";
        String regStr = "abc|你|国";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
