import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BoyGirlTest {
	public static void main(String ...strings ) {
		String arr1="BOY";
		String arr2="GIRL";
		String inputString="GIRLBOY";

		char arr[] = inputString.toCharArray();
		char barr[] = arr1.toCharArray();
		char garr[] = arr2.toCharArray();
		Queue<Character> BQ = new LinkedList<>();
		for(char c:barr) {
			BQ.add(c);
		}
		Queue<Character> GQ = new LinkedList<>();
		for(char c:garr) {
			GQ.add(c);
		}
		System.out.println("==> " + BQ.size() + ":: " + GQ.size());
	
		for(int i=0;i<arr.length;i++) {
		 	if(BQ.size()>0) {
				char bc = BQ.peek();	
				if(bc == arr[i]) {
					   BQ.remove(arr[i]);
				 }else if(GQ.size()>0) {
						char gc = GQ.peek();	
						if(gc == arr[i]) {
							   GQ.remove(arr[i]);
						   }
					}
		 	}			
		}
		 
		System.out.println("==> " + BQ.size() + ":: " + GQ.size() );
		if(BQ.size()== 0 && GQ.size()==0) {
			System.out.println("Valid");			
		}
		else {
			System.out.println("Invalid");
		}
				
	}

}
