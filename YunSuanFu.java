public class YunSuanFu{
	public static void main (String[]  args) {
		System.out.println(10 / 4 );// 2
		System.out.println(10.0 /4);// 2.5
		double b = 10 / 4; //2.0
		//虽然变量 b 被声明为 double 类型，但 10 / 4 实际上是整数除法，
		//因为两个操作数都是整数。整数除法的结果是 2，然后这个整数结果被隐式转换为 double 类型并赋值给变量 b，
		//这就是为什么输出是 2.0 而不是 2.5。
		System.out.println(b);
		b = 10.0 / 4;
		System.out.println(b);//2.5
		 b = 10 / (double)4; // 2.5
		//取模的注意
		// -10 % -3 = (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1

		//练习
		int day = 59 % 7 ;
		int week = (59 - day) / 7;
		System.out.println("和" + week + "个星期零" + day + "天" );
		int C;
		double F;
		F = 5 / 9 * (C - 100);
		System.out.println(F);
	}  
}