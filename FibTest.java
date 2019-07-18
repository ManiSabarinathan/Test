import java.util.Arrays;

public class FibTest {
	static int input=8;
	static int loopCount=0;
	int f[] = new int[input+1];
	public static void main(String ...strings ) {
		//0 1 1 2 3 5 8 13 21 34 
		
		FibTest t = new FibTest();
		t.fib(input);
	}
	
	public void  fib(int n) {
		System.out.println("Loop Count ==> " + loopCount++ );
		
		System.out.println(" n ==> "+ n);
		
		f[0] = 0;
		f[1] = 1;
		if(f[n-1] ==0 ) {
			 fib(n-1);
		}
		else {
			f[n] = f[n-1] + f[n-2];
			System.out.println(f[n]);
					}
		if(n != input) {
			System.out.println("Loop again ..." );
			fib(input);
		}
		
	}
}
