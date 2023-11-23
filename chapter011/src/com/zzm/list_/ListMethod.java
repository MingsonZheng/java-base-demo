// List方法
package com.zzm.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        // void add(int index，Object eLe):在index位置插入eLe元素
        list.add(1, "zzm");
        System.out.println("list=" + list);

        // boolean addAll(int index，Collection else):从index位置开始将else中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);

        // Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));

        // int index0f(object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));

        // int LastIndex0f(object obj):返回obj在当前集合中末次出现的位置
        list.add("zzm");
        System.out.println(list.lastIndexOf("zzm"));

        // object remove(int index):移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list=" + list);

        // object set(int index，object ele):设置指定index位置的元素为ele ，相当于是誉换，
        list.set(1, "玛丽");
        System.out.println("list=" + list);

        // List subList(int fromIndex，int toIndex):返回从fromIndex到toIndex位置的子集合
        // 注意返回的子集合 fromIndex <= subList < toIndex
        List returnlist = list.subList(0, 2);
        System.out.println("returnlist=" + returnlist);
    }
}
