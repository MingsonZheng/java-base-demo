// 抽象模板模式
package com.zzm.abstract_;

public class AA extends Template {
    // 计算任务
    // 1+...+800000
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num += i;
        }
    }

//    public void job2() {
//        // 得到开始的时间
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 1; i <= 200000; i++) {
//            num += i;
//        }
//        // 得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("AA 执行时间 " + (end - start));
//    }
}
