package Joeo8;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:11
 * Description: No Description
 */
public class Recursion {
    public static void main(String[] args) {
        no(5);
    }
    public static void no(int n) {
        if (n >= 2) {
            no(n-1);
        }
        System.out.println(n);
    }
}
