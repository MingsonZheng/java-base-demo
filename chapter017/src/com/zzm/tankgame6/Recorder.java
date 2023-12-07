package com.zzm.tankgame6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mingson
 * @version 1.0
 * 该类用于记录相关信息的。和文件交互
 */
public class Recorder {

    // 定义变量，记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    // 定义IO对象，准备写数据到文件中
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static String recordFile = "d:\\myRecord.txt";

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    // 当我方坦克击毁一个敌人坦克，就应当 alLEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

    // 增加一个方法，当游戏退出时，我们将allEnemyTankNum 保存到 recordFile
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
