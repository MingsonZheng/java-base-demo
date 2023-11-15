// 作业
package com.zzm.homework.homework5;

public class Worker extends Employee {// 子类

    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("工人 ");
        super.printSal();
    }
}
