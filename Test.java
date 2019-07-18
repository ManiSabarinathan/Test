import java.util.Arrays;

public class Test {

	/*
	 * 
	 *  1
		1 1
		1 2 1
		1 3 3 1
		1 4 6 4 1
		1 5 10 10 5 1
		1 6 15 20 15 6 1

	 */
	
	
	public static void main(String ...strings ) {
		Test t = new Test();
		t.pascal(3);
	}
	
	
	public void pascal(int n)
	{
		int firstElment = 1;
		int lastElement = 1;
		
		int arr[] = new int[n];
		
		if(n == 1) {
			arr[0]=firstElment;
			System.out.println(arr[0]);
		} else if(n ==2) {
			arr[0] = firstElment;
			arr[1] = lastElement;
			System.out.println(arr[0] + " " + arr[1] );
		}else {
				System.out.println(Arrays.toString(arr));
				//Loop the array
				for(int i = 1;i<arr.length;i++) {
					arr[0] = firstElment;
					arr[i] = arr[i] + arr[i+1];
					arr[arr.length-1] = lastElement;					
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
	
}