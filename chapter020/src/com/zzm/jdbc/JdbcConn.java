// 数据库连接方式
package com.zzm.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Mingson
 * @version 1.0
 * 分析java连按mysql的5种方式
 */
public class JdbcConn {
    public static void main(String[] args) {

    }

    // 方式一
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();//创建driver对象
        String url = "jdbc:mysql://localhost:3306/db01";
        // 将 用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        // 说明 user 和 password 是规定好，后面的值根据实际情况写
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "zzm");// 密码
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    // 方式二
    @Test
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // 使用反射加载Driver类 ，动态加载，更加的灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/db01";
        // 将 用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        // 说明 user 和 password 是规定好，后面的值根据实际情况写
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "zzm");// 密码
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    // 方式3 使用DriverManager 替代 Diver 进行统一管理
    @Test
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // 使用反射加载Driver类 ，动态加载，更加的灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        // 创建url 和 user 和 password
        String url = "jdbc:mysql://localhost:3306/db01";
        String user = "root";
        String password = "zzm";

        DriverManager.registerDriver(driver);// 注册Driver驱动

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    // 方式4 使用class.forName 自动完成注册驱动，简化代码
    // 这种方式获取连接是使用的最多，推荐使用
    @Test
    public void connect04() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // 使用反射加载Driver类
        // 在加载 Driver类时，完成注册
        /* 源码：
        1. 静态代码块，在类加载时，会执行一次。
        2. DriverManager.registerDriver(new Driver());
        3. 因此注册driver的工作已经完成
            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
         */
        Class.forName("com.mysql.jdbc.Driver");

        // 创建url 和 user 和 password
        String url = "jdbc:mysql://localhost:3306/db01";
        String user = "root";
        String password = "zzm";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    // 提示
    // 1. mysql驱动5.1.6可以无需Class.forName(“com.mysql.jdbc.Driver”);
    // 2. 从jdk1.5以后使用了jdbc4,不再需要显示调用class.forName()注册驱动而是自动调用驱动
    // jar包下META-INF\services\java.sql.Driver文本中的类名称去注册
    /*
        com.mysql.jdbc.Driver
        com.mysql.fabric.jdbc.FabricMySQLDriver
     */
    // 3. 建议还是写上 Class.forName(“com.mysql.jdbc.Driver”),更加明确

    // 方式5，在方式4的基础上改进，增加配置文件，让连接mysql更加灵活
    @Test
    public void connect05() throws ClassNotFoundException, SQLException, IOException {

        // 通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        // 获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);// 建议写上

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
