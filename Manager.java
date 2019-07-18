import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
	Map<Employee, List<Employee>> employeeMap = new HashMap<>();
	
	public void putEmployee(Employee emp, List<Employee> listEmployee) {
		System.out.println("Emp==> " + emp);
		System.out.println("List==> " + listEmployee);
		employeeMap.put(emp,listEmployee);
	}
	
	public List<Employee> getEmployee(String name) {
		//find the employee exist in the map
		System.out.println("Employee Map :: " + employeeMap);
		for(Map.Entry entry: employeeMap.entrySet()) {
			System.out.println(entry.getKey() +" :: "+  entry.getValue());
		}
		//System.out.println("Contains Key ==>  " + employeeMap.containsKey(new Employee(100,name)));	
		List list = employeeMap.get(new Employee(100,name)); 
		System.out.println(list);
		return list;
		
	}
	
	public void initEmployee() {
		putEmployee(new Employee(100,"sabari"), Arrays.asList(
											new Employee(10,"AAA"),
											new Employee(20,"CCC"),
											new Employee(30,"XXX")				
				));
		
		putEmployee(new Employee(200,"nathan"), Arrays.asList(
											new Employee(60,"DDD"),
											new Employee(90,"JJJ")						
				));
											
	}
	
	public static void main(String ...strings ) {
		Manager ma = new Manager();
		ma.initEmployee();
		System.out.println("==> " + ma.getEmployee("sabari"));
	}
}
