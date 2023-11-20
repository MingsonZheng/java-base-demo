package com.zzm.homework;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

// 一个类A，在类中定义局部内部类B，B中有一个私有final常量name，一个方法show()打印常量name。进行测试
// 进阶:A中也定义一个私有的变量name，在show方法中打印测试
class A {
    private String NAME = "hello";

    public void f1() {
        class B {
            private final String NAME = "zzm";

            public void show() {
                // 如果内部类和外部类的属性重名，可以用外部类.this.属性名来指定
                System.out.println("NAME=" + NAME + " 外部类的NAME=" + A.this.NAME);
            }
        }

        B b = new B();
        b.show();
    }
}