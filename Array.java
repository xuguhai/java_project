import java.util.Scanner;
public class Array{
	public static void main (String[] args){
        Scanner Myinput = new Scanner(System.in);
		// int sum = 0;
		// int[] array = new int[10];
		// for (int i = 0 ;i < 10; i++) {
        //       array[i] = Myinput.nextInt();
        //       sum = sum + array[i];
		// }
		// System.out.println(sum);
		// //初始化一个数组
		// int [] a = {1,2,2,3,4,5,6};
		// //可以通过 a.length 来获取数组的长度
		// System.out.println(a.length);
		int len;
		len = Myinput.nextInt();
		int [] array = new int[len];
		System.out.println(array.length);
	}
}