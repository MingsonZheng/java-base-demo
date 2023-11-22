// StringBuilder
package com.zzm.stringbuilder_;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        // 基本介绍
        // 1)一个可变的字符序列。此类提供一个与 StringBuffer 兼容的 API，但不保证同步(StringBuilder 不是线程安全)。
        //   该类被设计用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候。
        //   如果可能，建议优先采用该类因为在大多数实现中，它比 StringBuffer 要快 [后面测]
        // 2)在 StringBuilder 上的主要操作是 append 和 insert 方法，可重载这些方法以接受任意类型的数据。

        // 解读
        // 1. StringBuilder 继承 AbstractStringBuilder 类
        // 2. 实现了 Serializable,说明StringBuilder对象是可以串行化(对象可以网络传输,可以保存到文件)
        // 3. StringBuilder 是final类，不能被继承
        // 4. StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder的 char[] value;
        //    因此，字符序列是堆中
        // 5. StringBuilder 的方法，没有做互斥的处理,即没有synchronized 关键字,因此在单线程的情况下使用StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
    }
}
