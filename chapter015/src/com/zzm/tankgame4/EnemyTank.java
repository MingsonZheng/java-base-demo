package com.zzm.tankgame4;

import java.util.Vector;

/**
 * @author Mingson
 * @version 1.0
 * 敌人的坦克
 */
public class EnemyTank extends Tank {

    // 在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
