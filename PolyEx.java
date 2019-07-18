


public class PolyEx {
	public void display(int age, String name) {
		System.out.println("Age and Name");		
	}
	public void display(String name , int age) {
	   	System.out.println("Name and Age");
	}
	
	public String foo(String s) {
		return "GoodJob";
	}
	public int foo(String s,int j) {
		return 20;
	}
	
	public static void main(String ...strings ) {
		PolyEx ob = new PolyEx();
		ob.display(12, "juju");
		ob.display("papu", 26);
	}
}
