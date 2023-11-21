// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "zzm";// a 指向 常量池的 "zzm"
        String b = new String("zzm");// b 指向 堆中对象
        System.out.println(a.equals(b));// true
        System.out.println(a == b);// false

        // 知识点:
        // 当调用 intern 方法时，如果池已经包含一个等于此 String对象的字符串 (用equals(Object) 方法确定)，则返回池中的字符串。
        // 否则，将此 String 对象添加到池中，并返回此 String 对象的引用
        // 解读; (1) b.intern() 方法最终返回的是常量池的地址 (对象)
        System.out.println(a == b.intern());// true
        System.out.println(b == b.intern());// false
    }
}
