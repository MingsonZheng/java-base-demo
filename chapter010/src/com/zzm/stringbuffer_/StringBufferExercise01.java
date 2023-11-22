// StringBuffer练习
package com.zzm.stringbuffer_;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();// 需要看源码，底层调用的是 AbstractStringBuilder 的 appendNull
        sb.append(str);
        System.out.println(sb.length());

        System.out.println(sb);// null
        // 下面的构造器，会抛出NullPointerException
        StringBuffer sb1 = new StringBuffer(str);// 看底层源码 super(str.Length() + 16);
        System.out.println(sb1);
    }
}
