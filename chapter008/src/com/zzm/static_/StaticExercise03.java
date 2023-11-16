// 类成员练习
package com.zzm.static_;

public class StaticExercise03 {
}

class Person {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total) {
//        this.total = total;// 错误，因为在static方法中，不可以使用this 关键字

        Person.total = total;
    }

    public Person() {
        total++;
        id = total;
    }

    public static void m() {
        System.out.println("total的值=" + total);
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
        Person.m();// 4
    }
}