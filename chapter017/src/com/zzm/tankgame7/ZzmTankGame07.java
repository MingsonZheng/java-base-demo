package com.zzm.tankgame7;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author Mingson
 * @version 1.0
 * 1. 游戏开始时，播放经典的坦克大战音乐 ，[思路,使用一个播放音乐的类即可]
 * 2. 修正下文件存储位置
 * 3. 处理文件相关异常
 */
public class ZzmTankGame07 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ZzmTankGame07 zzmTankGame07 = new ZzmTankGame07();
    }

    public ZzmTankGame07() {
        System.out.println("请输入选择 1: 新游戏 2: 继续上局");
        String key = scanner.next();
        mp = new MyPanel(key);
        // 将mp 放入到Thread，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);// 面板(就是游戏的绘图区域)
        this.setSize(1300, 950);
        this.addKeyListener(mp);// 让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // 在JFrame中增加相应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
