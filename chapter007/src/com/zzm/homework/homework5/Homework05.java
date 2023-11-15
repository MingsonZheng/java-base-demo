// 作业
package com.zzm.homework.homework5;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(15);
        jack.printSal();

        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();

        Teacher teacher = new Teacher("kevin", 2000);
        teacher.setClassDays(360);
        teacher.setClassSal(1000);
        teacher.printSal();

        Scientist scientist = new Scientist("钟南山", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();
    }
}
