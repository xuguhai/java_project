import java.util.Scanner;
public class PaiXu{
	public static void main (String [] args ) {
		Scanner myInput = new Scanner(System.in);
		int[] arr = {1,23,5,436,456,8,3,4123,4,47645,7,65,8};
		//冒泡排序
		for (int i = 0 ; i < arr.length / 2 ; i++ ) {
			for (int j = 0 ; j < arr.length - 1 - i;j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1 ];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i = 0 ;i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}
}