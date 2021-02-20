package JDBC_Pool;

import Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 0:02
 * Description: No Description
 */
public class Test_DBCP {
    public static void main(String[] args) {
        testUserInsert();
    }

    public static void testUserInsert() {
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setBalance(7000);
            user.setName("王五" + i);
            if (registUser(user)) {
                System.out.println(user.getName() + "-注册成功");
            } else {
                System.out.println(user.getName() + "-注册失败");
            }
        }
    }

    public static boolean registUser(User regiserUser) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            conn = DBCP.getConnection();
            String sql = "INSERT INTO account  VALUE(?, ?)";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, regiserUser.getBalance());
            psmt.setString(2, regiserUser.getName());
            int insertUpdate = psmt.executeUpdate();
            if (insertUpdate > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCP.Release(null, psmt, conn);
        }
        return false;
    }
}