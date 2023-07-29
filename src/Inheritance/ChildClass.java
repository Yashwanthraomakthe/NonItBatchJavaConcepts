package Inheritance;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.substraction();
		System.out.println("-------------------------");
		ParentClass pc = new ParentClass();
		pc.substraction();

	}

	public void substraction() {

		System.out.println("Am doing substraction");
		System.out.println("Am doing substraction");
		System.out.println("Am doing substraction");
		System.out.println("Am doing substraction");
		System.out.println("Am doing substraction");
	}

}
