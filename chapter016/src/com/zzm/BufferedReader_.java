// 节点流和处理流
package com.zzm;

/**
 * @author Mingson
 * @version 1.0
 * 处理流/包装流 (修饰器模式)
 */
public class BufferedReader_ extends Reader_ {

    private Reader_ reader_;// 属性是 Reader_ 类型

    // 接收Reader_子类对象
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() {// 封装一层
        reader_.readFile();
    }

    // 让方法更加灵活，多次读取文件，或者加缓冲char[] ...
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    // 扩展 readString，批量处理字符串数据
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
