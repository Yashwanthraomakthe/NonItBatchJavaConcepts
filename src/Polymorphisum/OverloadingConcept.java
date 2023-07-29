package Polymorphisum;

public class OverloadingConcept {

	public static void main(String[] args) {
		OverloadingConcept ol = new OverloadingConcept();
		ol.addition();
		addition(4, 2);
		addition("Core", "Java");
		
	}
	
	public static void addition(int i, int j) {
		int c = i+j;
		System.out.println("addition of two numbers is " + c);
		
	}

	public void addition() {
		System.out.println("Am no argument addition");
	}
	
	public static void addition(String a, String b) {
		String fullName = a+b;
		System.out.println("addition of two numbers is " + fullName);
		
	}
	

}
