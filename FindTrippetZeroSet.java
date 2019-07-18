import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTrippetZeroSet {
	static int arr[]= {-1, 0, 1, 2, -1, -4};
	//static int arr[] = {10,20,30,40,50};
	public static void main(String ... strings) {
		FindTrippetZeroSet ob = new FindTrippetZeroSet();
		System.out.println(ob.threeSum(arr));
	}
	
	  public List<List<Integer>> threeSum(int[] arr) {
		  //Loop through the array and take group of 3 elements
		  ArrayList<Integer> listInt = null;
		  ArrayList<List<Integer>> outterList = new ArrayList<>();
		  for(int i=0;i<arr.length;i++) {
			  for(int j=i+1;j<arr.length;j++) {
				  int k=j+1;
				  while(k<arr.length) {					
					  System.out.println(""+ arr[i] + " , " + arr[j] + " , "+ arr[k]  + "Sum:: " + (arr[i]+arr[j]+arr[k]));
					  if(arr[i]+arr[j]+arr[k] == 0) {
						  listInt = new ArrayList<>();	  
						  listInt.add(arr[i]);listInt.add(arr[j]);listInt.add(arr[k]);							
						  outterList.add(listInt);
					  }
					  k++;
				  }					 
				  }		 
		  }	
		  
		
		  return outterList;
	  }
	  public void findSum(ArrayList<Integer> alist) {
		  System.out.println(alist.toString());
	  }

}
