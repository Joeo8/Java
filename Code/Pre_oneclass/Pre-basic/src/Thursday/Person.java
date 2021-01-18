package Thursday;
//  To define a person classes,
//  set the membership method to say  hello
public class Person {
    String name ;//成员变量 -- 名字

    public void sayHello(String name){
        System.out.println(name +" 你 好，我 是 "+this.name);
        System.out.println(this);
    }
}
