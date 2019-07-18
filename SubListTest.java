import java.util.ArrayList;
import java.util.List;

public class SubListTest {
	static List<Integer> mainList = new ArrayList<Integer>();
	
	public static void main(String ... arg) {
		mainList.add(100);
		mainList.add(200);
		mainList.add(300);
		mainList.add(400);
		mainList.add(500);
		mainList.add(600);
		mainList.add(700);
		
		int listSize = mainList.size();
		int mid = listSize/2;
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		for(int i=0;i<mid;i++) {
			l1.add(mainList.get(i));
		}
		for(int i=mid;i<listSize;i++) {
			l2.add(mainList.get(i));
		}
		
		System.out.println("mainList ==> "+ mainList);
		System.out.println("FirstSubList  ==> "+ l1);
		System.out.println("SecondSubList ==> "+ l2);

	}
}
