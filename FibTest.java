
public class FibTest {
	static int numb = 2;
	static int F0=0;
	static int F1=1;
	static int result;
	
	public static void main(String ...strings ) {
		FibTest t = new FibTest();
		t.cal(numb);
	}
	
	public void cal(int numb) {
		int result = numb+(numb-1);
	}
	
	
}
