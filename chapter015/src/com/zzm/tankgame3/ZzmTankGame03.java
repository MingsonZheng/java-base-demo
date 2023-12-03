package com.zzm.tankgame3;

import javax.swing.*;

/**
 * @author Mingson
 * @version 1.0
 * 当玩家按一下 j 键就发射一颗子弹
 */
public class ZzmTankGame03 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        ZzmTankGame03 zzmTankGame03 = new ZzmTankGame03();
    }

    public ZzmTankGame03() {
        mp = new MyPanel();
        this.add(mp);// 面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);// 让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
