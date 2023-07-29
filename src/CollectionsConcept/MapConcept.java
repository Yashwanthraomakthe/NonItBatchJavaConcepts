package CollectionsConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("101", "Core");
		map.put("102", "Java");
		map.put("103", "Selenium");
		
		System.out.println(map);
		
		Set keys = map.keySet();
		System.out.println(keys);
		
		
		Collection values = map.values();
		System.out.println(values);
		

	}

}
