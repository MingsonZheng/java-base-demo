// 枚举
package com.zzm.enum_;

/**
 * @author Mingson
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SUMMER);
    }
}

enum Season2 {
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
    // 如果使用了enum 来实现枚举类
    // 1. 使用关键字 enum 代 cLass
    // 2. public static final Season SPRING = new Season("春天"，"温暖") 直接使用
    //    SPRING("春天", "温暖") 解读 常最名(实参列表)
    // 3. 如果有多个常量(对象)， 使用，号间隔即可
    // 4，如果使用enum 来实现枚举，要求将定义常量对象，写在前面
    // 5. 如果我们使用的是无参构造器，创建常量对象，则可以省略 ()
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"), What;
    private String name;
    private String desc;

    private Season2() {// 无参构造器

    }

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

// javap Season2
/*
Compiled from "Enumeration03.java"
final class com.zzm.enum_.Season2 extends java.lang.Enum<com.zzm.enum_.Season2> {
  public static final com.zzm.enum_.Season2 SPRING;
  public static final com.zzm.enum_.Season2 WINTER;
  public static final com.zzm.enum_.Season2 SUMMER;
  public static final com.zzm.enum_.Season2 AUTUMN;
  public static com.zzm.enum_.Season2[] values();
  public static com.zzm.enum_.Season2 valueOf(java.lang.String);
  public java.lang.String getName();
  public java.lang.String getDesc();
  public java.lang.String toString();
  static {};
}
 */