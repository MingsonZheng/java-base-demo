// JDBCUtilsDML
package com.zzm.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Mingson
 * @version 1.0
 * 该类演示如何使用JDBCUtils 工具类，完成dml 和 select
 */
public class JDBCUtils_Use {

    @Test
    public void testDML() {//insert, update, delete

        // 1. 得到连接
        Connection connection = null;
        // 2. 组织一个sql
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        // 3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            // 给占位符赋值
            preparedStatement.setString(1, "周星驰");
            preparedStatement.setInt(2, 2);
            // 执行
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
