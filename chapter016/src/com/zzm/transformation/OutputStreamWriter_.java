// 转换流
package com.zzm.transformation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Mingson
 * @version 1.0
 * 演示 OutputStreamWriter 使用
 * 把 FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\b.txt";
        // String charSet = "gbk";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi, 你好中国");
        osw.close();
        System.out.println("按照 " + charSet + " 保存文件成功~");
    }
}
