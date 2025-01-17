public class GuanXi{
	public static void main (String [] 	args) {

		int b;
		 // "str" instanceof String ; 
		System.out.println(  "str" instanceof String );
		b = 3;
		if (true){  //这里if（）中不能填数字来代表真值(这里是与C语言的差别)，一般是用true
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int a;
		if ((b = 4)){
			System.out.println("yes");

		} else {
			System.out.println("no");
		}
		System.out.println(a);

		System.out.println( (4 < 1) ^ (6 > 3) ); //当 a 和 b 不同时，则结果为 true, 否则为false

	}
}