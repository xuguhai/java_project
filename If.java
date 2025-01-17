import java.util.Scanner;
public class If{
	public static void main (String [] args ) {
		Scanner myInput = new Scanner(System.in);
		int age = myInput.nextInt();
		if (age >= 18) {
			System.out.println("已成年");
		} else {
			System.out.println("未成年");
		}
	}
}