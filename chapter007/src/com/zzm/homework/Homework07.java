// 作业
package com.zzm.homework;

public class Homework07 {
}
class Test {// 父类
    String name = "Rose";
    Test() {
        System.out.println("Test");// (1)
    }
    Test(String name) {// name john
        this.name = name;
    }
}
class Demo extends Test {// 子类
    String name = "Jack";
    Demo() {
        super();
        System.out.println("Demo");// (2)
    }
    Demo(String s) {
        super(s);
    }
    public void test() {
        System.out.println(super.name);// (3) Rose (5) John
        System.out.println(this.name);// (4) Jack (6) Jack
    }

    public static void main(String[] args) {
        new Demo().test();// 匿名对象
        new Demo("john").test();// 匿名
    }
}