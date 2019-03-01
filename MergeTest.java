
public class MergeTest {
	public static void main(String ...strings ) {
		MergeTest t1 = new MergeTest();
		t1.amethod(); 
	}
	
	public void amethod() {
		int intArr[] = {5,2,3,10,7,15,6,9};
		System.out.println(intArr.length);
		mainSplit(intArr,intArr.length);
	}
	
	public void mainSplit(int[] intArr, int length) {
		System.out.println("Array::   " + intArr);
		System.out.println("Length::  " + length);
		
		int midIndex=length/2;
		//1      to   mid  
		//mid+1  to   right
		//Two for loop
		for(int i = 0;i<=midIndex;i++) {
			System.out.println(intArr[i]);
		}
		for(int j = midIndex+1;j<length;j++) {
			System.out.println(intArr[j]);
		}
		
	}
	
	/*public void split(int[] arr, int n) {
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}*/
}
