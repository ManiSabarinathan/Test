import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputTest {
	public static void main(String ...strings ) {
		String[] actionArray ;
		Scanner scanner = new Scanner(System.in);
		int inputArraySize = scanner.nextInt();
		String inputArray = scanner.next();
		List<String> inputStringList = Arrays.asList(inputArray.split("\\s", inputArraySize));
		List<Integer> inpuIntegerList = inputStringList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int maxActivity = scanner.nextInt();
		//Loop till the number of action
		// Action- Insert/Delete
		// Index - Index to perform this action
		for(int i=0;i<maxActivity;i++) {
			String action = scanner.next();
			
			if(action.equalsIgnoreCase("Insert")) {
				actionArray = scanner.next().split("\\s");
				for(int j=0;j<actionArray.length;j++) {
					Integer indexFoxObject = Integer.parseInt(actionArray[0]);
					Integer object = Integer.parseInt(actionArray[1]);
					inpuIntegerList.add(indexFoxObject, object);
				}
 			} else if(action.equalsIgnoreCase("Delete")) {
 				   inpuIntegerList.remove(scanner.nextInt());
				}
			}
		scanner.close();
		}
}
