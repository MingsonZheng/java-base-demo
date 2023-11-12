// 继承
package com.zzm.extend_;

// 输入ctr + H 可以看到类的继承关系
public class Sub extends Base {// 子类

    public Sub(String name, int age) {
        // 1. 调用父类的无参构造器，如下或者 什么都不写，默认就是调用super()
//        super();// 父类的无参构造器
        // 2. 调用父类的 Base(string name) 构造器
//        super("zzm");
        // 3. 调用父类的 Base(string name，int age) 构造器
        super("king", 20);

        /*
        细节:super在使用时，必须放在构造器第一行
        细节: super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
        this() 不能再使用了
         */

        System.out.println("子类Sub(String name，int age)构造器被调用...");
    }

    public Sub() {
//        super();// 默认调用父类的无参构造器
        super("smith", 10);
        System.out.println("子类Sub()构造器被调用...");
    }

    // 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom", 30);
        System.out.println("子类Sub(String name)构造器被调用...");
    }

    public void sayOk() {
        // 非私有的属性和方法可以在子类直接访问
        // 但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();

        // 要通过父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }
}