public class MethodExercise01{
  	public static void main(String[] args) {
  		AA tool = new AA();
  		int i = 3;
  		tool.isOdd(i);
  		tool.print(i , i);  
  		
  	}
  }
  //编写类AA方法：判断一个数是奇数odd还是偶数，返回boolean
  //根据行、列、字符打印对应行数和列数的字符，比如：行：4，列：4，字符#，则打印相应的效果
 class AA{
 	public Boolean isOdd (int num) {
          if (num % 2 != 0) {
          	System.out.println("这是奇数");
          	return true;
          } else {
          	System.out.println("这是偶数");
          	return false;
          }
          // return i % 2  ！= 0  ? ture : false;
 	}
 	public void print (int high , int wide ) {
 		for (int i = 0 ; i < high ; i++) {
 			System.out.println();
 			for  (int j = 0 ; j < wide ; j++) {
 				System.out.print("#");
 			}
 		}
 	}
 }