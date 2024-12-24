public class StringToBasicDetail {
//编写一个 main 方法
	//在将 String 类型转成 基本数据类型时， ，比如 我们可以把 "123" , 转成一个整数，但是不能把 "hello" 转成一个整数
	public static void main(String[] args) {
		String str = "hello";
		//转成 int
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
		//Exception in thread "main" java.lang.NumberFormatException: For input string: "helloworld"
        // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        // at java.base/java.lang.Integer.parseInt(Integer.java:588)
        // at java.base/java.lang.Integer.parseInt(Integer.java:685)
        // at StringToBasicDetail.main(StringToBasicDetail.java:6)
        //提示说这样转化不了但可以编译
	}
}