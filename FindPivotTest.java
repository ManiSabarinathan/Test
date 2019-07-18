
public class FindPivotTest {
	static 	int arr[] = {1,7,3,6,5,6};
	
	public static void main(String ...strings ) {
		FindPivotTest t = new FindPivotTest();
		//Find pivot : the left and right sum should be equal
	    //int mid = arr.length/2;
		int mid=0;
		System.out.println("Initial pivot:: " + mid);
		int leftSum = t.findSum(0, mid-1);
		int righSum = t.findSum(mid+1, arr.length-1);
		System.out.println("Left Sum::  "+leftSum);
		System.out.println("Right Sum:: "+righSum);
		if(leftSum==righSum) {
			System.out.println("Pivot:: "+ mid);
		}else if(righSum>leftSum) {
			//move one step right
			while(mid<arr.length-1) {
				++mid;
				int newLeftSum = t.findSum(0, mid-1);
				int newRightSum = t.findSum(mid+1, arr.length-1);
				
				if(newLeftSum==newRightSum) {
					System.out.println("NewPivot  ==>" + mid);
					System.out.println("newLeftSum ==>" + newLeftSum);
					System.out.println("newRightSum ==> " + newRightSum);
					break;
				}
			}
		}else if(leftSum>righSum)	{
			//move one step left 
			while(mid>1) {
				--mid;
				int newLeftSum = t.findSum(0, mid-1);
				int newRightSum = t.findSum(mid+1, arr.length-1);	
				if(newLeftSum==newRightSum) {
					System.out.println("NewPivot  ==>" + mid);
					System.out.println("newLeftSum ==>" + newLeftSum);
					System.out.println("newRightSum ==> " + newRightSum);
					break;
				}
		}
		}
		
	}
	
	public int findSum(int s,int e ) {
		int sum=0;
		for(int i=s;i<=e;i++) {
			sum+=arr[i];		
		}
		return sum;	
	}
}
