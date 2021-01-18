package Thursday.APIUse;
//这是一个测试类，用来演示对象数组
//数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变
public class Demo08Array {
    public static void main(String[] args) {
        //首先创建一个长度为三的数组，里面用来存放Woman类型的对象
        Woman [] w = new Woman[3];

        Woman one = new Woman("迪丽热巴",18);
        Woman two = new Woman("古力娜扎",28);
        Woman three = new Woman("马儿扎哈", 38);
        //将one当中的地址值赋值给数组的0号元素位置
        w[0] = one;
        w[1] = two;
        w[2] = three;

    /*    System.out.println(w[0]);
        System.out.println(w[1]);
        System.out.println(w[2]);*/

        System.out.println(w[1].getName());
    }
}
