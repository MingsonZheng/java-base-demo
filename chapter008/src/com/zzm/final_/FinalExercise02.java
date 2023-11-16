// Final练习
package com.zzm.final_;

public class FinalExercise02 {
}

class Something {
    public int addOne(final int x) {
        // ++x;// 错误，原因是不能修改 final x的值
        return x + 1;
    }
}