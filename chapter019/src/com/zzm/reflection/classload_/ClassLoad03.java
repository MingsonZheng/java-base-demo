// 类加载五个阶段
package com.zzm.reflection.classload_;

/**
 * @author Mingson
 * @version 1.0
 * 演示类加载- 初始化阶段 Initialization
 * 1. 到初始化阶段，才真正开始执行类中定义的 Java 程序代码，此阶段是执行<clinit>() 方法的过程。
 * 2. <clinit>() 方法是由编译器按语句在源文件中出现的顺序，依次自动收集
 *    类中的所有 静态变量 的赋值动作和 静态代码块 中的语句，并进行合并。
 * 3. 虚拟机会保证一个类的 <clinit>() 方法在多线程环境中被正确地加锁、同步，
 *    如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的 <clinit>()方法，
 *    其他线程都需要阻塞等待，直到活动线程执行<clinit>() 方法完毕
 */
public class ClassLoad03 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 分析
        // 1. 加载B类，并生成 B的cLass对象
        // 2. 链接 num = 0
        // 3. 初始化阶段
        //    依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句，并合并
        /*
                clinit() {
                    System.out.println("B 静态代码块被执行");
                    // num = 300;
                    num = 100;
                }
                合并：num = 100;
         */
        // 4. B() 构造器被执行

//        new B();// 类加载
//        System.out.println(B.num);// 100，如果直接使用类的静态属性，也会导致类的加载

        // 看看加载类的时候，是有同步机制控制
        /*
            protected Class<?> loadClass(String name, boolean resolve)
                throws ClassNotFoundException
            {
                // 正因为有这个机制，才能保证某个类在内存中，只有一份cLass对象
                synchronized (getClassLoadingLock(name)) {
         */
        B b = new B();
    }
}

class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;
    public B() {
        System.out.println("B() 构造器被执行");
    }
}