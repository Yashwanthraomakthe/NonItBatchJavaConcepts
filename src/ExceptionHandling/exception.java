package ExceptionHandling;

public class exception {

	public static void main(String[] args) {
		division();
	}

	public static void division() {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Exception occured");
		}

		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");

		int[] n = { 1, 2, 3 };
		for (int i = 1; i < 4; i++) {
			System.out.println(n[i]);
		}

	}

}
