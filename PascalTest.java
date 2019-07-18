import java.util.Arrays;
public class PascalTest {
	public static void main(String ...strings ) {
		
		int input=8;
		int newArr[] = new int[input];
		for(int i=1;i<=input;i++) {
			int tempArr[] = new int[i];
			
		    int j = 0;
		    while(j<tempArr.length) {
		    	if(j==0 || j==tempArr.length-1) {
		    		tempArr[j] = 1;
		    		j++;
		    	}
		    	else {
			    	//Iterate the newArray 
			    	tempArr[j] = newArr[j-1]+newArr[j]; 
			    	j++;
		    	}
		    }
		    newArr=tempArr;	
		    System.out.println("==> "+ Arrays.toString(tempArr));
		}
	}
}

