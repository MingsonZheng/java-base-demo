package com.zzm.utils;

import java.util.Scanner;

/**
 * 工具类的作用:
 * 处理各种况的用户输入，并且能够按照程序员的需求，得到用户的控制台输入。
 */
public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * 功能:读取键盘输入的一个菜单选项，值:1--5的范围
     * @return
     */
    public static char readMenuSelection() {
        char c;
        for (; ;) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' &&
                c != '3' && c != '4' && c != '5') {
                System.out.println("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    /**
     * 功能: 读取键盘输入的一个字符
     * @return 一个字符
     */
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    /**
     * 功能: 读取键盘输入的一个字符，如果直接按回车，则返回指定的默认值
     * @param defaultValue 指定的默认值
     * @return 默认值或输入的字符
     */
    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    /**
     * 功能:读取键盘输入的整型，长度小于2 位
     * @return 整数
     */
    public static int readInt() {
        int n;
        for (; ;) {
            String str = readKeyBoard(10, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 功能: 读取键盘输入的 整数或默认值，如果直接按回车，则返回指定的默认值
     * @param defaultValue 指定的默认值
     * @return 整数或默认值
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ;) {
            String str = readKeyBoard(10, true);
            if (str.equals("")) {
                return defaultValue;
            }
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 功能:读取键盘输入的指定长度的字符串
     * @param limit 限制的长度
     * @return 指定长度的字符串
     */
    public static String readString(int limit) {
        return readKeyBoard(limit, true);
    }

    /**
     * 功能:读取键盘输入的指定长度的字符串或默认值，如果直接按回车，则返回指定的默认值
     * @param limit 限制的长度
     * @param defaultValue 指定的默认值
     * @return 指定长度的字符串
     */
    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str;
    }

    /**
     * 功能:读取键盘输入的确认选项，Y或N
     * 将小的功能，封装到一个方法中。
     * @return Y或N
     */
    public static char readConfirmSelection() {
        System.out.println("请输入你的选择(Y/N)：请小心选择");
        char c;
        for (; ;) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }

    /**
     * 功能: 读取一个字符申
     * @param limit 读取的长度
     * @param blankReturn 如果为true ，表示 可以读空字符串。
     *                    如果为false表示 不能读空字符串。
     * 如果输入为空，或者输入大limit的长度，就会提示重新输入。
     * @return
     */
    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.length() == 0) {
                if (blankReturn) {// 如果blankReturn=true，可以返回空串
                    return line;
                } else {
                    continue;
                }
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度不能大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}
