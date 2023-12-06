// 字符打印流
package com.zzm.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Mingson
 * @version 1.0
 * 演示 PrintWriter 使用方式
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        // PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\f2.txt"));
        printWriter.print("hi，北京你好~");
        printWriter.close();// flush + 关闭流，才会将数据写入到文件...
    }
}
