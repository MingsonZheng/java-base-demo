// List
package com.zzm.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        // List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复 [案例]
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("zzm");
        list.add("tom");
        System.out.println("list=" + list);

        // 2. List集合中的每个元素都有其对应的顺序案引，即支持索引
        //    索引是从0开始的
        System.out.println(list.get(3));
    }
}
