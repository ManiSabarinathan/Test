
public class FibTest2 {
	 
	
	 static int fib(int n) 
	    { 
		System.out.println("==> "+ n);
	    if (n <= 1) 
	       return n; 
	    return fib(n-1) + fib(n-2); 
	    }
	 
	 public static void main (String args[]) 
	    { 
			int n = 9; 
			System.out.println(fib(n)); 
	    }
}
