import java.util.HashMap;
import java.util.Map;

public class DuplicateWithMapTest {
	 
	static Map<Integer, Integer> map = new HashMap<>();
	
	
	public static void main(String ...strings ) {
		int count=1;
		
		int arr[] = {10,7,12,10,7,12,40,10};
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				//add the current count value and update the value data
				int currentCount = map.get(arr[i]);
				map.put(arr[i], currentCount+1);
			} else {
				map.put(arr[i], count);
			}
						
		}
		
		//Iterate the map
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println("This item [ "+ entry.getKey()  +  " ] is having [ " + entry.getValue() +" ] entries in the Array" );
			
		}
	}
}
