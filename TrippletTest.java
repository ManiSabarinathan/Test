
public class TrippletTest {
	
	public static void main(String ...strings ) {
		int arr[] = {1,5,5,25,125};
		
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<=arr.length-1;++j) {
				System.out.println(arr[i] + "==> "+ arr[j]);
			}
		}
	}

}
