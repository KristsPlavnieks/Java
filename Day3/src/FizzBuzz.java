import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Masivs ar skaitliem
		String [] array = {"1","2","3","5","8","30","15","12","7"}; 
		// iet cauri masivam, lidz sasniedz garumu
		for(int i = 0; i < array.length; i++) {
			//1.parveidot array[i] elementu uz int tipu , konvertejam String -> int
			String str = array[i];
			int a =	Integer.parseInt(str);			
			//2.parbaudit va dalas 3/5
			if(a % 3 == 0 && a % 5 == 0) {
					// samainam masiva vertibu
				array[i] = "FizzBuzz";		
						
			}else if (a % 3 == 0) {
				// samainam masiva vertibu
				array[i] = "Fizz";
			}else if (a % 5 == 0) {
				// samainam masiva vertibu
				array[i] = "Buzz";
			}
			System.out.print(array[i] + " ");	
															
		}
		
				
	}

}
