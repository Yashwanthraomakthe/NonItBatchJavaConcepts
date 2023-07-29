package BasicConcepts;

public class Arrays {

	public static void main(String[] args) {
		String[] names = { "Core", "Java", "Class" };
		
		String name1 = "Core";
		String name2 = "Core";		
		String name13 = "Core";
		String name14 = "Core";
		String name41 = "Core";
		
		
		System.out.println(names[1]);
	
		int noOfStudent = names.length;
		
		for (int i = 0; i < noOfStudent; i++) {
			System.out.println(names[i]);
		}

	}

}
