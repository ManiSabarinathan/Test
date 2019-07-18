import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapTest {
	public static void main(String ...strings ) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Juju", 123);
		map.put("Papu", 345);
		/*//Optional<Integer> optional = map.get("Juju");
		if(optional.isPresent()) {
			optional.get();
		}
		if(map.containsKey("Juju")) {
			System.out.println(map.get("Juju"));
		}*/
	}

}
