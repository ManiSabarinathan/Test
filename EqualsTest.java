class Employee {
	
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("Show method");
	}
	
	@Override
	public boolean equals(Object o) {
		
		//If comparing with the same object type
		if(o == this ) {
			return true;
		}
		
		//If comparing with the different object type
		if (!(o instanceof Employee)){
			return false;			
		}
		
		
		// If its a Same Object type then check whether the current value with 2nd object value
		Employee ee = (Employee) o;
		return (name == ee.name && age == ee.age); 
	}
}

public class EqualsTest {

	public static void main(String ...strings ) {
		Employee e1 = new Employee("Juju",7);
		Employee e2 = new Employee("Juju",7);
		
		System.out.println(e1 == e2);      //false
		System.out.println(e1.equals(e2)); //false
		//e1 = e2;
		//System.out.println(e1 == e2);      //true (Both references pointing to the same object
		//System.out.println(e1.equals(e2)); //true
		
	}
}
