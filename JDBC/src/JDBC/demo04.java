package JDBC;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:14
 * Description: No Description
 */
public class demo04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql:///newtest?serverTimezone=UTC", "root", "123456");
            String sql = "select * from account";
            PreparedStatement psmt = conn.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();
            while(resultSet.next()){
                int balance = resultSet.getInt(1);
                String name = resultSet.getString(2);
                System.out.println(name+"==>"+balance);
            }
            resultSet.close();
            psmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
