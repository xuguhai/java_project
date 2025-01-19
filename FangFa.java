import java.util.Scanner;
public class FangFa{
	public static void main (String[] args) {
		HanShu hanshu = new HanShu();
		People [] text = new People[3];
		for (int i = 0; i < text.length;i++) {
			text[i] = new People();
			hanshu.shuru(text,i);
		}
		for (int i = 0 ; i < text.length;i++){
			hanshu.shuchu(text,i);
		}

	}
}

class People{
    String name;
    int age;
    int high;
    char sex;
}

class HanShu{
	Scanner Myinput = new Scanner(System.in);
	public void shuru(People p [] , int i) {
		System.out.println("请输入第" + (i + 1) +"个人的名字，年龄，身高，性别");
        p[i].name = Myinput.next();
        p[i].age = Myinput.nextInt();
        p[i].high = Myinput.nextInt();
        p[i].sex = Myinput.next().charAt(0);
	}
	public void shuchu(People p[],int i){
		System.out.println("第" + (i + 1) +"个人的名字，年龄，身高，性别");
		System.out.println(p[i].name + " " + p[i].age + " " + p[i].high + " " + p[i].sex);
	}

}