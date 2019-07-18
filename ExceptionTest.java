import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String ... str) {
		Scanner in = new Scanner(System.in);
		int i1=0;
		int i2=0;
			
		try {
			
		
			if(in.nextInt()>Integer.MAX_VALUE) {
				throw new InputMismatchException();
			}
			
			if(in.nextInt()>Integer.MAX_VALUE) {
				throw new InputMismatchException();
			}
			else {
				i1= in.nextInt();
				i2=in.nextInt();
			System.out.println(i1/i2);
			}
		}catch(InputMismatchException ee) {
			System.out.println(ee.getClass().getName());
		}
		catch(ArithmeticException ee) {
			System.out.println(ee.getClass().getName());
		}
		catch(Exception ee) {
			System.out.println(ee.getClass().getName());
		}
	}
}
