import java.util.function.Predicate;

public class PredicateTest {
	//Prdicate will return True or False based on the input
	public static void main(String ...strings ) {		 
		Predicate<String> predicateString = (s) -> s.equals("JuJu");
		
		
		//And -  Or - Negate with Predicate
		Predicate<String> predicateAnd = predicateString.and( (s) -> s.length() >3 );
		System.out.println(predicateAnd.test("JuJu"));
		
		Predicate<String> predicateOr = predicateString.or((s) -> s.substring(0,2).equals("Ju"));
		System.out.println(predicateOr.test("Jju"));
		
	}
}
