package Thursday;
//      Used to detect the difference
//       between member variables and local variables
public class DemoVariableDifference {
    String name ; //member variables

    public void method(){
        int num; //local variables
        num = 100;
        System.out.println(num); //An error is reported if no value is assigned
        System.out.println(name);//Member variables are applied throughout the class
    }
}
