public class StringToBasic{
	public static void main (String[] args) {
		int n1=100;
		float n2=1.1f;
		double n3=3.4;
		boolean b1=true;
		String str1 = n1 + "";
		String str2 = n2 + "";
		String str3 = n3 + "";
		String str4 = b1 + "";
		System.out.println(str1 + " " + str2 + " "+ str3 + " " + str4 + " ");
		System.out.println("有更改");


		//String->对应的基本数据类型
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);
		System.out.println("===================");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//123
		System.out.println(b);//true
		//怎么把字符串转成字符 char -> 含义是指 把字符串的第一个字符得到
		//解读 s5.charAt(0) 得到 s5 字符串的第一个字符 '1' 
		System.out.println(s5.charAt(0));//相当于数组的
	}
}