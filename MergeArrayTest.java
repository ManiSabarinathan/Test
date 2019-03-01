import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrayTest {
	public static void main(String ...strings ) {
		int arr1[] = {4,3,10,44,9,77,86};
		int arr2[] = {5,6,82,77,33}; 
		
		MergeArrayTest obj = new MergeArrayTest();
		//obj.mergeArrayBase(arr1, arr2);
		obj.mergeArrayCollection(arr1,arr2);
		
	}
	
	public void mergeArrayBase(int a[], int b[]) {
		int c[] = new int[a.length+b.length];
		for(int i = 0;i<a.length;i++) {
			c[i] = a[i];
		}
		int pLength = a.length;
		for (int j=0;j<b.length;j++) {
			c[pLength] = b[j];	
			pLength++;
		}
		System.out.println(Arrays.toString(c));	
	}
	
	public void mergeArrayCollection(int a[], int b[]) {
		List list1 = new ArrayList(Arrays.asList(a));
		list1.addAll(Arrays.asList(b));
		//Convert list to Array
		Object arrr[] = list1.toArray();
		System.out.println(Arrays.toString(arrr));
		
	}
}
