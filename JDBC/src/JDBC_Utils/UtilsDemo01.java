package JDBC_Utils;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:34
 * Description: No Description
 */
public class UtilsDemo01 {
    public static void main(String[] args) {
        //注册驱动
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null ;
        try {
            conn = version01.getConnection("newtest", "root", "123456");
            String sql = "update account set balance = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, 4000);
            int count = psmt.executeUpdate();
            System.out.println("对" + count + "行数据进行了操作");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            version01.release(rs,psmt,conn);
        }
    }
}
