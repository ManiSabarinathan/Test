import java.util.Arrays;

public class OddEvenInArrayTest {
	public static void main(String ...strings ) {
		/*Input: [3,1,2,4]
		 Output: [2,4,3,1]
		The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
		*/
		int arr[] = {3,1,2,4};
		int newArr[] = new int[arr.length];
		//Two pass - 1st pass to scan only even and 2nd pass to pick only odd
		for(int i=0;i<arr.length;i++)	{
			if(arr[i] % 2 == 0) { newArr[i] = arr[i]; }			
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j] %2 == 1 ) { newArr[j] = arr[j]; }
		}
		arr = newArr;
		System.out.println(Arrays.toString(arr));
	}
	
	/*
	 Time Complexity:  O(N), where NN is the length of A.
     Space Complexity: O(N) for the sort, depending on the built-in implementation of sort. 
	 */
}


/*
Python

class Solution(object):
    def sortArrayByParity(self, A):
        return ([x for x in A if x % 2 == 0] +
                [x for x in A if x % 2 == 1])
                
*/