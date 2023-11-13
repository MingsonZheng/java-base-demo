// 动态绑定
package com.zzm.poly_.dynamic_;

/*
java的动态绑定机制
1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
2. 当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();// 向上转型
        System.out.println(a.sum());// 40 -> 30
        System.out.println(a.sum1());// 30 -> 20
    }
}

class A {// 父类
    public int i = 10;
    public int sum() {
        return getI() + 10;// 20 + 10
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}
class B extends A {// 子类
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
//    public int sum1() {
//        return i + 10;
//    }
}