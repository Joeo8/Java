package Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 0:06
 * Description: No Description
 */
public class User {
    private int balance;
    private String name;

    @Override
    public String toString() {
        return "user{" +
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
