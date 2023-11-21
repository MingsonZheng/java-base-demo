// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "zzm";// 指向常量池 "zzm"
        String s2 = "java";// 指向常量池 "java"
        String s4 = "java";// 指向常量池 "java"
        String s3 = new String("java");// 指向堆中对象
        System.out.println(s2 == s3);// false
        System.out.println(s2 == s4);// true
        System.out.println(s2.equals(s4));// true
        System.out.println(s1 == s2);// false
    }
}
