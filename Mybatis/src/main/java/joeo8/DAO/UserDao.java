package joeo8.DAO;

import joeo8.POJO.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:01
 * Description: No Description
 */
public interface UserDao {
    public List<User> getUserList();
    public void addUser(User user);
    public void delUser(User user);
    public void updateUser(User user);
    public User getUser(User user);

}
