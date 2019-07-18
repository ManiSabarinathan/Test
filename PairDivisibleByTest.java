
public class PairDivisibleByTest {
	public static void main(String ... arStrings) {
		int arr[] = {1,3,2,6,1,2};
		int k=3;
		int count=0;
		for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr.length;j++) {
				if(i==j || i>j) {
					continue;
				}
				if((arr[i]+arr[j])%k == 0){
					count++;
					System.out.println("(" + arr[i] +" , "+ arr[j] + ")");
				}
			}
		}
		System.out.println(count);
	}
}
