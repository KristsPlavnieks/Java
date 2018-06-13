import java.util.ArrayList;

public class UzdevumsTris {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("aDs");
		arrayList.add("add");
		arrayList.add("dd");
		arrayList.add("eee");
		
		
		
		for(int i = 0; i < arrayList.size(); i++) {
													//{"aDs", "add", "dd", "eee"}		
													//{ "add", "dd", "eee"}
			String str = arrayList.remove(i);  		// i = 0, str = 'a'
			
			str = str.toUpperCase();		   		// i = 0, str = 'A'	
			arrayList.add(i, str);			  		// ieliekam tani pasa saraksta {"ADS", "add", "dd", "eee"}
			
		}
		for(String str : arrayList) {
			System.out.println(str);
		}
	}

}
