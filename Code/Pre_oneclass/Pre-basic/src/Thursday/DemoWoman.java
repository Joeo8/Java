package Thursday;
//Define the test class, using Woman classes
public class DemoWoman {
    public static void main(String[] args) {
        Woman w = new Woman();
        System.out.println("================");
        Woman ww = new Woman("迪丽热巴",22);
        System.out.println(ww.getAge()+ "岁的"+ww.getName()+"为您服务！");
        ww.setName("杨幂");
        ww.setAge(23);
         System.out.println(ww.getAge()+ "岁的"+ww.getName()+"一同为您服务！");
    }
}

