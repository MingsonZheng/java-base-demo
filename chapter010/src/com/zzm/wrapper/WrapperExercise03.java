// 包装类练习
package com.zzm.wrapper;

/**
 * @author Mingson
 * @version 1.0
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        // 示例一
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);// false
        // 示例二
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);// false
        // 示例三
        Integer i5 = 127;// 底层Integer.value0f(127)
        Integer i6 = 127;// -128 - 127
        System.out.println(i5 == i6);// true
        // 示例四
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);// false
        // 示例五
        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);// false
    }
}
