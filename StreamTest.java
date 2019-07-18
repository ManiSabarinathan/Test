import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String ...strings ) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person(123,"Juju"));
		pList.add(new Person(423, "Papu"));
		
		//Filter the list of persons whose id>150
		List<Person> filtererPersonList = pList.stream().filter((p)-> p.getId()>150).collect(Collectors.toList());
		filtererPersonList.forEach((p)-> System.out.println(p.getId() +" :: " + p.getName()));
		
		//fetch only names from the list and push it into the newList
		List<String> personNameList = pList.stream().map((p)-> p.getName()).collect(Collectors.toList());
		System.out.println(personNameList);
		
	}

}

class Person {
	public int id;
	public String name;
	
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
