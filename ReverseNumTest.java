
public class ReverseNumTest {
	static String str="";
	int result=0;
	
	public static void main(String ...strings) {
		ReverseNumTest ob = new ReverseNumTest();
		int input=1534236469;
	
		if(input<0) {
			input=Math.abs(input);
			str="-";
		}
		int output = ob.reverse(input);
		
		System.out.println(output);
		//int k = Integer.parseInt("9646324351");
	}
	
	  
	    public int reverse(int x) {
	    	int lastNum=0;
	    	lastNum=x%10; 
	    	System.out.println("Integer MaxValue :: "+ Integer.MAX_VALUE);
	    	//System.out.println("Result maxValue :: " + (result>Integer.MAX_VALUE/10));
	    	if(result>Integer.MAX_VALUE/10) {
	    		return 0;
	    	}
	    	result=result*10+lastNum;
	    	System.out.println("Result:: "+ result );
		       
	    	if(x/10>0 ) {
	    		reverse(x/10);	
	    	}
	    	return (result);
	    }
	    
}
