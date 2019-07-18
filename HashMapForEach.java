import java.util.Map;
import java.util.HashMap;

public class HashMapForEach {
	public static void main(String ...strings ) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Juju");
		map.put(20, "Papu");
		map.put(30, "Saba");
		map.put(40, "nathan");
		//Performs the given action for each entry in this map until all entrieshave been processed or the action throws an exception. 
		//for (Map.Entry<K, V> entry : map.entrySet())
	    //action.accept(entry.getKey(), entry.getValue());
		map.forEach((k,v)-> System.out.println("Key :: " + k + " Value :: " + v));
		
	}
}
