public class WorkWeak1{
	public static void main(String[]  args){
		char a;
		a = '\n';
		System.out.println(a);
		a = '\t';
		System.out.println(a);
		a = '\r';
		System.out.println(a);
		a = '1';
		System.out.println(a);
		String book1 = "三体";
		String book2 = "球状闪电";
		System.out.println(book1 + book2);//三体球状闪电
		char sex1 ='男';
		char sex2 ='女';
		System.out.println(sex1 + sex2);//52906 这里为什么不是男女呢？因为只有字符串是和并字符，而单字符是转化对应编码的对应值相加
		int bookvalue1 = 20;
		int bookvalue2 = 30;
		System.out.println(bookvalue1 + bookvalue2);//50
		String name = "缪森辉";
		int age = 18;
		String grade = "优秀";
		char sex ='男';
		String hobby = "羽毛球";
		System.out.println("姓名：" + name + "\t" + "年龄：" + age + "\t" + "成绩：" + grade + "\t" + "性别：" + sex + "\t" + "爱好：" + hobby);


	}
}