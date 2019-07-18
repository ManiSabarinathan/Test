import java.util.Arrays;

public class SubStringMatchingTest {
	public static void main(String ... strings) {
		SubStringMatchingTest ob = new SubStringMatchingTest();
		String s1 = "aardvark";
		String s2 = "apple";
		//System.out.println(ob.isMatch(s1, s2));		
		System.out.println(ob.isMatchSimplified(s1, s2));		
	}
	
	public String isMatch(String s1, String s2) {
		char[] c1Arr = s1.toCharArray();
		char[] c2Arr = s2.toCharArray();
		boolean ismatchvalue=false;
		
		for(int i=0;i<c1Arr.length;i++) {
			for(int j=0;j<c2Arr.length;j++) {
				if(c1Arr[i]==c2Arr[j]) {
					ismatchvalue=true;
					break;
				}
			}
			if(ismatchvalue==true)
			{
				break;
			}
		}
		return (ismatchvalue?"YES":"NO");
	}
	
	public String isMatchSimplified(String s1,String s2) {
		
		char charS1Arr[] = s1.toCharArray();
		char charS2Arr[] = s2.toCharArray();
		
		int charArr1[] = new int[26];
		int charArr2[] = new int[26];
		boolean outvalue=false;
		
		for(int i=0;i<charS1Arr.length;i++) {
			charArr1[charS1Arr[i] - 'a']++;				
		}
		for(int i=0;i<charS2Arr.length;i++) {
			charArr2[charS2Arr[i] - 'a']++;				
		}
		for(int j=0;j<charArr1.length;j++) {
			if	(charArr1[j]>=1 && charArr2[j]>=1) {
				outvalue=true;
				break;
			}
		}		
		System.out.println(Arrays.toString(charArr1));
		System.out.println(Arrays.toString(charArr2));
		return (outvalue?"YES":"NO");
	}
}
