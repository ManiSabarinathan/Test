import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BSearch {
	public static void main(String ...strings ) {
		List list = new ArrayList();
		list.add(60);
		list.add(50);
		list.add(45);
		list.add(30);
		list.add(25);
		list.add(20);
		list.add(10);
		
		int index = Collections.binarySearch(list,30,Collections.reverseOrder());
		System.out.println("Item found in Index:: "+ index); 
		
		
	}
}
