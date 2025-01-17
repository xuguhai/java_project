import java.util.Scanner;
public class OB{
	public static void main (String[] args){
        Scanner Myinput = new Scanner(System.in);
        People [] text = new People[3];
        text[0] = new People();
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