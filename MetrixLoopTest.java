
public class MetrixLoopTest {
	public static void main(String ...strings ) {
		/*
		 10 20 30 
		 40 50 60 
		 70 80 90
		 */
		
		int arr[][] = {
						{10,20,30},
						{40,50,60},
						{70,80,90}};
		System.out.println("====> "+ arr.length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		/*
		 Iterate (0,0) (1,1) (2,2) 	 */
		int leftDiagSum=0;
		int i=0;
		int j=0;
		while(i<3) {
			while(j<3) {
				leftDiagSum+=arr[i][j];
				System.out.print(arr[i][j]+" ");
				i++;
				j++;
				break;
			}
		} 
		
		System.out.println();
		/* Iterate (0,2)(1,1)(2,0) */
		int rightDiagSum=0;
		int ii=0;
		int jj=2;
		while(ii<3) {
			while(jj>=0) {
				rightDiagSum+=arr[ii][jj];
				System.out.print(arr[ii][jj]+" ");
				ii++;
				jj--;
				break;
			}
		}
		
		System.out.println("leftDiagSum ==> " + leftDiagSum);
		System.out.println("rightDiagSum ==> " + rightDiagSum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
