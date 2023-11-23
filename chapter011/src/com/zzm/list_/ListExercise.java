// List练习
package com.zzm.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        /*
        添加10个以上的元素(比如String “hello” )，在2号位插入一个元素"zzm”
        获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集合，
        要求:使用List的实现类ArrayList完成。
         */
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);

        list.add(1, "zzm");
        System.out.println("list=" + list);

        System.out.println("第5个元素=" + list.get(4));

        list.remove(5);
        System.out.println("list=" + list);

        list.set(6, "三国演义");
        System.out.println("list=" + list);

        // 在使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}
