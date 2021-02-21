package SpringTemplate;

import Entity.User;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:06
 * Description: No Description
 */
public class testSpringTemplate {
    JdbcTemplate jt = new JdbcTemplate(DBUtils_Druid.getDataSource());
    @Test
    public void testQuery() {
        String sql = "Select * from Account";
        List<User> userList = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
        System.out.println(userList);
    }

    @Test
    public void testInsert() {
        String sql = "Insert into Account value(?,?)";
        Object[] objects = {9000,"songGG"};
        int flag = jt.update(sql, objects);
        if (flag>0){
            System.out.println("插入成功");
        }else{
            System.out.println("操作失败");
        }
    }

}
