// 类加载五个阶段
package com.zzm.reflection.classload_;

import com.zzm.Cat;

/**
 * @author Mingson
 * @version 1.0
 * 加载 Loading
 * JVM 在该阶段的主要目的是将字节码从不同的数据源(可能是 class 文件、也可能是jar 包，甚至网络)转化为二进制字节流加载到内存中，
 * 并生成一个代表该类的java.lang.Class 对象
 *
 * 一个类加载的连接阶段 Linking - 验证 verification
 * 1. 目的是为了确保 Class 文件的字节流中包含的信息符合当前虚拟机的要求，并且不会危害虚拟机自身的安全
 * 2. 包括: 文件格式验证(是否以魔数 oxcafebabe开头)、元数据验证、字节码验证和符号引用验证
 * 3. 可以考虑使用 -Xverify:none 参数来关闭大部分的类验证措施，缩短虚拟机类加载的时间。
 */
public class ClassLoad01 {
    public static void main(String[] args) {

        /*
            连接 Linking - 验证 verification
            public static SecurityManager getSecurityManager() {
                return security;
            }
         */
        Cat cat = new Cat();
    }
}
