import java.util.ArrayList;

public class UzdevumsCetri {

	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList();
		array1.add(1);
		array1.add(5);
		array1.add(6);
		array1.add(4);
		
		ArrayList<Integer> array2 = new ArrayList();
		array2.add(8);
		array2.add(9);
		
		array1.addAll(array2);
		
		for(int i = 0; i < array1.size(); i++) {
			int sk = array1.remove(i);
			sk = sk * sk *sk;
			array1.add(i,  sk);
			
		}
		for(Integer i : array1 ) {
			System.out.println(i);
		}
			
	}

}
