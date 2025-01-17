import java.util.Scanner;
public class YangHuiSanJiao{
	public static void main (String[] args){
        Scanner Myinput = new Scanner(System.in);
        int arr[][];
        int n = Myinput.nextInt();//输入想得到的层数
        arr = new int[n][];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = new int[i + 1];//开辟第i+1的个数，符合杨辉三角的格式
            arr[i][0] = 1;//将首尾先定义为1
            arr[i][i + 1 - 1] = 1;
            for (int j = 1 ;j < i + 1 - 1 ;j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];//用上一级的数来得出中间的数 
            } 
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ;j < i + 1 ;j++) {
             System.out.print(arr[i][j] + " ");
            } 
            System.out.print("\n");
        }
	}
}

//答案
// import java.util.Scanner;

// public class YangHuiSanJiao {
//     public static void main(String[] args) {
//         Scanner Myinput = new Scanner(System.in);
//         int n = Myinput.nextInt();
//         int[][] arr = new int[n][];

//         for (int i = 0; i < n; i++) {
//             arr[i] = new int[i + 1];
//             arr[i][0] = 1; // 第一个元素为1
//             arr[i][i] = 1; // 最后一个元素为1
//             for (int j = 1; j < i; j++) {
//                 arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }