// String 练习
package com.zzm.string;

/**
 * @author Mingson
 * @version 1.0
 */
public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zzm";
        Person p2 = new Person();
        p2.name = "zzm";

        System.out.println(p1.name.equals(p2.name));// true
        System.out.println(p1.name == p2.name);// true
        System.out.println(p1.name == "zzm");// true

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);// false
    }
}

class Person {
    public String name;
}