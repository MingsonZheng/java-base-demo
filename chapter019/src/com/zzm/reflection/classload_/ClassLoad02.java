// 类加载五个阶段
package com.zzm.reflection.classload_;

/**
 * @author Mingson
 * @version 1.0
 * 一个类加载的连接阶段 Linking - 准备 Preparation
 * JVM 会在该阶段对静态变量，分配内存并默认初始化(对应数据类型的默认初始值，如 0、0L、null、false 等)。
 * 这些变量所使用的内存都将在方法区中进行分配
 *
 * 一个类加载的连接阶段 Linking - 解析 Resolution
 * 虚拟机将常量池内的符号引用替换为直接引用的过程。
 */
public class ClassLoad02 {
    public static void main(String[] args) {

    }
}

class A {
    // 属性-成员变量-字段
    // 分析类加载的链接阶段-准备 属性是如何处理
    // 1. n1 是实例属性，不是静态变量，因此在准备阶段，是不会分配内存
    // 2. n2 是静态变量，分配内存 n2 是默认初始化 0，而不是20
    // 3. n3 是static final 是常量，他和静态变量不一样，因为一旦赋值就不变 n3 = 30
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}