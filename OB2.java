import java.util.Scanner;
public class OB2{
	public static void main (String[] args){
        Scanner Myinput = new Scanner(System.in);
        People a = new People();
        a.age =18;
        a.test(a);
        System.out.println(a.age);
	}
}
class People{
    String name;
    int age;
    int high;
    char sex;
    public void test(People p) {
        p = null;//这样 主函数的输出依旧是 10 因为这里只是传来了一个地址而已，这里p指向的是那个地址而已，但是p = null 使得其指向的地址发生改变但是主函数的a 指向的地址是没有收到影响的
        p = new People();
        p.age = 80; //依旧是10 ，因为这里的p指向了新的一个地址，影响不到原来的地址上的age
    }
}