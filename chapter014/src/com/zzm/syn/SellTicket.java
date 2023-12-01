// 线程同步
package com.zzm.syn;

/**
 * @author Mingson
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
//        // 测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        // 这里我们会出现超卖...
//        sellTicket01.start();// 启动售票线程
//        sellTicket02.start();// 启动售票线程
//        sellTicket03.start();// 启动售票线程

//        System.out.println("===使用实现接口方式来售票=====");
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();// 第1个线程窗口
//        new Thread(sellTicket02).start();// 第2个线程窗口
//        new Thread(sellTicket02).start();// 第3个线程窗口

        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();// 第1个线程窗口
        new Thread(sellTicket03).start();// 第2个线程窗口
        new Thread(sellTicket03).start();// 第3个线程窗口
    }
}

// 实现接口方式，使用synchronized实现线程同步
class SellTicket03 implements Runnable {

    private int ticketNum = 100;// 让多个线程共享 ticketNum
    private boolean loop = true;// 控制run方法变量

    public synchronized void sell() { // 同步方法，在同一时刻， 只能有一个线程来执行sell方法
        if (ticketNum <= 0) {
            System.out.println("售票结束...");
            loop = false;
            return;
        }

        // 休眠50毫秒，模拟
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                + " 剩余票数=" + (--ticketNum));
    }

    @Override
    public void run() {
        while (loop) {
            sell();// sell方法是一个同步方法
        }
    }
}

// 使用Thread方式
class SellTicket01 extends Thread {

    private static int ticketNum = 100;// 让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            // 休眠50毫秒，模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
            + " 剩余票数=" + (--ticketNum));
        }
    }
}

// 实现接口方式
class SellTicket02 implements Runnable {

    private int ticketNum = 100;// 让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            // 休眠50毫秒，模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }
}