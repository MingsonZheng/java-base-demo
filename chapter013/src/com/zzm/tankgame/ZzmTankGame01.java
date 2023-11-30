package com.zzm.tankgame;

import javax.swing.*;

/**
 * @author Mingson
 * @version 1.0
 */
public class ZzmTankGame01 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzmTankGame01 zzmTankGame01 = new ZzmTankGame01();
    }

    public ZzmTankGame01() {
        mp = new MyPanel();
        this.add(mp);// 面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
