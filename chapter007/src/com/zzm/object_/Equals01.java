// Object
package com.zzm.object_;

/*
== 是一个比较运算符
1. ==：既可以判断基本类型，又可以判断引用类型
2. ==：如果判断基本类型，判断的是值是否相等。示例: int i=10; double d=10.0;
3. ==：如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象
 */
public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == b);// true
        System.out.println(b == c);// true

        B bObj = a;
        System.out.println(bObj == c);// true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);// 基本数据类型，判断值是否相等

        // equals 方法，源码怎么查看
        // 把光标放在equals方法，直接输入ctrl+b
        "hello".equals("abc");

        /*
        // Jdk的源码 String类的 equals方法
        // 把object的equals方法重写了，变成了比较两个字符串值是否相同
        public boolean equals(Object anObject) {
            if (this == anObject) {// 如果是同一个对象
                return true;// 返回true
            }
            if (anObject instanceof String) {// 判断类型
                String anotherString = (String)anObject;// 向下转型
                int n = value.length;
                if (n == anotherString.value.length) {// 如果长度相同
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {// 然后一个一个的比较字符
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;// 如果两个字符串的所有字符都相等，则返回true
                }
            }
            return false;// 如果比较的不是字符串，则直接返回false
        }
         */

        new Object().equals(null);
        // 看看0bject类的 equals 是
        // 即object 的equals 方法默认就是比较对象地址是否相同
        // 也就是判断两个对象是不是同一个对象。
        /*
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */

        new Integer(5).equals(null);
        // 从源码可以看到 Integer 也重写了0bject的equals方法
        // 变成了判断两个值是否相同
        /*
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
        }
         */
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);// false
        System.out.println(integer1.equals(integer2));// true

        String str1 = new String("zzm");
        String str2 = new String("zzm");
        System.out.println(str1 == str2);// false
        System.out.println(str1.equals(str2));// true
    }
}

class B {}
class A extends B { }