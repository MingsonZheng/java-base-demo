// 标准输入输出流
package com.zzm.standard;

import java.util.Scanner;

/**
 * @author Mingson
 * @version 1.0
 */
public class InputAndOutput {
    public static void main(String[] args) {
        // System 类 的 public final static InputStream in = null;
        // System.in 编译类型InputStream
        // System.in 运行类型BufferedInputStream
        // 表示的是标准输入 键盘
        System.out.println(System.in.getClass());

        // 解读
        // 1. System.out public final static PrintStream out = null;
        // 2，编译类型 PrintStream
        // 3. 运行类型 PrintStream
        // 4. 表示标准输出 显示器
        System.out.println(System.out.getClass());

        System.out.println("hello，你好中国");

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println("next=" + next);
    }
}
