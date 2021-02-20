package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:00
 * Description: No Description
 */
public class demo02 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///newtest?serverTimezone=UTC", "root", "123456");
            String sql = "insert into account (balance,name) values(?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, 8000);
            psmt.setString(2, "李四");
            psmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                psmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
