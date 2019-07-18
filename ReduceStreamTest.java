import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStreamTest {
	public static void main(String ...strings ) {
		List<String> mylist = Arrays.asList("juju", "Papuuu", "sabarinathan");
		
		//Reduce to single value 
		//Use the reduce method to get the single value
		//Reduction operation
		
		Optional<String> bigstringOptional = mylist.stream().reduce((str1,str2)-> str1.length()>str2.length()?str1:str2);
		if(bigstringOptional.isPresent()) System.out.println(bigstringOptional.get()); 
	}
}
