// 反射机制创建实例
package com.zzm.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Mingson
 * @version 1.0
 * 演示通过反射机制创建实例
 */
public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // 1. 先获取到User类的Class对象
        Class<?> userClass = Class.forName("com.zzm.reflection.User");
        // 2. 通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        // 3. 通过public的有参构造器创建实例
        /*
            constructor 对象就是
            public User(String name) {// public的有参构造器
                this.name = name;
            }
         */
        // 3.1 先得到对应构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        // 3.2 创建实例，并传入实参
        Object zzm = constructor.newInstance("zzm");
        System.out.println("zzm=" + zzm);
        // 4. 通过非public的有参构造器创建实例
        // 4.1 得到private的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        // 4.2 创建实例
        // 暴破[暴力破解]，使用反射可以访问private构造器/方法/属性，反射面前，都是纸老虎
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2=" + user2);
    }
}

class User {
    private int age = 10;
    private String name = "你好中国";

    public User() {// public的无参构造器

    }

    public User(String name) {// public的有参构造器
        this.name = name;
    }

    private User(int age, String name) {// private 有参构造器
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}