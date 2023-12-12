package com.zzm.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /**
         * 定义 PrivateTest 类，有私有 name 属性，并且属性值为 hellokitty，提供 getName 的公有方法
         * 创建PrivateTest的类，利用Class类得到私有的name属性，修改私有的name属性值并调用getName()的方法打印name属性值
         */
        // 1. 得到 PrivateTest类对应的Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        // 2. 创建对象实例
        PrivateTest privateTestObj = privateTestClass.newInstance();
        // 3. 得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        // 4. 爆破name
        name.setAccessible(true);
        name.set(privateTestObj, "天龙八部");
        // 5. 得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        // 6. 因为getName() 是public，所有直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性值=" + invoke);
    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}