/*
 * 5 7 1
 * 2 8 9
 * 7 5 0 
 * 4 3 2
 * --> 4 rows 3 columns
 *
 */
public class IterateTwoDim {
	public static void main(String ...strings ) {
		int myArray[][] = {
				{5,7,1},
				{2,8,9},
				{7,5,0},
				{4,3,2}
		};
		
		for(int r = 0;r<myArray.length;r++) {
		
			for(int c=0;c<myArray[0].length;c++) {
				System.out.print(myArray[r][c]);
			}
			System.out.println();
			
		}
	}
}
