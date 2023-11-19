// 注解
package com.zzm.annotation_;

/**
 * @author Mingson
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("Father fly...");
    }
}

class Son extends Father {
    // 解读
    // 1. @Override 注解放在fly方法上，表示子类的fLy方法时重写了父类的fly
    // 2. 这里如果没有写 @override 还是重写了父类fLy
    // 3. 如果你写了@Override注解，编译器就会去检查该方法是否真的重写了父类的
    //    方法，如果的确重写了，则编译通过，如果没有构成重写，则编译错误
    // 4. 看看 @Override的定义
    //    解读:如果发现 @interface 表示一个 注解类
    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
    }
     */
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}