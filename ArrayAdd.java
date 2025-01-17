import java.util.Scanner;
public class ArrayAdd{
	public static  void main(String [] args) {
		Scanner Myinput = new Scanner(System.in);
		int [] arr = {1,2,3};
		char falt;
		// System.out.println("目前的数组状况是：");
		// for (int i = 0 ;i < arr.length;i++){
		// 		System.out.print(arr[i] + "\t");
		// }
		// System.out.println("是否要进行填充数组：y / n");
		// falt = Myinput.next().charAt(0);
		//下列实现数组扩容的方法
		do{
			System.out.println("目前的数组状况是："); //反馈但是数组的情况
			for (int i = 0 ;i < arr.length;i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println("是否要进行填充数组：y / n"); //读取用户的需求
			falt = Myinput.next().charAt(0);
			int[] arrNew = new int[arr.length + 1]; //进行数组扩容，通过创建一个新的数组，长度比之前要加1就行
			for (int i = 0 ; i < arr.length;i++){ //将之前的数组的内容进行读取
				arrNew[i] = arr[i];
			}
			if (falt == 'y' || falt == 'Y'){
				System.out.println("请输入要添加的数");//读取新要添加的数据
				arrNew[arrNew.length - 1] = Myinput.nextInt();
				arr = arrNew;//是原来的数组指向的内存，改变指向新的数组
			}
		}while(falt == 'y'|| falt == 'Y');
	} 

	//问题1 ：之前arry指向的内存地址被改变后，原来地址上的数据还在吗？是否会影响空间复杂度

	//在Java中，当你创建一个新的数组并将其赋值给一个引用变量时，该变量将指向新数组的内存地址。原来的数组仍然存在于内存中，直到垃圾回收器将其回收，因为没有任何引用指向它了。
    //在你的代码中，arr = arrNew; 这行代码将 arr 引用指向了 arrNew 数组的新内存地址。原来的数组（在 arrNew 被创建之前）仍然在内存中，直到垃圾回收器将其回收。
    //这意味着原来的数组不会被立即删除，因此会占用一定的内存空间，直到垃圾回收器运行。
	
}