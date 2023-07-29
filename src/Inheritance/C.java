package Inheritance;

public class C extends A{

	public static void main(String[] args) {
		sub();
		
		C c = new C();
		c.addition();

	}
	
	public static void sub() {
		System.out.println("Substraction");
	}

}
