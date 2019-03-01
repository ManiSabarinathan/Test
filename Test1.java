import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
	public static void main(String ...strings) {
		Map<String,String> map = new HashMap<>();
		map.put("k1", "V1");
		map.put("k2", "V2");
		map.put("k3", "V1");
		map.put("k4", "V1");
		 
		String value= map.get("k5");
		System.out.println(value);
		Set mapKeySet = map.keySet();
		
		Iterator it = mapKeySet.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		
		
	}
	
	
	class Node {
		String key;
		String value;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
}
