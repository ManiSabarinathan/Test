import java.util.HashMap;
import java.util.HashSet;

public class AnagramRemoveCharTest {
	
	public static void main(String ...strings ) {
		String str1 = "fcrxzwscanmligyxyvym";
		String str2 =  "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		//String str1 = "womanwcac";
		//String str2 =  "zzxshowmanwwwwwww";
				
		char aChar[] = str1.toCharArray();
	    char bChar[] = str2.toCharArray();
	    
		AnagramRemoveCharTest ob = new AnagramRemoveCharTest();
		//System.out.println(ob.checkAnagram(arr1, arr2));
		
		//Number of characters to be removed from both arrays to make it anagram
		System.out.println("Number of Elements removed to make it Anagram:: " +ob.removeCharAnagram(aChar, bChar));
		
		String str = "190365838506";
		System.out.println("Hashcode for the string :: "+ str.hashCode());
		System.out.println("Mod of Hashcode to get the index value :: "+ str.hashCode()%16);
		
		
	}
	public boolean checkAnagram(String arr1[], String arr2[]) {
		boolean status=false;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) { return false; }
			else
			status= true;
		}
		return status;
	}
	
	public int removeCharAnagram(char arr1[], char arr2[]) {
		HashSet hset = new HashSet();
		int duplicateCharCount = 0;
		
		for(int j=0;j<arr1.length;j++) {
			for(int i=0;i<arr2.length;i++) {
				if(arr2[i] == arr1[j]) {
						hset.add(arr2[i]);					
				}
			}
		}
		
		System.out.println("setSize:: "+ hset.size());
		
		return ((arr1.length+arr2.length)-(hset.size()*2));
	}

}
