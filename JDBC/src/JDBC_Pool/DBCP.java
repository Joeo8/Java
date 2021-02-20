package JDBC_Pool;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 0:22
 * Description: No Description
 */
public class DBCP {
    static DataSource ds = null;

    static {
        Properties prop = new Properties();
        try {
            ClassLoader loader = DBCP.class.getClassLoader();
            prop.load(loader.getResourceAsStream("dbcp.properties"));
            ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  /*  public static DataSource getDateSource() {
        return ds;
    }
*/
    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void Release(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();   //此时的close不是关闭,而是归还连接
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
