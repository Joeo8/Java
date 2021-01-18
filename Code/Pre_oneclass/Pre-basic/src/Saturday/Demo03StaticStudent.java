package Saturday;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.Classroom = "101教室";
        Student one = new Student("王明", 20);
        System.out.println("one的名字 ： " + one.getName());
        System.out.println("one的年龄 ： " + one.getAge());
        System.out.println("one的班级 ： " + Student.Classroom);
        System.out.println("one的学号 ： " + one.getId());
        System.out.println("===============================");
        Student two = new Student("雷轰", 21);
        System.out.println("two的名字 ： " + two.getName());
        System.out.println("two的年龄 ： " + two.getAge());
        System.out.println("two的班级 ： " + Student.Classroom);
        System.out.println("two的学号 ： " + two.getId());

    }

}
