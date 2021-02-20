package JDBC_Utils;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:34
 * Description: No Description
 */
public class UtilsDemo03 {
    public static void main(String[] args) {
        //注册驱动
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null ;
        try {
            conn = version03.getConnection();
            String sql = "update account set balance = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, 8000);
            int count = psmt.executeUpdate();
            System.out.println("对" + count + "行数据进行了操作");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            version03.release(rs,psmt,conn);
        }
    }
}
