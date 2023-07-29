package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("A");
		list.add(10);
		list.add("Java");
		list.add("A");
		
		System.out.println(list);
		
		list.remove("A");
		
		System.out.println(list);
		
		list.add(2, "B");
		
		System.out.println(list);
		
		
		
		

	}

}
