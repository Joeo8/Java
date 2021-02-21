package DBUtils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:00
 * Description: No Description
 */
public class DBUtils_Druid {
    static DataSource ds = null;

    static {
        Properties prop = new Properties();
        ClassLoader loader = DBUtils_Druid.class.getClassLoader();
        try {
            prop.load(loader.getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

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
