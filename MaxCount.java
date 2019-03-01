import java.util.HashMap;
import java.util.Map;

public class MaxCount {
	public static void main(String ...strings ) {
		
		MaxCount obj = new MaxCount(); 
		//Sort the map
		Map<Integer, Integer> unSortedMap = obj.getUnSortedMap();
		
		//Iterate the hashMap
		for(Map.Entry entry : unSortedMap.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}
	
	public Map<Integer,Integer> getUnSortedMap() {
		int arr[] = {9,6,3,2,1,3,1,2,2,3,7,9,3};
		int count=1;
		Map<Integer, Integer> m = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			System.out.println("In Loop : " + i);
				
			if(m.containsKey(arr[i])) {
				//Update the count value for the specific key
				System.out.println("Array--> " + arr[i] + "--> " + m.get(arr[i]));
				int value = m.get(arr[i]);
				System.out.println(arr[i] + "is already in the Map, update the value: " + value);
				m.put(arr[i], value+1);
			}
			else {
					m.put(arr[i],count);
			}
			
		}
		return m;
	}
}
