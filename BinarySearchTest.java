
public class BinarySearchTest {
	//static int arr[] = {10,40,45,56,78,81,99};
	static int arr[] = {20,40,60,70,80,90,100};
	static int searchNumber=80;
	
	public static void main(String ...strings ) {
		 
		
		int start = 0;
		int end = arr.length-1;
		int itemFoundIndex = binarySearch(start,end);
		if(itemFoundIndex < 0 ) {
			System.out.println("Item not found in this Array");
		} else {
			System.out.println(itemFoundIndex);
		}
	}
	
	public static int binarySearch(int start,int end) {
		System.out.println("Start Index:: "+start + " End Index:: " + end); 
		if(start>end) { //No more elements to search: Just return -1
			return -1;
		}
		int mid = (start+end)/2;
		if(searchNumber == arr[mid]) {
			System.out.println("Matching Index:: " + mid);
			return mid;
		}
		if(searchNumber > arr[mid] ) {
			start = mid+1;
			return binarySearch(start, end);
		}
		else {
			end=mid-1;
			return binarySearch(start, end);
		}
				
	}
}	
