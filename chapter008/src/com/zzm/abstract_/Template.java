// 抽象模板模式
package com.zzm.abstract_;

abstract public class Template {
    public abstract void job();// 抽象方法

    public void calculateTime() {
        // 得到开始的时间
        long start = System.currentTimeMillis();
        job();// 动态绑定机制
        // 得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("AA 执行时间 " + (end - start));
    }
}
