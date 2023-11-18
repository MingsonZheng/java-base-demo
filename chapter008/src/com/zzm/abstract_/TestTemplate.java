// 抽象模板模式
package com.zzm.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();// 这里还是需要有良好的0OP基础，对多态

        BB bb = new BB();
        bb.calculateTime();
    }
}
