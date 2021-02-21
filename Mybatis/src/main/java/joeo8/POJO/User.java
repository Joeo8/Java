package joeo8.POJO;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 21:59
 * Description: No Description
 */
public class User {
    private int balance ;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String toString() {
        return "User{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public User() {
    }
}
