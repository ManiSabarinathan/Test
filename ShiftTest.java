import java.util.Arrays;

public class ShiftTest  { 
	public static void main(String ...strings ) {
		int arr[] = {3,4,5};
		int input=2; //Input should not be greater than array size
		
		if (input<=arr.length) {
		int tempArr[] = new int[input];
			int count=0;
			for(int i =arr.length-input;i<arr.length;i++) {
				tempArr[count] = arr[i];
				count++;
			}
			System.out.println("Temp Array Data :: " + Arrays.toString(tempArr));
			for(int k=0;k<input;k++ ) {
				for(int j=arr.length-1;j>0;j--) {
					arr[j] = arr[j-1];	
					System.out.println("arr["+ j + "]"+ arr[j]);
				}
			}
			int newcount=0;
			for(int k=0;k<tempArr.length;k++) {
				arr[newcount]=tempArr[k];
				newcount++;
			}
			
			System.out.println(Arrays.toString(arr));
			for(int i=1;i<=input;i++) {
				System.out.println(arr[i]);	
			}
			
		}
}
}
