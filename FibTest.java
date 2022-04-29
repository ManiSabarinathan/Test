
public class FibTest {
	static int numb = 2;
	static int F0=0;
	static int F1=1;
	static int result;
	
	public static void main(String ... strings ) {
		FibTest t = new FibTest();
		t.fib(numb);
	}
	
	private void fib(int n) {
        int f0 = 0;
        int f1 = 1;
        System.out.println( f0 );
        System.out.println( f1 );

        for(int i=0;i<n-2;i++){
            int temp = f0+f1;
            System.out.println(temp);
            f0 = f1;
            f1 = temp;
        }
    }
	
	
}
