interface Reverse{
	String rev(String s);
}

public class StoreNameReverse {
	public static void main(String ...strings) {
		
		Reverse ref = (String str) -> {
			String reverstring=""; 
			for(int i=str.length()-1;i>=0;i--) {
				reverstring+=str.charAt(i);
			}
			
			return reverstring;
		};
		
		System.out.println(ref.rev("Malayalam"));
	}
}
