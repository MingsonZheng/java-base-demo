// 反射快速入门
package com.zzm;

/**
 * @author Mingson
 * @version 1.0
 */
public class Cat {

    private String name = "招财猫";

    public void hi() {// 常用方法
        System.out.println("hi " + name);
    }

    public void cry() {// 常用方法
        System.out.println(name + "喵喵叫...");
    }
}
