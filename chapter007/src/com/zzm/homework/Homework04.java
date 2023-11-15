// 作业
package com.zzm.homework;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
        manager.setBonus(3000);
        manager.printSal();

        Worker worker = new Worker("关羽", 50, 10, 1.0);
        worker.printSal();
    }
}
