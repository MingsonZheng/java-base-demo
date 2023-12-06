// 对象处理流
package com.zzm.outputstream_;

import java.io.Serializable;

/**
 * @author Mingson
 * @version 1.0
 */
// 如果需要序列化某个类的对象，实现 Serializable
public class Dog implements Serializable {
    private String name;
    private int age;

    // serialVersionUID 序列化的版本号，可以提高兼容性
    // 当你添加 hobby 属性时，不会认为 Dog 是一个新的类
    // 而是 Dog 类的升级版本
    private static final long serialVersionUID = 1L;

    private String hobby;

    // 序列化对象时，默认将里面所有属性都进行序列化，但除了static或transient修饰的成员
    private static String nation;
    private transient String color;

    // 序列化对象时，要求里面属性的类型也需要实现序列化接口
    private Master master = new Master();

//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", color='" + color + '\'' +
                ", master=" + master +
                '}';
    }
}
