public class Work2{
	public static void main (String[] args){
		String str = "19.9";
		double a = Double.parseDouble(str);//进行强制转化,里面依旧是要符合其能表示的范围，看似精度高不能转小但是
		//反证
		String b = "123";
		byte c = Byte.parseByte(b);//整型的精度大于字节但是这里依旧可以强转的
		//但是对于19.9因为表示范围不在int里面所以会报错，来提示强转失败
		System.out.println(c);
		System.out.println(a);
		//一个类型转化成对应字符串则就是 + ""
		//例：
		char p = 'A';
		String str1 = p + "";
		System.out.println(str1);
	}
}