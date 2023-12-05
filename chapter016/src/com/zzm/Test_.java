// 节点流和处理流
package com.zzm;

/**
 * @author Mingson
 * @version 1.0
 */
public class Test_ {
    public static void main(String[] args) {

        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        // bufferedReader_.readFiles(10);
        bufferedReader_.readFile();

        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        bufferedReader_2.readStrings(5);
    }
}
