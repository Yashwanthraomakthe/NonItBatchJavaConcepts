package Inheritance;

public class ParentClass extends GrandParent {

	public static void main(String[] args) {

		ParentClass pc = new ParentClass();
		pc.substraction();
		substraction1();
		pc.addition();

	}

	public void substraction() {
		System.out.println("Am doing substraction");
	}

	public static void substraction1() {
		System.out.println("Am doing substraction1");
	}

}
