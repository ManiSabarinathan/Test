import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
	public static int numberNeeded(String first, String second) {

		
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			System.out.println(c + "==>"+ (c -'a'));
			lettercounts[c-'a']++;
		}
		System.out.println("LetterCount-1:: " + Arrays.toString(lettercounts));
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		System.out.println("LetterCount-2:: " + Arrays.toString(lettercounts));

		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();*/
		//String str1 = "fcrxzwscanmligyxyvym";
		String str1 = "sabari";
		String str2 =  "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		System.out.println(numberNeeded(str1, str2));
	}
}