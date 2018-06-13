
public class Uzdevumi {

	public static void main(String[] args) {
		
		int [] arr = new int[3]; /// izveidots tuks masivs [], [], [] 
		arr[0] = 1; // kura masiva elementa gribam ko ierakstit 
		arr[1] = 4;
		arr[2] = 5;
		int [] arr2 = arr.clone();   // noklonejam masivu  [1], [4], [5]
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		int [] arr3 = {1,3,4,5};   // zinot jau vertibas
		System.out.println("Length is : " + arr3.length);
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");  
		}
		
		Integer.parseInt("5");
	}

}
