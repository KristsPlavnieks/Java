import java.util.ArrayList;
import java.util.Arrays;

public class UzdevumsDivi {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 4, 2, 3, 1, 5, 2, 3, 1));

		ArrayList<Integer> listD = new ArrayList();
		// kopejam elementus no list uz list2
		for (Integer i : list) {
			// ja elements nav ieks list2 tad ieliekam
			boolean contains = listD.contains(i);	// ja listD={}, contains = false; 
			if (!contains) {   // contains == false
				listD.add(i);  // listD={1}
			}
			// ja jau ir - nedaram neko
			
		}
		// nems katru ciparu no list pec kartas i - 1 utt.
		for (Integer i : list) {
			
			boolean numberIsInListD = false;
			for (Integer j : listD) {
				if (j == i)
					numberIsInListD = true;
			}
			if (!numberIsInListD) {
				listD.add(i);
			}
		}
		System.out.println(listD);
	} 

}
