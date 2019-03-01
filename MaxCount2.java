import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class MaxCount2 {
	public static void main(String ...strings ) {
		MaxCount2 ref = new MaxCount2();
		 
		int arr[] = {3,4,7,8,3,7,2,8,8};
		HashMap<Integer,Integer> hmap = new HashMap<>();
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				//get and update the count in the map
				int value = hmap.get(arr[i]);
				hmap.put(arr[i], value+1);
			}
			else {
				hmap.put(arr[i], count);
			}			
		}
		System.out.println("hMap ::" + hmap);
		HashMap<Integer,Integer> newMap = ref.sortMap(hmap);
		/*for(Map.Entry entry:newMap.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}*/
		Map.Entry entry = newMap.entrySet().iterator().next();
		System.out.println(entry.getValue());
				
	}
	
	public HashMap<Integer,Integer> sortMap(HashMap<Integer,Integer> m1) {
		
		//Convert into List
		List list = new ArrayList(m1.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Map.Entry e1 = (Map.Entry)(o1);
				Map.Entry e2 = (Map.Entry)(o2);
				Integer e1Value=(Integer)e1.getValue();
				Integer e2Value=(Integer)e2.getValue();
				int returnValue = e2Value.compareTo(e1Value);		
				return returnValue;
			}
		});
		
		
		//Convert list back to hashmap
		LinkedHashMap<Integer,Integer> lmap = new LinkedHashMap<>();
		for(Iterator it=list.iterator();it.hasNext();) {
			Map.Entry entry = (Map.Entry)it.next();
			lmap.put((Integer)entry.getKey(), (Integer)entry.getValue());
		}
		
		return lmap;
	}
}
