import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockPositionTest {
	public static void main(String ...strings ) {
	
		Scanner scanner = new Scanner(System.in);
		String[] token1 = null;
		String[] token2 = null;
		try {
		while (scanner.hasNextLine()) {
			     token1 = scanner.nextLine().split("\\s");
				 token2 = scanner.nextLine().split("\\s");				 			 
		}} 
		finally {
			 if (scanner != null)
			        scanner.close();
		}

		System.out.println("Starting...");
		int size = token1.length;
	    int [] arr1 = new int [size];
	    for(int i=0; i<size; i++) {
	         arr1[i] = Integer.parseInt(token1[i]);
	    }
	    int size2 = token2.length;
	    int [] arr2 = new int [size2];
	    for(int i=0; i<size; i++) {
	         arr2[i] = Integer.parseInt(token2[i]);
	    }
	    System.out.println("arr1==> "+ Arrays.toString(arr1));
		System.out.println("arr2==> "+ Arrays.toString(arr2));
	      
		//int arr1[] = {1,2,9,5,7};
		//int arr2[] = {1,3,2,0,7};
		int num_of_moves_1=0;
		int num_of_moves=0;
		int min_move=0;
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i] < arr2[i]) {
				num_of_moves=arr2[i]-arr1[i];
				num_of_moves_1 = arr1[i] + (10-arr2[i]);
				if(num_of_moves>num_of_moves_1) { min_move=min_move+num_of_moves_1; } else { min_move=min_move+num_of_moves; }
				//System.out.println("==> "+ min_move);
			}else {
				num_of_moves=arr1[i]-arr2[i];
				num_of_moves_1  = (10-arr1[i]) + arr2[i];
				if(num_of_moves>num_of_moves_1) { min_move=min_move+num_of_moves_1; } else { min_move=min_move+num_of_moves; }
			}
		}
		System.out.println("$$$$$ > "+ min_move);
		
	}
}
