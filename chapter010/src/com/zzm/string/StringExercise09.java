// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "zzm";
        String s2 = "java";
        String s5 = "zzmjava";
        String s6 = (s1 + s2).intern();// 指向池中 “zzmjava”
        System.out.println(s5 == s6);// true
        System.out.println(s5.equals(s6));// true
    }
}
