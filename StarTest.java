
public class StarTest {
	public static void main(String ...strings ) {
		StarTest t = new StarTest();
		//t.leftStair(7);
		//t.leftDollor(7);
		t.rightDollor(7);
		//t.rightStair(7);
	}
	
	public void leftStair(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");	
			}

	}
	
	
	public void rightStair(int n) {
		for(int i = n;i>1;i--) {
			System.out.print(" ");
		}
		System.out.print("$");
	}
	
	public void leftDollor(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}
	
	public void rightDollor(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("$");
			}
			System.out.println();
		}		
	}
}

	