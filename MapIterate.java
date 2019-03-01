import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class MapIterate {
	public static void main(String ...strings ) {
		Map<String,Integer> map = new HashMap<>(); 
		map.put("Juju",100);
		map.put("Papu",70);
		map.put("Saba",76);
		map.put("Other",60);
		
		//Iterate the HashMap
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
		
		
		//Sort the HashMap by value
		//Step-1: get the entrySet and store into the list
		//Step-2: Use Collections.sort(list,new Comparator() {
			//@override
			//public int compare(Object o1, Object o2) {
			//Map.Entry entry1 = (Map.Entry) o1;
			//Map.Entry entry2 = (Map.Entry) o2;
			//return entry1.getValue().compareTo(entry2.getValue())
		//}
		//Step-3: Get the map.entry object from the list and convert back to HashMap
		
		List<Map.Entry<String,Integer>> list1 = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		/*for(Map.Entry<String, Integer> entry: map.entrySet()) {
			list1.add(entry);
		}*/
		System.out.println("List size :: " + list1.size());
		
		Collections.sort(list1, new Comparator() {
			public int compare(Object o1, Object o2) {
				Map.Entry<String,Integer> entry1 = (Map.Entry<String, Integer>)o1;
				Map.Entry<String, Integer> entry2 = (Map.Entry<String, Integer>)o2;
				Integer i1 = (Integer)entry1.getValue();
				Integer i2 = (Integer)entry2.getValue();
				int returncode= i1.compareTo(i2);
				return returncode;
			}
		});
			
		//Create a new Hashmap
		HashMap<String,Integer> newMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry: list1) {
			newMap.put((String)entry.getKey(),(Integer)entry.getValue());
		}
		
		System.out.println( "New Map ::  "+ newMap);
		
		
      /* HashMap<String,Integer> newMap = new LinkedHashMap();
		
		for(Iterator it=list1.iterator();it.hasNext();) {
			Map.Entry  entry = (Map.Entry) it.next();
			newMap.put((String)entry.getKey(),(Integer)entry.getValue());
		}
		System.out.println( "New Map ::  "+ newMap);*/
		
		/*for(Map.Entry<String,Integer> entry : newMap.entrySet()) {			
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}*/
		
	}
}
