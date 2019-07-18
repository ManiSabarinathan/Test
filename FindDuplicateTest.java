import java.util.HashMap;
import java.util.Map;

public class FindDuplicateTest {
	static int arr[] = {10,30,30,30,33,37,40,70,78,78}; 

	
	
	public static void main(String ...strings ) {
		FindDuplicateTest ob = new FindDuplicateTest();
		//ob.findDup();
		ob.findDupWithMap();
	}
	
	public void findDup() {
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//System.out.println(arr[i] + " :: " + arr[j]);
				if(arr[i] == arr[j]) {
					System.out.println("The element " + arr[i] + " exist at position :: " + j);
				}
			}
		}
	}
	
	
	public void findDupWithMap() {
		Map<Integer,Integer> map = new HashMap<>();
		int count = 1;
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int currentCount = map.get(arr[i]);
				map.put(arr[i], ++currentCount);				
			}
			else {
				map.put(arr[i], count);
			}					
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("The Elment " + entry.getKey() + " available only " + entry.getValue() + " times");
		}
		
	}
}
