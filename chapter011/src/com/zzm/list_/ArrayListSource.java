// ArrayList
package com.zzm.list_;

import java.util.ArrayList;

/**
 * @author Mingson
 * @version 1.0
 */
public class ArrayListSource {
    public static void main(String[] args) {
        /*
        ArrayList的底层操作机制源码分析
        1) ArrayList中维护了一个Object类型的数组elementData.[debug 看源码]
           transient Object[] elementData; //transient 表示瞬间,短暂的,表示该属性不会被序列化
        2) 当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，
           第1次添加，则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍。
        3) 如果使用的是指定大小的构造器，则初始elementData容量为指定大小，
           如果需要扩容则直接扩容elementData为1.5倍。
         */

        // 注意，注意，注意，Idea 默认情况下，Debug 显示的数据是简化后的，如果希望看到完整的数据
        // 需要做设置 Settings -> Build, Execution, Deployment -> Debugger -> Data Views -> Java ->
        // Hide null elements in arrays and collections 和 Enable alternative view for Collections classes 取消勾选
        ArrayList list = new ArrayList();
//        ArrayList list = new ArrayList(8);
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
