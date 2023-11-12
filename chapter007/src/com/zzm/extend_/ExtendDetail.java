// 继承
package com.zzm.extend_;

public class ExtendDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.sayOk();
        Sub sub2 = new Sub("jack");
        Sub sub3 = new Sub("king", 10);
    }
}
