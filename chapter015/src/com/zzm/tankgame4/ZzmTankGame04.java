package com.zzm.tankgame4;

import javax.swing.*;

/**
 * @author Mingson
 * @version 1.0
 * 1. 让敌人的坦克也能够发射子弹(可以有多颗子弹)
 * 2. 当我方坦克击中敌人坦克时，敌人的坦克就消失,如果能做出爆炸效果更好
 * 3. 让敌人的坦克也可以自由随机的上下左右移动
 * 4. 控制我方的坦克和敌人的坦克在规定的范围移动
 */
public class ZzmTankGame04 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        ZzmTankGame04 zzmTankGame04 = new ZzmTankGame04();
    }

    public ZzmTankGame04() {
        mp = new MyPanel();
        // 将mp 放入到Thread，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);// 面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);// 让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
