
interface A {
	public default void show() {
		System.out.println("Show in Class A");
	}
}

interface B {
	public default void show() {
		System.out.println("Show in Class B");
	}
}



public class InterfaceDefaultTest implements A, B{

	@Override
	public void show() {
		System.out.println("Main Class show method ");
		A.super.show();
		B.super.show();
	}
	
	public static void main(String ...strings ) {
		InterfaceDefaultTest obj = new InterfaceDefaultTest();
		obj.show();
	}
	

}
