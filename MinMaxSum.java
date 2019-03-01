import java.util.Arrays;

public class MinMaxSum {
	public static void main(String ...strings ) {
		//int arr[] = {10,20,30,40,50}; 
		int arr[] = {256741038, 623958417, 467905213, 714532089, 938071625};
		//Expected output: 2063136757 2744467344
		//Actual output:  -2008291003 2063136757

		miniMaxSum(arr);
	}
	
	 static void miniMaxSum(int[] arr) {
	        long sum=0;
	        long larr[] = new long[arr.length];
	        
	        for(int i=0;i<arr.length;i++) {
	        	
	          sum+=arr[i];
	          System.out.println("TempSum:: "+sum);
	        }
	        for(int i=0;i<arr.length;i++) {
	        	larr[i]=sum-arr[i];
	        }

	        //Sort the number to get the min and max number
	        Arrays.sort(larr);	        
	        System.out.println(larr[0] + " " + larr[larr.length-1]);

	       
}
		
}

