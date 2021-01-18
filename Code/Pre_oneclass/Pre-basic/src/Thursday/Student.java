package Thursday;
//      Familiar with private usage and corresponding methods
public class Student {
    private String name ;
    private int  age ;
    private boolean male;

    public void setMale(boolean b ){
        male = b;
    }
    public boolean isMale(){
        return male;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
