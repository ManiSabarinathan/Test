
public class NumPoli3 {
	public static void main(String ...strings ) {
		int inputNumber=4536;
		int reverseNumber=0;
		do {
			reverseNumber=((inputNumber%10)*10)+reverseNumber;
			System.out.println("Reverse number:: " + reverseNumber);
			inputNumber=inputNumber/10;
		} while(inputNumber>0);
			
	}
}
