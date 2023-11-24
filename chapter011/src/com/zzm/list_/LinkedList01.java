// LinkedList
package com.zzm.list_;

/**
 * @author Mingson
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zzm = new Node("zzm");

        // 连接三个结点，形成双向链表
        // jack -> tom -> zzm
        jack.next = tom;
        tom.next = zzm;
        // zzm -> tom -> jack
        zzm.pre = tom;
        tom.pre = jack;

        Node first = jack;// 让first引用指向jack，就是双向链表的头结点
        Node last = zzm;// 让last引用指向zzm,就是双向链表的尾结点

        // 演示，从头到尾进行遍历
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            // 输出 first 信息
            System.out.println(first);
            first = first.next;
        }

        // 演示，从尾到头进行遍历
        System.out.println("===从尾到头进行遍历===");
        while (true) {
            if (last == null) {
                break;
            }
            // 输出 first 信息
            System.out.println(last);
            last = last.pre;
        }

        // 演示链表的添加对象/数据，是多么的方便
        // 要求，是在 tom --------- 直接，插入一个对象smith
        // 1. 先创建一个 Node 结点，name 就是 smith
        Node smith = new Node("smith");
        // 下面就把 smith 加入到双向链表了
        smith.next = zzm;
        smith.pre = tom;
        zzm.pre = smith;
        tom.next = smith;

        // 让first 再次指向jack
        first = jack;// 让first引用指向jack,就是双向链表的头结点
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            // 输出 first 信息
            System.out.println(first);
            first = first.next;
        }

        last = zzm;// 让Last 重新指向最后一个结点

        System.out.println("===从尾到头进行遍历===");
        while (true) {
            if (last == null) {
                break;
            }
            // 输出 first 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

// 定义一个Node 类，Node 对象 表示双向链表的一个结点
class Node {
    public Object item;// 真正存放数据
    public Node next;// 指向后一个结点
    public Node pre;// 指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name=" + item;
    }
}