
public class test {
	public static void main(String ...strings ) {
		String url="http://sample.com/ecomtest/index.php?route=api/";
		String baseUrl=url.split(".com/")[0]+".com/";
		String queryUrl=url.split(".com")[1];
		
		System.out.println(url);

		System.out.println(baseUrl);

		System.out.println(queryUrl);
		
	}
}
