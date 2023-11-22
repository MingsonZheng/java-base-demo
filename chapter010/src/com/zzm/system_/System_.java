// System方法
package com.zzm.system_;

import java.util.Arrays;

/**
 * @author Mingson
 * @version 1.0
 */
public class System_ {
    public static void main(String[] args) {
//        // exit 退出当前程序
//        System.out.println("ok1");
//        // 解读
//        // 1. exit(0) 表示程序退出
//        // 2. 0 表示一个状态 ，正常的状态
//        System.exit(0);
//        System.out.println("ok2");

        // arraycopy : 复制数组元素，比较适合底层调用,
        // 一般使用Arrays.copyOf完成复制数组
        int[] src = {1, 2, 3};
        int[] dest = new int[3];// dest 当前是 {0, 0, 0}

        // 解读
        // 1. 主要是搞清楚这五个参数的含义
        // 2. Params:
        //    src – the source array.
        //    源数组
        //    srcPos – starting position in the source array.
        //    从源数组的哪个索引位置开始拷贝
        //    dest – the destination array.
        //    目标数组，即把源数组的数据拷贝到哪个数组
        //    destPos – starting position in the destination data.
        //    把源数组的数据拷贝到 目标数组的哪个索引
        //    length – the number of array elements to be copied.
        //    从源数组拷贝多少个数据到目标数组
        System.arraycopy(src, 0, dest, 1, 2);
        System.out.println(Arrays.toString(dest));// [0, 1, 2]

        // currentTimeMillis:返回当前时间距离1970-1-1 的毫秒数
        System.out.println(System.currentTimeMillis());

        // gc:运行垃圾回收机制 System.gc():
    }
}
