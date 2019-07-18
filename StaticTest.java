import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticTest {

  static boolean flag;
  static int B;
  static int H;
  static {
	  flag =false;
	  Scanner scanner = new Scanner(System.in);
	  B = scanner.nextInt();
	  H = scanner.nextInt();
	  if(B>=0 && H>=0) {
	     flag = true;
	  } else {
		  try {
			throw new java.lang.Exception("Breadth and height must be positive");
		} catch (Exception e) {
		     System.out.println(e.toString());
		}
	  }
  }

public static void main(String[] args)  {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
		
	}//end of main

}//end of class

