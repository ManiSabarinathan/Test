class Parent{
	public static void amethod() {
		System.out.println("Parent static method implementation...");
	}
	
	public final void finalMethod() {
		System.out.println("Final method in Parent class");
	}
	
	private void privateMethod() {
		System.out.println("Private method in Parent class");
	}
}
public class OverrideTest extends Parent {
	public static void amethod() {
		System.out.println("Child static method implementation....");
	}
	

	
	public static void main(String ...strings ) {
		Parent p1 = new OverrideTest();
		p1.amethod();
		
		Parent p2 = new OverrideTest();
		p2.finalMethod();
	}
}
