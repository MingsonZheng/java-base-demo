// 异常
package com.zzm.exception_;

/**
 * @author Mingson
 * @version 1.0
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();
        B b2 = (B)b;
        C c2 = (C)b;
    }
}

class A {}
class B extends A {}
class C extends A {}