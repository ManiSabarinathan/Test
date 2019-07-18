import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class PrimeCheckerTest {
	public static void main(String ...strings ) {
		
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			
		} catch(Exception ee) {
			
		}
	
	}
}
	
	
	class Prime{
	public void checkPrime(int ... inArr )  {
		for(int i:inArr) {
			isPrime(i);
		}
	}
	
	public void isPrime(int n) {
		
		int count=0;
		 for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}			
		 }
		 if(count==2) {
			 System.out.print(n + " ");	 
		 }
		 else {
			 System.out.print(" ");
		 }
	
	}
	}

