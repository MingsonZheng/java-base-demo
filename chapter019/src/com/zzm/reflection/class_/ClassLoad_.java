// 动态和静态加载
package com.zzm.reflection.class_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author Mingson
 * @version 1.0
 */
public class ClassLoad_ {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch (key) {
            case "1":
                Dog dog = new Dog();// 静态加载，依赖性很强
                dog.cry();
                break;
            case "2":
                // 反射->动态加载
                Class cls = Class.forName("com.zzm.reflection.class_.Person");// 加载Person类[动态加载]
                Object o = cls.newInstance();
                Method m = cls.getMethod("hi");
                m.invoke(o);
                System.out.println("ok");
                break;
            default:
                System.out.println("do nothing...");
        }
    }
}

// 因为new Dog() 是静态加载，因此必须编写Dog
// Person类是动态加载，所以，没有编写Person类也不会报错，只有当动态加载该类时，才会报错
class Dog {
    public void cry() {
        System.out.println("小狗汪汪叫");
    }
}
class Person {
    public void hi() {
        System.out.println("小孩 hi");
    }
}
