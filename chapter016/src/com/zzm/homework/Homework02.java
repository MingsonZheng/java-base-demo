package com.zzm.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        /**
         * 要求: 使用 BufferedReader读取一个文本文件，为每行加上行号
         * 再连同内容一并输出到屏幕上。
         */

        String filePath = "d:\\a.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {// 循环读取
                System.out.println(++lineNum + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
