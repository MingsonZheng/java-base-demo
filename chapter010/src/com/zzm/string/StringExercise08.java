// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        // 解读
        // 1. 先 创建一个 StringBuilder sb = StringBuilder()
        // 2. 执行 sb.append("hello");
        // 3. sb.append("abc");
        // 4. String c = sb.toString()// toString() 底层方法是 new 对象，所以 c 没有直接指向常量池
        // 最后其实是 c 指向堆中的对象(string) value[] -> 池中“helloabc
        String c = a + b;
        String d = "helloabc";// d 直接指向常量池
        System.out.println(c == d);// false
        String e = "hello" + "abc";// e 直接指向常量池
        System.out.println(d == e);// true

        // 小结:
        // 底层是 StringBuilder sb = new StringBuilder(); sb.append(a); sb.append(b);
        // sb是在堆中，并且append是在原来字符串的基础上追加的.

        // 重要规则
        // String c1 ="ab”+“cd"; 常量相加，看的是池。
        // String c1 = a + b;变量相加,是在堆中
    }
}
