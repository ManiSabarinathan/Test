import java.util.Arrays;

public class QuickSortTest {
	static int arr[] = {12,34,54,9,8,78,6,56};

	public static void main(String ...strings ) {
		
		int i = 0;
		int j = arr.length-1;
		QuickSortTest sort = new QuickSortTest();
		sort.quicksort(i,j);
		
		}
	
		public void quicksort(int i, int j) {
			System.out.println("Initial Array:: " + Arrays.toString(arr));
			int pivot = arr[i];
			
			
			while(i<j) {
				do {
					i++;
				}while(arr[i]<pivot);
				
				do {
					j--;
				}while(arr[j]> pivot);
				
				System.out.println("i==> " + i + " ==> " +arr[i]);
				System.out.println("j==> " + j + " ==> " +arr[j]);
				
				if(i<j) {
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));				
			}
			System.out.println("Moving pivot to the correct position"+ arr[j] + " -- " + pivot );
		    //Pending to complete
			
			System.out.println("Just print:: "+ arr[j] + " --  " + pivot );
			
			System.out.println("Phase-1:: " + Arrays.toString(arr));				
			
			
		}
		
		
	
}
