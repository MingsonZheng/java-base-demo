// 作业
package com.zzm.homework;

// 子类
public class Professor extends Teacher {

    public Professor(String name, int age, String post, double salsary, double grade) {
        super(name, age, post, salsary, grade);
    }

    @Override
    public void introduce() {
        System.out.println(" 这是教授的信息 ");
        super.introduce();
    }
}
