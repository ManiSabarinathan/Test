import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListRangeTest {
	public static void main(String ...strings ) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		
		  int arr[] = new int[list.size()];
	       int jj=0;
	       Iterator it = list.iterator();
	       while(it.hasNext()) {
	         int v = (Integer) it.next();
	         arr[jj] = v;
	         jj++;
	       }
	    int range=2;   
	    int count=0;
	    int expectedSum=4;
		/*for(int i=0;i<=arr.length-range;i++) {
			if(Arrays.stream(arr,i,i+range).sum()==expectedSum) {
				count++;
			}
		}*/
	    for(int i=0;i<=arr.length-range;i++) {
	    	System.out.println(Arrays.stream(arr,i,i+range).sum());
	    }
		System.out.println("Count :: "+ count);
		
		ListRangeTest ob = new ListRangeTest();
		ob.listRange();
	}
	//length=5 (0-4) endlimit=5-2=3
	//0,2 ==> pull 2 numbers --> 1,2
	//1,3 ==> pull 2 number  --> 2,1 
	//2,4 ==> pull 2 number  --> 1,3
	//3,5 ==> pull 2 number  --> 3,2
	
	
	public void listRange() {
		int limit=2;
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		//System.out.println(list.stream().mapToInt(i -> i.intValue()).sum());
	
		//list.stream().limit(2).forEach((a) -> System.out.println(a));
		//list.stream().skip(2).forEach((a) -> System.out.println(a));
		
		
	}
	
}
