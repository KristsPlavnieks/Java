import java.util.ArrayList;
import java.util.Arrays;

public class NodarbibaUzd17 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("this","is","lots","of","fun","for","every","Java","programmer"));
				
		ArrayList list2 = new ArrayList();
		for(String str: list) {      // Str === this, list2={}
		
			// japarbauda vai str ir garuma 4 
			if(str.length() == 4) {  // this.length == 4
				list2.add("****"); 	 // pievieno ****
			}
			// ja ir pievieno ****
			list2.add(str);  		 // pievieno pasu elementu list2= {"****", "this"}
		}
		System.out.println(list2);
	}

}
