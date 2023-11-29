// 泛型
package com.zzm.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 */
public class GenericDetail {
    public static void main(String[] args) {
        // 给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<>();// ok
        // ArrayList<int> list2 = new ArrayList<int>();// 错误

        // 2. 说明
        // 因为 E 指定了 A 类型，构造器传入了 new A()
        // 在给泛型指定具体类型后，可以传入该类型或者其了爽类型
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();

        // 3. 泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        // 在实际开发中，我们往往简写
        // 编译器会进行类型推断，推荐使用下面写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        ArrayList<Pig> pigs = new ArrayList<>();

        // 4. 如果是这样写 泛型默认是 Object
        ArrayList arrayList = new ArrayList();// 等价 ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("xx");
        /*
            public boolean add(Object e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */

        Tiger tiger = new Tiger();
        /*
            class Tiger {
                Object e;

                public Tiger() {}

                public Tiger(Object e) {
                    this.e = e;
                }
            }
         */
    }
}

class Tiger<E> {
    E e;

    public Tiger() {}

    public Tiger(E e) {
        this.e = e;
    }
}

class A {}
class B extends A {}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());// 运行类型
    }
}