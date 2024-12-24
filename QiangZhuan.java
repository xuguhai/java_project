public class QiangZhuan{
	public static void main (String[] args){
		char name = '缪';//两字节
		//System.out.println 一般后面输出后会添加换行，这个和c语言的printf不太一样，想要添加换行也可跟范例一样
		System.out.println( "\n" + name);
		System.out.print(name);
		System.out.println((int) name);
	}
}