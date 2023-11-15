// 作业
package com.zzm.homework;

public class Worker extends Employee {
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    // 因为普通员工和Employee输出工资情况一样，所以直接调用父类的printSal()
    @Override
    public void printSal() {
        System.out.print("普通员工 ");
        super.printSal();
    }
}
