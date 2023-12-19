// Druid德鲁伊连接池
package com.zzm.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Mingson
 * @version 1.0
 * 测试druid的使用
 */
public class Druid_ {
    // 前置工作: 在项目下创建一个文件夹比如 libs
    // 将 druid.jar 拷贝到该目录下，点击 add to project ..加入到项目中

    @Test
    public void testDruid() throws Exception {
        // 1. 加入 Druid jar包
        // 2. 加入配置文件 druid.properties ，将该文件拷贝项目的src目录
        // 3. 创建Properties对象，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        // 4. 创建一个指定参数的数据库连接池，Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        // 测试连接池的效率，测试对mysql 5000次操作
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = dataSource.getConnection();
            // System.out.println("连接成功！");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("druid连接池 操作5000 耗时=" + (end - start));
    }
}
