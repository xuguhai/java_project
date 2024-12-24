public class JingDuZhuan{
	public static void main (String [ ] args) {
		//细节 1： 有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10; //ok
		//float d1 = n1 + 1.1;//错误 n1 + 1.1 => 结果类型是 double
		//double d1 = n1 + 1.1;//对 n1 + 1.1 => 结果类型是 double
		float d1 = n1 + 1.1F;//对 n1 + 1.1 => 结果类型是 float

		//细节 2: 当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，
		// long large = 20l;
		// int  small ;
		// small = large ;
		//JingDuZhuan.java:5：错误：不兼容的类型：从Long转换到int可能会有损失//small = large i//1 个错误
		//原因就是int 是比long 精度小，大精度不能给小精度赋值
		long large;
		int small = 20 ;
		large = small;
		System.out.println(small);//可以正常运行，说明小精度可以给大精度赋值

		//细节 3: (byte, short) 和 char 之间不会相互自动转换
		byte b;
		char a = 2;
		// b = a ;
		//JingDuZhuan.java:24：错误：不兼容的类型：从char转换到byte可能会有损失
		// System.out.println(b);

		//细节 4: byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//错, b2 + s1 => int
		int s2 = b2 + s1;//对, b2 + s1 => int
		//byte b4 = b2 + b3; //错误: b2 + b3 => int
		//

		//细节5：boolean 不参与转换
		boolean pass = true;
		//int num100 = pass;// boolean 不参与类型的自动转换

		//自动提升原则： 表达式结果的类型自动提升为 操作数中最大的类型
		//看一道题
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300 = 1.1F;
		double num500 = b4 + s3 + num200 + num300; //float -> double

	    int i=(int)1.9;
		System.out.println("大精度到小精度的强转" + i);
		int j =100;
		byte b1 = (byte)j;
		System.out.println(b1);
	}
}