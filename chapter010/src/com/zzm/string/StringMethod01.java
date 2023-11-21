// String 常用方法
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        // 1. equals 前面已经讲过了。 比较内容是否相同，区分大小写
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));// false

        // 2. equalsIgnoreCase 忽略大小写的判断内容是否相等
        String username = "johN";
        if ("john".equalsIgnoreCase(username)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }

        // 3. length 获取字符的个数，字符串的长度
        System.out.println("zzm".length());

        // 4. indexOf 获取字符在字符串对象中第一次出现的索引，索引从0开始，如果找不到，返回-1
        String s1 = "wer@terwe@g";
        int index = s1.indexOf('@');
        System.out.println(index);
        System.out.println("weIndex=" + s1.indexOf("we"));

        // 5. LastIndex0f 获取字符串中最后一次出现的索引，索引从0开始，如果找不到，返回-1
        s1 = "wer@terwe@g@";
        index = s1.lastIndexOf('@');
        System.out.println(index);
        System.out.println("ter的位置=" + s1.lastIndexOf("ter"));

        // 6. substring 截取指定范围的子串
        String name = "hello,张三";
        // 下面name.substring(6) 从索引6开始截取后面所有的内容
        System.out.println(name.substring(6));
        // name.substring(0,5)表示从索引0开始截取，截取5个字符
        System.out.println(name.substring(0,5));
    }
}
