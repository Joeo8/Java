package JDBC_Utils;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:32
 * Description: No Description
 */
public class version02 {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        Properties prop = new Properties();
        ClassLoader classLoader = version02.class.getClassLoader();
        try {
            prop.load(classLoader.getResourceAsStream("JDBC.properties"));
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    //关闭连接
    public static void release(ResultSet rs, Statement st, Connection conn) {
        if (rs != null)
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        if (st != null)
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        if (conn != null)
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
    }
}
