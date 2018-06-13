import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String,Person>mapOfPersons = new HashMap();
		mapOfPersons.put("090183-20918", new Person());
		Person person = mapOfPersons.get("090183-20918");
		boolean containsP = mapOfPersons.containsKey("090183-20918");
		person = mapOfPersons.remove("090183-20918");
		
		
		// Lidzigs arrayList, bez duplikat elementiem
		Set<String> set = new HashSet();
		set.add("A");
		set.add("B");
		set.add("A");
		System.out.println(set.size());
		
		

	}

}
