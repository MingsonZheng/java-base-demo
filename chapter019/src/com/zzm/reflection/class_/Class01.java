// Class类分析
package com.zzm.reflection.class_;

/**
 * @author Mingson
 * @version 1.0
 * 对 Class 类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 看看Class类图
        // 1. Class也是类，因此也继承Object类
        // Class
        // 2. Class类对象不是new出来的，而是系统创建的
        // (1) 传统new对象
        /*  ClassLoader 类
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        // Cat cat = new Cat();
        // (2) 反射方式，没有debug到 classLoader类的 LoadClass，原因是，没有注销 Cat cat = new Cat();
        /* ClassLoader类，仍然是通过 ClassLoader类加载Cat类的Class对象
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        Class cls1 = Class.forName("com.zzm.Cat");

        // 3. 对于某个类的class类对象，在内存中只有一份，因为类只加线一次
        Class cls2 = Class.forName("com.zzm.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class cls3 = Class.forName("com.zzm.Dog");
        System.out.println(cls3.hashCode());
    }
}
