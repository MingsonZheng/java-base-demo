// 线程
package com.zzm.threaduse;

/**
 * @author Mingson
 * @version 1.0
 * main线程启动两个于线程
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();// 启动第1个线程
        thread2.start();// 启动第2个线程
    }
}

/*
继承Thread vs 实现Runnable的区别

1. 从java的设计来看，通过继承Thread或者实现Runnable接口来创建线程
   本质上没有区别,从jdk帮助文档我们可以看到Thread类本身就实现了Runnable接口
2. 实现Runnable接口方式更加适合多个线程共享一个资源的情况，
   并且避免了单继承的限制,建议使用Runnable
 */

class T1 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            // 每隔1秒输出 “hello,world”,输出10次
            System.out.println("hello,world" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 60) {
                break;
            }
        }
    }
}

class T2 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            // 每隔1秒输出 “hi”,输出5次
            System.out.println("hi" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 50) {
                break;
            }
        }
    }
}