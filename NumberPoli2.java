
public class NumberPoli2 {
	public static void main(String ... strings) {
		int inputNumber=1441;
		int inputForValidation=inputNumber;
		String reverseNumberInString="";
		do {
		reverseNumberInString=reverseNumberInString+inputNumber%10;
		System.out.println(reverseNumberInString);
		inputNumber=inputNumber/10;
		System.out.println("New Input Number:: " + inputNumber);
		}while(inputNumber>0);
		
		if (inputForValidation==Integer.parseInt(reverseNumberInString)) {
			System.out.println("Number is Polindrom");
		}
		else {
			System.out.println("Number is Not a Polindrom");
		}
	}
}
