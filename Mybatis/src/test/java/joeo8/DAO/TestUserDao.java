package joeo8.DAO;

import com.mysql.cj.Session;
import joeo8.POJO.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:20
 * Description: No Description
 */
public class TestUserDao {

    private SqlSession sqlSession;
    private UserDao userDao;

    @Before
    public void setup() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
            userDao = sqlSession.getMapper(UserDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll() {
        List<User> userList = userDao.getUserList();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }

    @Test
    public void testInsert() {
        User user = new User(5000, "赵丽");
        userDao.addUser(user);
    }

    @Test
    public void testSelectOne() {
        User user = new User("赵丽");
        User targetUser = userDao.getUser(user);
        System.out.println(targetUser);
    }

     @Test
    public void testUpdate() {
        User user = new User(7000,"赵丽");
        userDao.updateUser(user);
    }

    @After
    public void tearDown() {
        sqlSession.commit();
        sqlSession.close();
    }
}
