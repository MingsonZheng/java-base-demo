package com.zzm.homework;

/**
 * @author Mingson
 * @version 1.0
 */
public class Homework07 {
}

/*
试写出Vector和ArrayList的比较?

ArrayList
底层结构：可变数组
版本：jdk1.2
线程安全(同步) 效率：不安全，效率高
扩容倍数：
如果使用有参构造器按照1.5倍扩容，如果是无参构造器
1.第一次扩容10
2.从第二次开始按照1.5倍

Vector
底层结构：可变数组Object[]
版本：jdk1.0
线程安全(同步) 效率：安全，效率不高
扩容倍数
如果是无参,默认10,满后按照2倍扩容
如果是指定大小创建Vector,则每次按照2倍扩容
 */