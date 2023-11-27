// Properties
package com.zzm.map_;

import java.util.Properties;

/**
 * @author Mingson
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {
        // 解读
        // 1. Properties 继承 Hashtable
        // 2. 可以通过 k-v 存放数据，当然key 和 value 不能为 null
        Properties properties = new Properties();
        properties.put("john", 100);// ok
        // properties.put(null, 100);// 异常 NullPointerException
        // properties.put("john", null);// 异常 NullPointerException
        properties.put("lucy", 100);// ok
        properties.put("lic", 100);// ok
        properties.put("lic", 88);// 替换

        System.out.println("properties=" + properties);

        // 通过k 获取对应值
        System.out.println(properties.get("lic"));// 88

        // 删除
        properties.remove("lic");
        System.out.println("properties=" + properties);

        // 修改
        properties.put("john", "约翰");
        System.out.println("properties=" + properties);

        System.out.println(properties.getProperty("john"));
    }
}
