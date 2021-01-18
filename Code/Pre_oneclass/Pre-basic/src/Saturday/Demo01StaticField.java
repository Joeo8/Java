package Saturday;

/*
    如果一个成员变量用了ststic关键字，那么这个变量不再属于对象自己，而是属于类。
    多个对象共享同一个数据
*/
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("程晓旭", 20);
        one.Classroom = "101教室";
        System.out.println("姓名： " + one.getName() +
                " ，年龄： " + one.getAge() +
                " ,在" + one.Classroom + "上课"
                + "，学号为：" + one.getId());

        Student two = new Student("赵雯雅", 21);
        System.out.println("姓名： " + two.getName() +
                " ，年龄： " + two.getAge() +
                " ,在" + two.Classroom + "上课"
                + "，学号为：" + two.getId());
    }
}
