// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise07 {
    public static void main(String[] args) {
        String a = "hello" + "abc";
        // 创建了几个对象? 只有1个对象
        // 解读: String a ="hello"+"abc"; //==>优化等价 String a ="helloabc
        // 分析
        // 1. 编译器不傻,做一个优化; 判断创建的常量池对象，是否有引用指向
        // 2. String a = "hello" +"abc"; =》 String a = "helloabc":
    }
}
