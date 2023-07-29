package Inheritance;

public class GrandParent {

	public static void main(String[] args) {

		GrandParent gp = new GrandParent();
		gp.addition();
		addition1();

	}

	public void addition() {
		System.out.println("Am doing addition");
	}

	public static void addition1() {
		System.out.println("Am doing addition1");
	}

}
