// 作业
package com.zzm.homework;

public class LabeledPoint extends Point{
    private String labe;

    public LabeledPoint(String labe, double x, double y) {
        super(x, y);
        this.labe = labe;
    }
}
