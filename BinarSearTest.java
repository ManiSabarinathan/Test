
public class BinarSearTest {
	
	static int arr[] = {10,20,30,40,50,70,90};
	static int searchnumber = 190;
	public static void main(String ...strings ) {
		BinarSearTest t = new BinarSearTest();
		int left = 0;
		int right = arr.length-1;
		System.out.println(t.binary(left,right));
	}
	
	public int binary(int left, int right) {
		int mid = (left+right)/2;
		
		if(left>right) return -1;
		
		if(searchnumber == arr[mid]) {
			return mid;			
		}
		if(searchnumber > arr[mid]) {
			return binary(mid+1,right);
		}
		else {
			return binary(left, mid-1);
		}
	}

}
