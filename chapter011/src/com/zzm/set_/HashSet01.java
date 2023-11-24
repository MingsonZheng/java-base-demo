// HashSet
package com.zzm.set_;

import java.util.HashSet;

/**
 * @author Mingson
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        // 说明
        // 1，在执行add方法后，会返回一个boolean值
        // 2，如果添加成功，返回 true，否则返回false
        // 3. 可以通过 remove 指定删除哪个对象
        System.out.println(set.add("john"));// true
        System.out.println(set.add("lucy"));// true
        System.out.println(set.add("john"));// false
        System.out.println(set.add("jack"));// true
        System.out.println(set.add("Rose"));// true
        set.remove("john");
        System.out.println("set=" + set);// [Rose, lucy, jack]

        set = new HashSet();
        System.out.println("set=" + set);
        // 4 Hashset 不能添加相同的元素/数据
        set.add("lucy");// 添加成功
        set.add("lucy");// 加入不了
        set.add(new Dog("tom"));// OK
        set.add(new Dog("tom"));// OK
        System.out.println("set=" + set);

        // 在加深一下。非常经典的面试题
        // 看源码，做分析，
        // 去看他的源码，即 add 到底发生了什么?=> 底层机制
        set.add(new String("zzm"));// OK
        set.add(new String("zzm"));// 加入不了
        System.out.println("set=" + set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}