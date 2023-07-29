package BasicConcepts;

public class VariablesConcept {

	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		VariablesConcept vc = new VariablesConcept();
		System.out.println(y);
		System.out.println(vc.x);
		vc.addition();

	}

	public void addition() {
		System.out.println(x);
		System.out.println(y);

	}
}
