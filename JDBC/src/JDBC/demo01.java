package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:34
 * Description: No Description
 */
public class demo01 {
    public static void main(String[] args) {
        //注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///newtest?serverTimezone=GMT", "root", "123456");
            String sql = "update account set balance = ?";
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setInt(1,8000);
            int count = psmt.executeUpdate();
            System.out.println("对"+count+"行数据进行了操作");
            psmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
