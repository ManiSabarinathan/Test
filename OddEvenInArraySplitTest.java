import java.util.Arrays;

public class OddEvenInArraySplitTest {

	/*Input: [3,1,2,4]
	 Output: [2,4,3,1]
	The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	*/
	
	public static void main(String ...strings ) {
		OddEvenInArraySplitTest ob =  new OddEvenInArraySplitTest();
		int arr[] = { 3, 1, 2, 4, 7, 8, 10,13,9,18 };
		//int arr[] = {0,1};
		int i=0;
		int j=arr.length-1;
		int temp=0;
		while(i<arr.length-1) {
			/*if(i>j) {
				break;
			}*/
			System.out.println(arr[i] + " :::::: " + arr[j] );
			if(arr[i]%2==0) {
				System.out.println(arr[i] + "  is even");
				i++;
			}
			if(arr[j]%2==1) {
				System.out.println(arr[j] + "is odd");
				j--;
			}
			System.out.println("Eligible to swap elements :: "+arr[i] + "==> "+ arr[j]);
			//seapping logic
			/*temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;*/
			//i++;
			//j--;			
		}
		System.out.println(Arrays.toString(arr));
	}

	
}
