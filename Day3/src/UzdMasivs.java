import java.util.Scanner;

public class UzdMasivs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int [] masivs = {1,3,5,6,7}; 
			for(int i=0; i< masivs.length; i++) {
				masivs[i] = (masivs[i] * masivs[i] * masivs[i]);
				System.out.println (masivs[i] + " "); 
				
			}
		}
		
			
		

	

}
