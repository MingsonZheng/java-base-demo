// 接口练习
package com.zzm.interface_;

public class InterfaceExercise02 {
}

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        // System.out.println(x);//错误，原因不明确x
        // 可以明确的指定X
        // 访问接口的 x 就使用 A.x
        // 访问父类的 x 就使用 super.x
        System.out.println(A.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}