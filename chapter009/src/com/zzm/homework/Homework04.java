package com.zzm.homework;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");// (1)
        } finally {
            System.out.println("C");// (2)
        }
        System.out.println("D");// (3)
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }
}
