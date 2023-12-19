// DBUtils+Druid
package com.zzm.jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 */
public class DBUtils_USE {

    // 使用apache-DBUtils 工具类 + druid 完成对表的crud操作

    @Test
    public void testQueryMany() throws SQLException {// 返回结果是多行的情况

        // 1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2，使用 DBUtils 类和接口 ，先引入DBUtils 相关的jar(commons-dbutils) ，加入到本Project
        // 3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        // 4. 就可以执行相关的方法，返回ArrayList 结果集
        // String sql = "select * from actor where id >= ?";
        // 注意: sql 语句也可以查询部分列
        String sql = "select id, name from actor where id >=?";
        // 解读
        // (1) query 方法就是执行sql 语句，得到ResultSet ---封装到 --> ArrayList 集合中
        // (2) 返回集合
        // (3) connection:连接
        // (4) sql : 执行的sql语句
        // (5) new BeanListHandler<>(Actor.class): 在将ResultSet -> Actor 对象 -> 封装到 ArrayList
        //     底层使用反射机制 去获取Actor 类的属性，然后进行封装
        // (6) 1 就是给 sql 语句中的? 赋值，可以有多个值，因为是可变参数Object..。 params
        // (7) 底层得到的ResultSet ，会在query 关闭，关闭PreparedStatement
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合的信息");
        for (Actor actor : list) {
            System.out.println(actor);
        }

        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }
}
