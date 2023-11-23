// Vector
package com.zzm.list_;

import java.util.Vector;

/**
 * @author Mingson
 * @version 1.0
 */
public class Vector_ {
    public static void main(String[] args) {
        // 如果是无参，默认10，满后，就按2倍扩容
        // 如果指定大小，则每次直接按2倍扩

        Vector vector = new Vector();
//        Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);
        /*
        解读源码
        1. new Vector() 底层
            public Vector() {
                this(10);
            }
           补充:如果是Vector vector = new Vector(8);
           走的方法:
            public Vector(int initialCapacity) {
                this(initialCapacity, 0);
            }
        2. vector.add(i)
         2.1 //下面这个方法就添加数据到vector集合
            public synchronized boolean add(E e) {
                modCount++;
                ensureCapacityHelper(elementCount + 1);
                elementData[elementCount++] = e;
                return true;
            }
         2.2 //确定是否需要扩容 条件 : minCapacity - elementData.length > 0
            private void ensureCapacityHelper(int minCapacity) {
                // overflow-conscious code
                if (minCapacity - elementData.length > 0)
                    grow(minCapacity);
            }
         2.3 //如果 需要的数组大小 不够用，就扩容 ，扩容的算法
             // int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
             //                                  capacityIncrement : oldCapacity);
             // 就是扩容两倍。
            private void grow(int minCapacity) {
                // overflow-conscious code
                int oldCapacity = elementData.length;
                int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                                 capacityIncrement : oldCapacity);
                if (newCapacity - minCapacity < 0)
                    newCapacity = minCapacity;
                if (newCapacity - MAX_ARRAY_SIZE > 0)
                    newCapacity = hugeCapacity(minCapacity);
                elementData = Arrays.copyOf(elementData, newCapacity);
            }
         */
    }
}
