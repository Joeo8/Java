package DBUtils;

import Entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:38
 * Description: No Description
 */
public class TestDBUtils {
    //QueryRunner 是DBUtils中封装好的方法,直接处理结果集
    //QueryRunner 获取的是数据源 DataSource ,会自动管理Connection的释放
    QueryRunner qr = new QueryRunner(DBUtils_Druid.getDataSource());

    @Test
    public void testQueryObject() {
        String sql = "SELECT * FROM ACCOUNT WHERE name = '张三'";
        try {
            Map<String, Object> map = qr.query(sql, new MapHandler());
            // QueryRunner 处理结果集
            System.out.println(map);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void testQueryList() {
        String sql = "SELECT * FROM ACCOUNT";
        try {
            List<Map<String, Object>> mapList = qr.query(sql, new MapListHandler());
            System.out.println(mapList);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void testQueryBean() {
        String sql = "SELECT * FROM ACCOUNT WHERE name = '张三'";
        User user = null;
        try {
            user = qr.query(sql, new BeanHandler<User>(User.class));
            System.out.println(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void testQueryBeans() {
        String sql = "SELECT * FROM ACCOUNT";
        User user = null;
        try {
            List<User> users = qr.query(sql, new BeanListHandler<User>(User.class));
            System.out.println(users);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //查询结果数量Count（*）
    @Test
    public void testQueryNumber() {
        String sql = "Select Count(*) from Account";
        Number number = null;
        try {
            number = qr.query(sql, new ScalarHandler<Number>());
            System.out.println(number);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void testInsert() {
        String sql = "Insert into account values(?,?)";
        //参数有两种写法:1.序列化参数,2.采用数组存储参数
        Object[] params = {10000, "Joeo8"};
        int flag = 0;
        try {
            flag = qr.update(sql, params);
            if (flag > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("操作失败");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
