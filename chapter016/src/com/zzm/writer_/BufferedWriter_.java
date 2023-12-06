// BufferedWriter
package com.zzm.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mingson
 * @version 1.0
 * 演示 bufferedWriter 使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\ok.txt";
        // 创建BufferedWriter
        // 说明:
        // 1. new FileWriter(filePath，true) 表示以追加的方式写入
        // 2. new FileWriter(filePath)，表示以覆盖的方式写入
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hello，你好中国");
        bufferedWriter.newLine();// 插入一个和系统相关的换行
        bufferedWriter.write("hello2，你好中国");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3，你好中国");
        bufferedWriter.newLine();

        // 说明:关闭外层流即可 ， 传入的 new FileWriter(filePath)，会在底层关闭
        bufferedWriter.close();
    }
}
