package com.zzm.homework;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework03 {
    public static void func() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");// (1)
        }
    }

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");// (2)
        }
        System.out.println("D");// (3)
    }
}
