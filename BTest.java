
public class BTest {
	static int arr[] = {20,40,60,70,80,90,100}; 
	int searchNumber =610;
	
	public static void main(String ... string) {
		BTest ob = new BTest();	
		
		int resultIndex = ob.search(0,arr.length-1);
		System.out.println("Result index "+ resultIndex);
		
		
	}
	
	public int  search(int start, int end) {
		if(start>end) { //No more elements to search: Just return -1
			System.out.println("No matching ...." + start + " :: " + end);
			return -1;
		}
		
		int mid=((start+end)/2);
		
		System.out.println("start :: "+start);
		System.out.println("end :: "+end);
		System.out.println("midNumber :: "+mid);
		
		if(searchNumber == arr[mid]) {
			System.out.println("Search number and mid number is equal ");
			System.out.println("Search number:: "+ searchNumber + "Mid number:: " + arr[mid] + "==> " + mid);
			return mid;
		}
				
		if(searchNumber>arr[mid]) {
			System.out.println("search number is greater than mid number" + "Search number:: "+ searchNumber + "Mid number:: " + arr[mid]);
			start=mid+1;				
			return search(start,end);
		}else {
			System.out.println("search number is less than mid number" + "Search number:: "+ searchNumber + "Mid number:: " + arr[mid]);
			end=mid-1;
			return search(start,end);
		}
		
	}
	
	
}

