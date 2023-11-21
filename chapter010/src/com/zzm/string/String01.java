// String
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        // 1. String 对象用于保存字符串，也就是一组字符序列
        // 2. “jack” 字符串常量，双引号括起的字符序列
        // 3. 字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
        // 4. string 类有很多构造器，构造器的重载
        //    常用的有
//        String s1 = new String();
//        String s2 = new String(String original);
//        String s3 = new String(char[] a);
//        String s4 = new String(char[] a, int startIndex, int count);
//        String s5 = new String(byte[] b);
        // 5. String 类实现了接口 Serializable [String 可以串行化:可以在网络传输]
        //                   接口 Comparable [String 对象可以比较大小]
        // 6. string 是 final 类，不能被其他的类继承
        // 7. String 有属性 private final char value[]; 用于存放字符串内容
        // 8. 一定要注意: value 是一个 final 类型，不可以修改(需要功力)：
        //    即value不能指向新的地址，但是单个字符内容可以变化

        String name = "jack";
        name = "tom";
        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', 'm'};
        value[0] = 'H';
//        value = v2;// 不可以修改 value 地址

        // 创建String对象的两种方式
        // 方式一
        // 先从常量池查看是否有”zzm”数据空间，
        // 如果有，直接指向;如果没有则重新创建，然后指向。
        // s最终指向的是常量池的空间地址
        String s = "zzm";
        // 方式二
        // 先在堆中创建空间，里面维护了value属性，指向常量池的zzm空间
        // 如果常量池没有”zzm”，重新创建，
        // 如果有，直接通过value指向。
        // 最终指向的是堆中的空间地址
        String s2 = new String("zzm");
    }
}
