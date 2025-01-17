import java.util.Scanner;//把java.util的Scanner类导入
public class Input{
	public static void main (String[] args) {
		Scanner myInput = new Scanner(System.in);
		int age;
		age = myInput.nextInt();
		System.out.println(age);
		int b = myInput.nextInt();
	    System.out.println(b);
	    // char m = myInput.nextChar();错的
	    // System.out.println(m);
        double f = myInput.nextDouble();
        System.out.println(f);
	    String arry = myInput.next();
	    System.out.println(arry);
	}
}