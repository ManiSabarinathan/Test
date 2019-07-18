import java.util.Arrays;

public class MergeArray {
	public static void main(String ...strings ) {
		int a[] = {1,23,31};
		int b[] = {11,24,35};
		/*
		 * i = 0;
		 * j = 0;
		 * 1<11
		 * c[0] = 1
		 * i=1
		 * j=0
		 * a[1] b[0]
		 * 
		 */
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<b.length-1;j++) {
				if(a[i]<b[j]) {
					c[k] = a[i];
					i++;
					k++;
				}else if (a[j]> b[j]) {
					c[k] = b[j];
					j++;
					k++;
				}
				
			}
		}
		System.out.println(Arrays.toString(c));
		
	}
}
