// 匿名内部类
package com.zzm.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        // 基于接口的匿名内部类
        // 解读
        // 1. 需求: 想使用IA接口,并创建对象
        // 2. 传统方式，是写一个类，实现该接口，并创建对象
        // 3. 需求是 Tiger 类只是使用一次，后面再不使用
//        IA tiger = new Tiger();
//        tiger.cry();
        // 4. 可以使用匿名内部类来简化开发
        // 5，tiger的编译类型 ? IA
        // 6. tiger的运行类型 ? 就是匿名内部类 XXXX => Outer04$1
        // 7，jdk底层在创建匿名内部类 outer04$1,立即马上就创建了 outer04$1实例，并且把地址
        //    返回给 tiger
        // 8. 匿名内部类使用一次，就不能再使用
        /*
            我们看底层 会分配 类名 Outer04$1
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();

        // 演示基于类的匿名内部类
        // 分析
        // 1. father编译类型 Father
        // 2. father运行类型Outer04$2
        // 3. 底层会创建匿名内部类
        /*
            class Outer04$2 implements Father {
            }
         */
        // 4. 同时也直接返回了 匿名内部类 Outer04$2的对象
        // 5. 注意("jack") 参数列表会传递给 构造器
        Father father = new Father("jack"){

        };
        System.out.println("father对象的运行类型=" + father.getClass());

        Father father2 = new Father("jack");
        System.out.println("father2对象的运行类型=" + father2.getClass());

        /*
            class Outer04$3 implements Father {
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        Father father3 = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father3对象的运行类型=" + father3.getClass());
        father3.test();

        // 基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}

class Father {
    public Father (String name) {// 构造器
        System.out.println("接收到name=" + name);
    }

    public void test() {// 方法

    }
}

abstract class Animal {// 抽象类
    abstract void eat();
}