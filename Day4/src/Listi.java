import java.util.ArrayList;
import java.util.Arrays;

public class Listi {

	public static void main(String[] args) {
		// Integer - vesels skaitlis
		// Double  - peldosa komata
		// Boolean - true/false
		ArrayList<String> arrayList = new ArrayList();
		
		arrayList.add("ABC"); //index = 0
		arrayList.add("CDE"); //index = 1
		arrayList.add("FGH"); //index = 2
		
		for(String str : arrayList) {
			System.out.println(str);
		}
		
		System.out.println();
		/*
		//Parastais for cikls ar cikla skaititaju
		for(int j = 0; j < arrayList.size(); j++);{
			System.out.print(arrayList.get(j) + ", index = " + j);
			
		}
		*/
		
		// izdzes visu saraksta saturu
		// arrayList.clear();
		//saraksta izmers
		System.out.println("arrayList size is = " + arrayList.size());
		
		//arrayList.remove(0);
		arrayList.remove("ABC");  // izdzes elementu
		
		for(String str : arrayList) {
		System.out.println(str + ",");
		}
		
		// isais veids
		ArrayList<String> arrayList2 = new ArrayList(Arrays.asList("zz", "aa", "uu"));
		// Pievieno visus elementus no arrayList2 ieks arrayList
		arrayList.addAll(arrayList2);
		
		// Ja saraksta izmers ir 0 tad true, citadak false
		boolean empty = arrayList.isEmpty();
	}
	}

	

