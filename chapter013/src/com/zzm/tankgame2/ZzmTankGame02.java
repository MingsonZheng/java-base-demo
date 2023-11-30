package com.zzm.tankgame2;

import javax.swing.*;

/**
 * @author Mingson
 * @version 1.0
 * 通过按键可以控制我方坦克上下左右移动
 */
public class ZzmTankGame02 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzmTankGame02 zzmTankGame02 = new ZzmTankGame02();
    }

    public ZzmTankGame02() {
        mp = new MyPanel();
        this.add(mp);// 面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);// 让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
