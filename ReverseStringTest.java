
public class ReverseStringTest {
	public static void main(String ...strings ) {
		String str = "MALAYALAM";
		char[] cArr = str.toCharArray();
		String newString="";
		for(int i=0;i<cArr.length;i++) {
			System.out.println(cArr[i]);
		}
		
		for(int j=cArr.length-1;j>=0;j--) {
			newString += cArr[j];
		}
		if(str.equals(newString)) {
			System.out.println("String is Polyndrom");
		}else {
			System.out.println("String is NOT Polyndrom");
		}
		
	}
}	
