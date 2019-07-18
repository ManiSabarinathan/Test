import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PairAnagramTest {
	static Set<String> set = new HashSet<String>();
	public static void main(String ...strings ) {
		PairAnagramTest ob = new PairAnagramTest();
		//String s1="sabari";
		String mainString="kkkk";
		//String mainString="ifailuhkqq";
		//String mainString="cdcd";
		//String mainString="abba";
		char cArray[]=mainString.toCharArray();
		ArrayList<String> list = new ArrayList<String>();
		int finalCount =0;
		String tempStr="";
		for(int pairLimit=1;pairLimit<mainString.length();pairLimit++) //
		{
			System.out.println("pairLimit:: " + pairLimit);		
			
		for(int w=0;w<mainString.length();w++) {
		//System.out.println("Loop :: " + w);	
		
		for(int jj=w;jj<mainString.length()-(pairLimit-1);jj++) {
			
			for(int q=jj;q<jj+pairLimit;q++) {
				tempStr+=cArray[q];				
			}
			list.add(tempStr);			
			tempStr = "";
			}
			 if(!list.isEmpty() && list.size()>1) {
				 
				 finalCount+=ob.findPair(list);
			 }
		   list.removeAll(list);
		}
		}
		System.out.println("finalcount==> " + finalCount);
		
	}
	public int  findPair(ArrayList<String> list) {		
			  
			  String[] sArr = list.toArray(new String[list.size()]);
			 
			 int i=0;
			 int count=0;
			 while(i<sArr.length-1) {
				 if( isAnagram(sArr[0],sArr[++i])) {
					 count++;
				 }
			 }
			System.out.println("Count :: " + count);
			return count;				
	}
	
	
	
	public boolean isAnagram(String s1, String s2) {
	
		char cAr1[] = s1.toCharArray();
		char cAr2[] = s2.toCharArray();
		
		boolean outValue=false;
		
		if(cAr1.length != cAr2.length) {
			return false;
		}
		int c1[] = new int[26];
		int c2[] = new int[26];
		
		
		for(int i=0;i<cAr1.length;i++) {
			c1[cAr1[i] - 'a']++;
		}
		for(int j=0;j<cAr2.length;j++) {
			c2[cAr2[j] - 'a']++;
		}
		//System.out.println(Arrays.toString(c1));
		//System.out.println(Arrays.toString(c2));
		for(int k=0;k<c1.length;k++) {
			if(c1[k] != c2[k]) {
				outValue=false;
				break;
			}else {
				outValue=true;
			}
			
		}
		
		return outValue;
	}
}
