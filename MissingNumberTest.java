
public class MissingNumberTest {
	public static void main(String ...strings ) {
		//Find the single missing number in te second array
		int arr1[] = {10,20,5,7,35,50,8}; 
		int arr2[] = {5,35,50,8,10,20};
		int sum1=0;
		int sum2=0;
		for(int i =0;i<arr1.length;i++) {
			sum1+=arr1[i];
		}
		
		for(int i =0;i<arr2.length;i++) {
			sum2+=arr2[i];
		}
		
		int missingSingleNumber = sum1-sum2;
		System.out.println("Missing number is ::"+ missingSingleNumber);
		
		
	}
}
