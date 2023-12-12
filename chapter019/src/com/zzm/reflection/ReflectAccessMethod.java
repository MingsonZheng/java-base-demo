// 反射调用方法
package com.zzm.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Mingson
 * @version 1.0
 * 演示通过反射调用方法
 */
public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // 1. 得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("com.zzm.reflection.Boss");
        // 2. 创建对象
        Object o = bossCls.newInstance();
        // 3. 调用public的hi方法
        // Method hi = bossCls.getMethod("hi", String.class);
        // 3.1 得到hi方法对象
        Method hi1 = bossCls.getDeclaredMethod("hi", String.class);
        // 3.2 调用
        hi1.invoke(o, "你好中国");

        // 4. 调用private static 方法
        // 4.1 得到 say 方法对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        // 4.2 因为say方法时private，所以需要暴破，原理和前面讲的构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o, 100, "张三", '男'));
        // 4.3 因为say方法时static的，还可以这样调用 ，可以传入nulL
        System.out.println(say.invoke(null, 200, "李四", '女'));

        // 5. 在反射中，如果方法有返回值，统一返回Object，但是他运行类型和方法定义的返回类型一致
        Object reVal = say.invoke(null, 300, "王五", '男');
        System.out.println("reVal 的运行类型=" + reVal.getClass());// String
    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi " + s);
    }
}