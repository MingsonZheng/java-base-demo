package com.zzm.tankgame6;

import javax.swing.*;

/**
 * @author Mingson
 * @version 1.0
 * 1. 防止敌人坦克重叠运动[思路->走代码]
 * 2. 记录玩家的成绩,存盘退出[io流]
 * 3. 记录当时的敌人坦克坐标,存盘退出[io流]
 * 4. 玩游戏时，可以选择是开新游戏还是继续上局游戏
 */
public class ZzmTankGame06 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        ZzmTankGame06 zzmTankGame06 = new ZzmTankGame06();
    }

    public ZzmTankGame06() {
        mp = new MyPanel();
        // 将mp 放入到Thread，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);// 面板(就是游戏的绘图区域)
        this.setSize(1200, 950);
        this.addKeyListener(mp);// 让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
