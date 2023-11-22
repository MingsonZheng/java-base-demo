// StringBuilder
package com.zzm.stringbuilder_;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        // String、StringBuffer 和StringBuilder的比较
        // 1)StringBuilder 和 StringBuffer 非常类似，均代表可变的字符序列，而且方法也一样
        // 2)String: 不可变字符序列，效率低,但是复用率高。
        // 3)StringBuffer: 可变字符序列、效率较高(增删)、线程安全，看源码
        // 4)StringBuilder: 可变字符序列、效率最高、线程不安全
        // 5)String使用注意说明:string s="a";//创建了一个字符串
        //   s +=“b”; //实际上原来的”a"字符串对象已经丢弃了，现在又产生了一个字符串s+”b”(也就是”ab”)。
        //   如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，降低效率。
        //   如果这样的操作放到循环中，会极大影响程序的性能
        //   => 结论: 如果我们对String 做大量修改,不要使用String
        String text = "";
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));

        // String、StringBuffer 和StringBuilder的选择
        // 使用的原则
        // 1. 如果字符串存在大量的修改操作，一般使用 StringBuffer 或 StringBuilder
        // 2. 如果字符串存在大量的修改操作，并在单线程的情况，使用StringBuilder
        // 3. 如果字符串存在大量的修改操作，并在多线程的情况,使用 StringBuffer
        // 4. 如果我们字符串很少修改，被多个对象引用，使用String,比如配置信息等
        // StringBuilder 的方法使用和 StringBuffer 一样，不再说
    }
}
