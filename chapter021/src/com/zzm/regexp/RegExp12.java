// 反向引用
package com.zzm.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mingson
 * @version 1.0
 * 反向引用
 */
public class RegExp12 {
    public static void main(String[] args) {

        String content = "hello333333 1551jack14 12321-333999111 tom11 jack22 yyy xxx";

        // 1. 要匹配两个连续的相同数字: (\\d)\\1
        // String regStr = "(\\d)\\1";

        // 2. 要匹配五个连续的相同数字: (\\d)\\1{4}，相当于 (\\d)\\1\\1\\1\\1\\1
        //String regStr = "(\\d)\\1{4}";

        // 3. 要匹配个位与干位相同，十位与百位相同的数 5225，1551 (\\d)(\\d)\\2\\1
        // 第一个 (\\d) 匹配 千位 5
        // 第二个 (\\d) 匹配 百位 2
        // \\2 反向引用第二组，就是百位的 2
        // \\1 反向引用第一组，就是千位的 5
        // String regStr = "(\\d)(\\d)\\2\\1";

        /**
         * 请在字符串中检索商品编号,形式如:12321-333999111 这样的号码,
         * 要求满足前面是一个五位数,然后一个-号,然后是一个九位数,连续的每三位要相同
         */
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
