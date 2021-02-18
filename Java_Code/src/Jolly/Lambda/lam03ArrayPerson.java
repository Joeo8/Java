package Jolly.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:32
 * Description: No Description
 */
public class lam03ArrayPerson {
    public static void main(String[] args) {
        Person[] per = {
                new Person(34, "柳岩"),
                new Person(29, "杨幂"),
                new Person(25, "迪丽热巴"),
        };
        /*Arrays.sort(per, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        //使用Lambda优化代码
        Arrays.sort(per, (o1, o2) -> o1.getAge() - o2.getAge());

        Iterator iterator = Arrays.asList(per).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
