import java.util.HashMap;

public class MergeHashMap {
	
	public static void main(String ...strings ) {
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		
		map1.put("A", "100");
		map1.put("B", "200");
		map1.put("C", "300");
		
		map2.put("A", "1000");
		map2.put("B", "2000");
		map2.put("C", "3000");

		//Lets merge the hashmap
	
		map2.forEach(
				(key,value) -> map1.merge(key, value, (v1,v2) -> v1.equalsIgnoreCase(v2)?v1:v1+"::"+v2)
				);
		
		map1.forEach((key,value)-> System.out.println(key + "==> " + value));
		
		
		
		//Same hashmap
		HashMap<String,String> map3 = new HashMap<>();
		
		map3.put("x","xxx");
		map3.put("y","yyy");
		map3.put("z","zzz");
		map3.put("z","ggg");
		
		
		
	}
	
	
}
