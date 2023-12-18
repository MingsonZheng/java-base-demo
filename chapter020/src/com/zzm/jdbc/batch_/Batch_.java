// 批处理应用
package com.zzm.jdbc.batch_;

import com.zzm.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author Mingson
 * @version 1.0
 * 演示java的批处理
 * JDBC连接MySQL时，如果要使用批处理功能，请再url中加参
 * ?rewriteBatchedStatements=true
 */
public class Batch_ {

    /*
        CREATE TABLE admin2 (-- 管理员表
        id INT PRIMARY KEY AUTO_INCREMENT,
        username VARCHAR(32) NOT NULL,
        PASSWORD VARCHAR(32) NOT NULL);

        SELECT COUNT(*) FROM admin2;
     */

    // 传统方法，添加5000条数据到admin2
    @Test
    public void noBatch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();// 开始时间
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();// 结束时间
        System.out.println("传统的方式 耗时=" + (end - start));
        // 关闭连接
        JDBCUtils.close(null, preparedStatement, connection);
    }

    // 使用批量方式添加数据
    // JDBC连接MySQL时，如果要使用批处理功能，请再url中加参
    // ?rewriteBatchedStatements=true
    @Test
    public void batch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();// 开始时间
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            // 将sql 语句加入到批处理包中 -> 看源码
            preparedStatement.addBatch();
            // 当有1000条记录时，在批量执行
            if ((i + 1) % 1000 == 0) {// 满1000条sql
                preparedStatement.executeBatch();
                // 清空一把
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();// 结束时间
        System.out.println("批量方式 耗时=" + (end - start));
        // 关闭连接
        JDBCUtils.close(null, preparedStatement, connection);

    }
}
