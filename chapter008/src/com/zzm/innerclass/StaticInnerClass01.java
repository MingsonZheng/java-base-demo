// 静态内部类
package com.zzm.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        // 外部其他类 使用静态内部类
        // 方式一
        // 因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        // 方式2
        // 编写一个方法，可以返回静态内部类的对象实例。
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();

        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        inner10_.say();
    }
}

class Outer10 {// 外部类
    private int n1 = 10;
    private static String name = "张三";

    private static void cry() {}

    // Inner10就是静态内部类
    // 1. 放在外部类的成员位置
    // 2. 使用static 修饰
    // 3. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    // 4，可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    // 5. 作用域 :同其他的成员，为整个类体
    static class Inner10 {
        private static String name = "李四";

        public void say() {
            System.out.println(name + " 外部类name= " + Outer10.name);
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}