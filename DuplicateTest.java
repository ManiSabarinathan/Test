
public class DuplicateTest {
	 
	public static void printArray(int[] arr) {
		for(int i = 0 ;i<arr.length;i++) {
			System.out.print(arr[i] + " , ");
		}	
		System.out.println();
	}
	public static void main(String ...strings ) {
		int arr[] = {10,20,5,10,7,20};
		printArray(arr);
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=arr.length-1;i<j;j--) {
					if(arr[i] == arr[j]) {
					System.out.println("Duplicate Exist for " + arr[i] + " at postition :" + i + " AND " + j );					
				}
				
			}
		}
	}
}