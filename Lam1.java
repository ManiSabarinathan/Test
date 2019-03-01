interface Cal {
	boolean calculate(int a); 
}

public class Lam1 {
	public static void main(String ...strings) {
		Cal evenRef = (n) -> (n % 2) == 0;
		Cal positiveRef = (n) -> (n>0);
		
		System.out.println("IsEven :: " + evenRef.calculate(10));
		System.out.println("IsPositive :: " + positiveRef.calculate(-12));
		
	}
}
