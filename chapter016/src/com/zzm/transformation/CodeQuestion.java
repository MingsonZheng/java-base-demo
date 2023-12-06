// 转换流
package com.zzm.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mingson
 * @version 1.0
 * 看一个中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        // 读取d:\\a.txt 文件到程序
        // 思路
        // 1. 创建字符输入流 BufferedReader [处理流]
        // 2. 使用 BufferedReader 对象读取a.txt
        // 3. 默认情况下，读取文件是按照 utf-8 编码
        //    另存为 ANSI 编码（国标码，不同系统则对应不同编码，中文系统对应 GBK）
        //    运行则输出乱码
        String filePath = "d:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容：" + s);
        br.close();
    }
}
