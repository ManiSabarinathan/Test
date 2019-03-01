
public class LeftStairTest {
	public static void main(String ...strings) {
		int maxSize=6;
		int i=1;
		while(i<=maxSize) {
			for(int j=0;j<i;j++) {
				System.out.print("$"); 
			}
			System.out.println();
			i++;
		}
	}
}
