package Saturday;
/*
    倘若成员方法用Static修饰，那么就成为静态方法。
        静态方法不属对象，属于类
    如果没有Static关键字，那么必须先创建对象，然后通过对象使用他
    如果有了Static关键字，则不需要创建对象，直接通过类名称使用即可
    无论是成员变量还是成员方法，如果使用了Static修饰，都推荐使用类名称进行调用
    静态变量： 类名称.静态变量
    静态方法： 类名称.静态方法()
    注意事项：
        1.静态不能直接使用非静态
        【原因】因为内存中是先有静态内容，后有非静态内容
        (先人不知到后人，但后人晓得先人)
        2.静态方法中不能用this
        【原因】this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        Class class01 = new Class(); //创建一个对象
        class01.method();//然后才能使用没有static修饰的内容
        //对于j静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        class01.methodStatic();//正确，但不推荐。这种写法在编译之后也会被javac翻译成"类名称.静态方法名"
        Class.methodStatic();//正确，推荐

        //对于本类中的静态方法，可以省略l类名称
        myClass();
        Demo02StaticMethod.myClass();//完全等效

    }
    public static  void myClass(){
        System.out.println("自己的方法");
    }
}
