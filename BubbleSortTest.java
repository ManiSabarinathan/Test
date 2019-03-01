import java.util.Arrays;

public class BubbleSortTest { 
	static int arr[] = {50,10,70,90,80,20};

	public static void main(String ... strings ) {
		BubbleSortTest obj = new BubbleSortTest();
		obj.sortNum(arr);
	}

	public void sortNum(int arr[]) {
		for(int j =0;j<arr.length;j++) {
			System.out.println("Loop :: " + j);
			
			//Compare i with i+1
			for(int i =0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					//swap arr[i] with arr[i+1]
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;				
				}
			}
			//print the data
			System.out.println(Arrays.toString(arr));
	}
	}
	
}
