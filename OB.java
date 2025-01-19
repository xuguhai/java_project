import java.util.Scanner;
public class OB{
	public static void main (String[] args){
        Scanner Myinput = new Scanner(System.in);
        People [] text = new People[3];//这里只是申请了一个数组而已,数组的每个元素都是 null，并没有实际的 People 对象被创建,但是这里申请的数组类型一定是People
        //因为数组的类型在编译时是固定的，不能混用基本数据类型和引用类型（重点）。为了存储 People 对象，必须使用 People 类型的数组
        text[0] = new People();//这里才是开辟了一个People的对象，new People() 实际上为 People 类的一个实例分配了内存，即创建了一个新的 People 对象，并将其引用赋值给 text[0]。
        text[0].name = "小明";
        text[0].age = 18;
        text[0].high = 180;
        text[0].sex = '男';
        System.out.println(text[0].name +" " + text[0].age +" " + text[0].high +" " + text[0].sex);

	}
}
class People{
    String name;
    int age;
    int high;
    char sex;
}