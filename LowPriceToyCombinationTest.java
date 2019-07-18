import java.util.Arrays;

public class LowPriceToyCombinationTest {
	public static void main(String ...strings ) {
		int iArr[] = {1,2,3,4};
		int maxLimit=7;
		
		LowPriceToyCombinationTest ob = new LowPriceToyCombinationTest();
		ob.amethod(iArr,maxLimit);
		
	}
	public void amethod(int arr[], int maxLimit) {
		int newA[] = new int[arr.length];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxLimit) {
				arr[i] = 0;
			}else {
				System.out.println("Eligible values in the array:: " + arr[i]);
				newA[i] = arr[i];
				sum+=arr[i];				
			}
		}
		System.out.println("Sum:: "+ sum);	
		System.out.println("=======> " + Arrays.toString(newA));		
		
		for(int i=0;i<newA.length;i++) {
			newA[i] = sum-newA[i];			
		}
		System.out.println("===Sum Array====> " + Arrays.toString(newA));			
		
	}
}
