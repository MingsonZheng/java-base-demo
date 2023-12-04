package com.zzm.tankgame5;

import javax.swing.*;

/**
 * @author Mingson
 * @version 1.0
 * 1. 我方坦克在发射的子弹消亡后才能发射新的子弹.=> 扩展(发多颗子弹怎么办
 *    控制在我们的面板上，最多只有5颗)
 * 2. 让敌人坦克发射的子弹消亡后可以再发射子弹.
 * 3. 当敌人的坦克击中我方坦克时，我方坦克消失，并出现爆炸效果
 */
public class ZzmTankGame05 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        ZzmTankGame05 zzmTankGame05 = new ZzmTankGame05();
    }

    public ZzmTankGame05() {
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
