// 代码块练习
package com.zzm.codeblock_;

public class CodeBlockExercise01 {
}

class Person {
    public static int total;

    static {// 静态代码块
        total = 100;
        System.out.println("in static block!");// (1)
    }
}

//class Test {
//    public static void main(String[] args) {
//        System.out.println("total = " + Person.total);
//        System.out.println("total = " + Person.total);
//    }
//}