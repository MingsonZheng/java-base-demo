// LinkedHashSet练习
package com.zzm.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author Mingson
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));
        linkedHashSet.add(new Car("奥迪", 300000));
        linkedHashSet.add(new Car("法拉利", 10000000));
        linkedHashSet.add(new Car("奥迪", 3000000));
        linkedHashSet.add(new Car("保时捷", 70000000));
        linkedHashSet.add(new Car("奥迪", 3000000));

        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}

/*
Car 类(历性:name,price)，如 name 和 price 一样,
则认为是相同元素，就不能添加。
 */
class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 重写equals 方法 和 hashCode
    // 当 name 和 price 相同时， 就返回相同的 hashCode 值，equals返回t

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}