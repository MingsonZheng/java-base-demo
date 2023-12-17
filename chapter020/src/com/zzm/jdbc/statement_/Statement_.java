// Statement的SQL注入问题
package com.zzm.jdbc.statement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Mingson
 * @version 1.0
 * 演示statement 的注入问题
 */
@SuppressWarnings({"all"})
public class Statement_ {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // 让用户输入管理员名和密码
        System.out.println("请输入管理员的名字: ");// next():当接收到 空格或者'就是表示结束
        // 1' or
        String admin_name = scanner.nextLine();// 如果希望看到SQL注入，这里需要用nextLine
        System.out.println("请输入管理员的密码: ");
        // 万能密码：or '1'='1
        String admin_pwd = scanner.nextLine();

        // 通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        // 获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        // 1. 注册驱动
        Class.forName(driver);// 建议写上

        // 2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        // 3. 得到Statement
        Statement statement = connection.createStatement();
        /*
            CREATE TABLE admin (-- 管理员表
            NAME VARCHAR(32) NOT NULL UNIQUE,
            pwd VARCHAR(32) NOT NULL DEFAULT '') CHARACTER SET utf8;

            INSERT INTO admin VALUES ('tom', '123') ;
         */
        // 4. 组织sql
        // select name, pwd from admin where name =' 1' or ' and pwd= ' or '1'='1 '
        String sql = "select name, pwd from admin where name ='"
                + admin_name + "' and pwd= '" + admin_pwd + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {// 如果查询到一条记录，则说明该管理存在
            System.out.println("恭喜，登陆成功");
        } else {
            System.out.println("对不起，登陆失败");
        }

        // 关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
