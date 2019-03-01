import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maptest {
	public static void main(String ...strings ) {
		Map<Integer,Integer> map  = new HashMap<>();
		map.put(300,5);
		map.put(200,2); 
		map.put(300,7);
		map.put(400,4);
		
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {			
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
		
		
		List<Integer> list = new ArrayList(map.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Map.Entry e1 = (Map.Entry)(o1);
				Integer e1Value=(Integer)e1.getValue();
				
				Map.Entry e2 = (Map.Entry)(o2);
				Integer e2Value= (Integer)e2.getValue();
				
				int returncode= e1Value.compareTo(e2Value);
				return returncode;
				}
		});
		
		
/*		//Convert to list to sort 
		System.out.println("Convert to list to sort");
		List list = new ArrayList(map.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			 public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
	            }
			
		});
		
*/		
		//Convert back to Map to show the sorted map
		System.out.println("Convert back to Map to show the sorted map");
		HashMap<Integer,Integer> newMap = new LinkedHashMap();
		
		for(Iterator it=list.iterator();it.hasNext();) {
			Map.Entry  entry = (Map.Entry) it.next();
			newMap.put((Integer)entry.getKey(),(Integer)entry.getValue());
		}
		
		for(Map.Entry<Integer,Integer> entry : newMap.entrySet()) {			
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
		
		
	}
}
