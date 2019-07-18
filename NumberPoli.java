
public class NumberPoli {

	public boolean isPalindrome(int x) {
        String reverseString="";
        boolean bool=false;
        
        //Convert into string 
        String str = String.valueOf(x);
        
        //Convert into charArr
        char charArr[] = str.toCharArray();
        
        //Reverse the charArr and store into the reverseString 
        for(int i=str.length()-1;i>=0;i--) {
            reverseString += charArr[i];
        }
        System.out.println("Reverse String :: "+ reverseString);
         if(str.equals(reverseString)) {
            bool = true;
         }
        return bool;
    }
   
	
	public static void main(String ...strings ) {
		NumberPoli r1 = new NumberPoli();
		System.out.println(r1.isPalindrome(-121));
	}
}
