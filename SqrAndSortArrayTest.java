import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SqrAndSortArrayTest {
	public static void main(String ... strings) {
		int arr[] = {-4,-1,0,3,10};
		int newA[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newA[i] = arr[i] * arr[i];
		}
		//IntStream stream = Arrays.stream(newA);
		//newA = stream.sorted().toArray();
		
		//Arrays.sort(newA);
		System.out.println(Arrays.toString(newA));
	}
}
