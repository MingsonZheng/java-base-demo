// 字节输出流
package com.zzm.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Mingson
 * @version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用 FileOutputStream 将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {

        // 创建 FileOutputStream对象
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            // 得到 FileOutputStream对象 对象
            // 说明
            // 1，new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            // 2，new FileOutputStream(filePath，true) 创建方式，当写入内容是，是追加到文件后面
            // fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath, true);
            // 写入一个字节
            // fileOutputStream.write('H');
            // 写入字符串
            String str = "zzm,world!";
            // str.getBytes() 可以把 字符串-> 字节数组
            // fileOutputStream.write(str.getBytes());
            // write(byte[] b, int off, int len) 将len字节从位于偏移量 off的指定字节数组得入此文件输出流
            fileOutputStream.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
