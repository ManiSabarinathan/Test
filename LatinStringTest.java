import org.apache.commons.text.StringEscapeUtils;

public class LatinStringTest {
	public static void main(String ... args) {
		//String inputString = "Andr&eacute;ine Thank U Cardigan";
		String inputString = "Sunscape Ombr&eacute; Cardigan";
		//"&eacute;"
		 String strUnEscapeHTML = StringEscapeUtils.unescapeHtml4(inputString);
		 System.out.println(strUnEscapeHTML);
	}
}
