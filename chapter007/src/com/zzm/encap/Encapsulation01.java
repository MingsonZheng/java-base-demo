// 封装
package com.zzm.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackhahaha");
        person.setAge(3000);
        person.setSalary(30000);
        System.out.println(person.info());

        // 使用构造器指定属性
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("====smith的信息======");
        System.out.println(smith.info());
    }
}

/*
不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄，必须在 1-120，年龄， 工资不能直接查看 ， name的长度在 2-6字符 之间
 */
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;

        // 可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验,相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要(2-6)个字符，默认名字");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置年龄不对，需要在 (1-120)，给默认年龄18");
            this.age = 18;// 给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " 薪水=" + salary;
    }
}