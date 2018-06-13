
public class UzdevumsM {

	public static void main(String[] args) {
		
		
		int[] array = { 0, 4, 0, 7, 8, 9, 0, 1 };
		  // Maintaining count of non zero elements
		  int count = -1;
		  // Iterating through array and copying non zero elements in front of array.
		  for (int i = 0; i < array.length; i++) {
		      if (array[i] != 0)
		          array[++count] = array[i];
		  }
		  // Replacing end elements with zero
		  while (count < array.length - 1)
		      array[++count] = 0;
		  for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		  }
	}
}	
			
		
	
	


