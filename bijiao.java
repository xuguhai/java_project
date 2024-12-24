public class bijiao{
	public static void main(String[] args) {
		double a = 2.7;
		double b = 8.1 / 3;
		if (a == b) {
			System.out.println("ture\n");
		}else {
			System.out.println("false\n");
		}
		//这段代码最后会输出false，原因是8.1 / 3 在计算机中其存在误差 其实际值是几乎是2.7的小数(2.6999999999999997)但是还是比2.7小
		//所以在小数的比较中要考虑误差的问题，往往通过误差精度的限制来锁定
		System.out.println(b);
		if (a - b < 0.00001){
			System.out.println("\nture");
		}else{
			System.out.println("\nfalse");
		}
	}

}