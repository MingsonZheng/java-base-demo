// StringBuffer转换
package com.zzm.stringbuffer_;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        // 看 String->StringBuffer
        String str = "hello tom";
        // 方式1 使用构造器
        // 注意:返回的才是StringBuffer对象，对str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        // 方式2 使用的是append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        // 看看 StringBuffer ->String
        StringBuffer stringBuffer2 = new StringBuffer("zzm");
        // 方式1 使用StringBuffer提供的 toString方法
        String s = stringBuffer2.toString();
        // 方式2: 使用构造器来搞定
        String s1 = new String(stringBuffer2);
    }
}
