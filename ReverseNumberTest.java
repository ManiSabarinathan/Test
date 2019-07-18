
public class ReverseNumberTest {
	static int lastnumber =0;
	static String reverseNumber="";
	public static void main(String ...strings ) {
		int inputNumber = 123456;
		ReverseNumberTest t = new ReverseNumberTest();	
			
		System.out.println("Reverse String is :: "+ t.reverse(inputNumber));	
	}
	
	public String reverse(int inputNumber) {
		System.out.println("inputNumber ==> " + inputNumber);	
		lastnumber = inputNumber%10;
		reverseNumber=reverseNumber+lastnumber;
		if((inputNumber/10)>0) {
			return reverse(inputNumber/10);
		}
		else {
			return reverseNumber;
		}
	}
}
