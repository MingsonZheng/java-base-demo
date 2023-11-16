// Main 动态传值
// Current File -> Edit Configuration -> Add new Application -> Program arguments -> 北京 上海 天津 tom jack
package com.zzm.main_;

public class Main02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] =" + args[i]);
        }
    }
}
