public class JinZhiZhuan{
	public static void main (String [ ] args) {
		//二进制转化为八进制就是将二进制的每三位进行换算对应到八进制中的一位，不足3个也可算一位（因为111（7））
		//11(3)101(5)010(2) 则八进制就是352
		int b ;
		b = 0b11101010;
		System.out.println(b);
		b = 0352;
		System.out.println(b);
        //答案一样
        //那么二进制到十六进制也就类似 就是每4为为一组
        //1110(E)1010(A)
        b = 0xEA;
        System.out.println(b);
        //反之将八进制转换为2进制则就是每一位对应成3个位数
	}
}