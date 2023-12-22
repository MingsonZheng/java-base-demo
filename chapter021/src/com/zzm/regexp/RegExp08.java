// 正则非捕获分组
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 演示非捕获分组，语法比较奇怪
 */
public class RegExp08 {
    public static void main(String[] args) {

        String content = "hello你好中国 jack你好越南 你好泰国hello";

        // 找到 你好中国、你好越南、你好泰国 子字符串
        // String regStr = "你好中国|你好越南|你好泰国";
        // 上面的写法可以等价非捕获分组，注意:不能 matcher.group(1)
        // String regStr = "你好(?:中国|越南|泰国)";

        // 找到 你好 这个关键字,但是要求只是查找 你好中国 和 你好越南 中包含有的 你好
        // 下面也是非捕获分组，不能使用 matcher.group(1)
        //String regStr = "你好(?=中国|越南)";

        // 找到 你好 这个关键字,但是要求只是查找 不是 你好中国 和 你好越南 中包含有的 你好
        // 下面也是非捕获分组，不能使用 matcher.group(1)
        String regStr = "你好(?!中国|越南)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
