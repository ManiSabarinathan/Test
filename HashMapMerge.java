import java.util.HashMap;
import java.util.Map;

public class HashMapMerge {
	public static void main(String ...strings ) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(10, "Juju");
		map1.put(20, "Papu");
		map1.put(30, "Saba");
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(10, "XXX");
		map2.put(20, "Papu");
		map2.put(30, "YYY");
		
		//Merge map1 and map2
		map1.forEach((key,value)-> 	map2.merge(key, value, (v1,v2)-> v1.equalsIgnoreCase(v2)?v1: v1 + " And "+v2 )			
		);
		
		map2.forEach((key,value) -> {
			System.out.println("Key :: " + key + " Value :: " + value);
		});
	}
}

/*
Output:
Key :: 20 Value :: Papu
Key :: 10 Value :: XXX And Juju
Key :: 30 Value :: YYY And Saba
*/