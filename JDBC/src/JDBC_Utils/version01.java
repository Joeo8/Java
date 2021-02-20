package JDBC_Utils;
//手动封装数据库链接操作工具类

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:11
 * Description: No Description
 */
public class version01 {
    //获取连接
    public static Connection getConnection(String dbName, String username, String password) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql:///" + dbName + "?serverTimezone=GMT", username, password);
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
