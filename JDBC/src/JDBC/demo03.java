package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:11
 * Description: No Description
 */
public class demo03 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql:///newtest?serverTimezone=GMT", "root", "123456");
            String sql = "delete from account where name =?";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,"李四");
            psmt.executeUpdate();
            psmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
