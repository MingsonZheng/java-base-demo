// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise10 {

}

class Test1 {
    String str = new String("zzm");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");// zzm and
        System.out.println(ex.ch);// hava
    }
}