package com.zzm.regexp;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        // 要求验证是不是整数或者小数
        // 提示: 这个题要考虑正数和负数
        // 比知:123 -345 34.89 -87.9 -0.01 0.45 等
        /**
         * 思路
         * 1. 先写出简单的正则表达式
         * 2. 在逐步的完善[根据各种情况来完善]
         */
//         String content = "123";
//         String regStr = "^\\d+$";

//         String content = "-123";
//        // "a1?";// 匹配 a 或者 a1
//         String regStr = "^[-]?\\d+$";

//         String content = "+123";
//         String regStr = "^[-+]?\\d+$";
//
//         String content = "34.89";
//         String regStr = "^[-+]?\\d+(\\.\\d+)?$";

//        String content = "0034.89";
//        // "1*";// 匹配0个1或者多个1
//        String regStr = "^[-+]?([1-9]\\d*)+(\\.\\d+)?$";

//        String content = "0.89";
//        String regStr = "^[-+]?([1-9]\\d*|0)+(\\.\\d+)?$";

        String content = "01.89";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

        if (content.matches(regStr)) {
            System.out.println("匹配成功 是整数或者小数");
        } else {
            System.out.println("匹配失败");
        }
    }
}
