
public class LeftRotataionArrayTest {

	public static void main(String ...strings ) {
		int arr[] = {1,2,3,4,5};
		
		int temp=0;
		int rotationCount=4;
		int loopcount=0;
		while(loopcount<rotationCount){
			temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
			loopcount++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
