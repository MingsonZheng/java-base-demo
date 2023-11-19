// 枚举练习
package com.zzm.enum_;

/**
 * @author Mingson
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        System.out.println(boy);// BOY
//        public String toString() {
//            return name;
//        }
        System.out.println(boy2 == boy);// true
    }
}

enum Gender2 {
    BOY, GIRL;
}