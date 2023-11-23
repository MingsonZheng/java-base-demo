package com.zzm.homework;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "jack";
//        String name = "jackhahaha";
//        String name = null;
        String pwd = "123456";
//        String pwd = "12345";
        String email = "jack@sohu.com";
//        String email = ".comjack@sohu";

        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你，注册成功~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象要求:
    (1) 用户名长度为2或3或4
    (2) 密码的长度为6，要求全是数字 isDigital
    (3) 邮箱中包含@和.并且@在.的前面
    思路分析
    (1) 先编写方法 userRegister(String name, String pwd, String email)
    (2) 针对 输入的内容进行校核，如果发现有问题，就抛出异常，给出提示
    (3) 单独的写一个方法，判断 密码是否全部是数宁宇符 boolean
     */
    public static void userRegister(String name, String pwd, String email) {
        // 再加入一些校验
        if (!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("参数不能为null");
        }

        // 用户名长度为2或3或4
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }

        // 密码的长度为6，要求全是数字 isDigital
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }

        // 邮箱中包含@和.并且@在.的前面
        int i = email.indexOf("@");
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和.并且@在.的前面");
        }
    }

    // 单独的写一个方法，判断 密码是否全部是数宁宇符 boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
