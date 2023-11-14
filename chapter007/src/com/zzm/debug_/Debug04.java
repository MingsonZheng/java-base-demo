// 断点调试
package com.zzm.debug_;

import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, -10, -20, 100};
        // 我们看看Arrays.sort方法底层实现。->Debug
        Arrays.sort(arr);// Resume Program F9 跳到下一断点
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
    }
}
