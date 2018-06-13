import java.util.ArrayList;
import java.util.Arrays;

public class UzdevumsMasivi {

	private static boolean isIncreasing(ArrayList<Integer> listOfInts) {
		
		int previous = listOfInts.get(0);
		boolean isIncreasing = true;
		for (int i = 1; i < listOfInts.size(); i++) {
			// get -1 = 1, get = 2  , get-1 = 3, get = 4 
			if(listOfInts.get(i - 1) > listOfInts.get(i)) { // get -1 = 6, get = 2
				isIncreasing = false;
				break; // zin ka saraksts nav augoss nav jega talak parbaudit
			}
		}
		// ja ir isIncreasing==true augoss
		 //			System.out.println("isIncreasing " + isIncreasing);
		return isIncreasing;
		// veidojam jaunu ciklu, dilstosajam !  var ar trim metodem un pedejai vnk salidzinat ja nav augoss un dilstos tad tas !!
		
		
		// zinam vai saraksts ir augoss vai nav 
		
		// parbaudit vai ir dilstoss
	}
	
	private static boolean decreasing(ArrayList<Integer> listOfInts) {
		
		
		boolean decreasing = true;
		for(int j = 1; j <listOfInts.size(); j ++) {
			if(listOfInts.get(j - 1) < listOfInts.get(j)) { // < 
				decreasing = false;
				
				break;
			}
										
		}
		
		//System.out.println("Is not decreasing " + false);
		return decreasing;
		}
	
	public void elementOrder(ArrayList<Integer>listOfInts) {
		boolean isIncreasing = isIncreasing(listOfInts);
		boolean decreasing = decreasing(listOfInts);
		if(isIncreasing) {
			System.out.println(listOfInts + "increasing");
		}else if (decreasing) {
			System.out.println(listOfInts + "decreasing");
		}else {
			System.out.println(listOfInts + "is not increasing and decreasing ");
		}
		}
		
	

	public static void main(String[] args) {
		
		
		
		ArrayList list1 = new ArrayList(Arrays.asList ( 1, 2, 3, 5, 11 ));
		System.out.println(list1);
		isIncreasing(list1);
		
		ArrayList list2 = new ArrayList(Arrays.asList ( 9, 7, 5, 2, 1 ));
		System.out.println(list2);
		decreasing(list2);
		
		ArrayList list3 = new ArrayList(Arrays.asList ( 1, 7, 3, 5, 11 ));
		System.out.println(list3);
		isIncreasing(list3);
		
		

	}

}
