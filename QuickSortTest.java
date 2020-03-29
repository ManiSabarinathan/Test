import java.util.Arrays;

public class QuickSortTest {
	static int arr[] = {12,34,54,9,8,78,6,56};

	public static void main(String ...strings ) {
		
		int l = 0;
		int h = arr.length-1;
		if(l<h) {
			int j = quicksort(l,h);
			quicksort(l,j);
			quicksort(j+1,h);
		}
	}
	
		public static int  quicksort(int l, int h) {
			System.out.println("Initial Array:: " + Arrays.toString(arr));
			int pivot = arr[l];
			int i=l;
			int j=h;
			
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
			System.out.println("Moving pivot to the correct position"+ arr[j] + " -- " + arr[l] );
			int temp1 = arr[l];
			arr[l] = arr[j];
			arr[j] = temp1;
			
			
			System.out.println("Just print:: "+ arr[j] + " --  " + arr[l] );
			System.out.println("Phase-1:: " + Arrays.toString(arr));				
			return j;
			
		}
}
