import java.util.Scanner;

 
public class CharTest {
	public static void main(String ...strings ) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] carr= A.toCharArray();
        String newString="";
        for(int i=A.length()-1;i>=0;i--) {
          newString=newString +  carr[i];
        }
        if(A.equals(newString)) {
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}
