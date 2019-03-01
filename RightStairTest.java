
public class RightStairTest {
	public static void main(String ...strings) {
		int maxSize=6;
		int tempSize=6; 
		int i=1;
		while(i<=maxSize) {
			for(int j=1;j<tempSize;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("$");
			}
			System.out.println();
			i++;
			tempSize-=1;			
		}
	}
}
