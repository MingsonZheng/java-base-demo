// 异常练习
package com.zzm.try_;

/**
 * @author Mingson
 * @version 1.0
 */
public class TryCatchExercise03 {
}

class Exception03 {
    public static int method() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "zzm";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;
        } finally {
            ++i;
            System.out.println("i=" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());// 3
    }
}