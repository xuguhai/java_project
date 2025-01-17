import java.util.Scanner;
public class ChaZhao{
	public static void main (String[] args){
        Scanner Myinput = new Scanner(System.in);
        String [] str = {"小红","小白","小明","小聪","小童","小孩"};
        String findName = Myinput.next();
        int falt = 0;
        for (int i = 0 ; i < str.length; i++) {
        	if (findName.equals ( str[i] ) ) {
        		System.out.println("恭喜你找到" + findName);
				System.out.println("下标为="+ i);
				falt =1;
				break;
        	}
        	
        }
        if (falt == 0) {
        	System.out.println("很遗憾你没找到"); 
        }
	}
}