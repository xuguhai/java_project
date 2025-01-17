public class ArrayAssign{
	public static void main (String [] args) {
		int n1 = 20;
		int n2 = n1;
		n2 = 40;
		System.out.println(n1);
		//n1还是20 ，说明n2只是将n1所赋予的常量给n2，相当于传参
		System.out.println(n2);

		int [] array1 = {1,2,3,4,5,6,7,8};
		int [] array2 = array1;
		for (int i = 0; i < array2.length ; i++) {
			System.out.println("array2 " + array2[i]);
		}

		for (int i = 0; i < array1.length ; i++) {
			System.out.println("array1 " + array1[i]);
		}
		array2[2] = 200;
		for (int i = 0; i < array2.length ; i++) {
			System.out.println("array2 " + array2[i]);
		}
		for (int i = 0; i < array1.length ; i++) {
			System.out.println("array1 " + array1[i]);
		}
		//这里array1 也随着array2 的改变而改变了，说明array2 = array1 相当于传址 
		//分配后就是array1 array2 在栈区指向了 堆区的一块地址

		//那如何进行拷贝一份已知数组呢？,先用new 进行一个数组空间的开辟，用for去遍历逐一赋值
		int [] arr2 = new int[array1.length];
		for (int i = 0 ; i < arr2.length; i++) {
			arr2[i] = array1[i];
		}
		arr2[3] = 300;
		System.out.println("\n\n");
		for (int i = 0; i < array1.length ; i++) {
			System.out.println("array1 " + array1[i]);
		}

		System.out.println("\n\n");
		for (int i = 0; i < arr2.length ; i++) {
			System.out.println("arr2 " + arr2[i]);
		}
		System.out.println("\n\n");
		//实现数组逆序
        //方法1
		int temp;
		for (int i = 0; i < arr2.length / 2 ; i++) {
			temp = arr2[i];
			arr2[i] = arr2[arr2.length - i - 1 ];
			arr2[arr2.length - i - 1] = temp;
		}
		for (int i = 0; i < arr2.length ; i++) {
			System.out.println("arr2 反转后" + arr2[i]);
		}

		System.out.println("\n\n");
		//方法2 
		int[] arr3 = new int[arr2.length];
		for (int i = 0; i < arr2.length;i++) {
			arr3[i]=arr2[arr2.length - i - 1 ];
		}
		for (int i = 0; i < arr3.length ; i++) {
			System.out.println("arr2 再反转后" + arr3[i]);
		}




	}
}