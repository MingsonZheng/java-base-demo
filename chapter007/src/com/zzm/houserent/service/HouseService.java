package com.zzm.houserent.service;

import com.zzm.houserent.domain.House;

/**
 * HouseService.java<=>类[业务层]
 * //定义House[] ，保存House对象
 * 1. 响应HouseView的调用
 * 2. 完成对房屋信息的各种操作(增删改查c[create]r[read]u[update]d[delete])
 */
public class HouseService {
    private House[] houses;
    private int houseNums = 1;// 记录当前有多少个房屋信息
    private int idCounter = 1;// 记录当前的id增长到哪个值

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }

        return null;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;// 把当前存在的房屋信息的最后一个 设置null

        return true;
    }

    public boolean add(House newHouse) {
        // 判断是否还可以继续添加(我们暂时不考虑数组扩容的问题)
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }

        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;
    }
}
