import java.util.Random;
import java.util.Scanner;

public class Nodarbiba_2 {
	
	Auto auto;
	enum Auto{
		Audi, Golf, Volkswagen;        // parasti taisa atseviskas klases 
		public void toString(Auto a) {
			System.out.println(a);
		}
	}
	

	public static void main(String[] args) {
	/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skaitlis x ");
		int sk1 = scanner.nextInt();
		System.out.println("Skaitlis  ");
		int sk2 = scanner.nextInt();
		int sum = sk1+sk2;
		int sum1= (sum > 10 && sum < 20 ) ? 20: sum;
		System.out.println("Summa:" + sum1);
	 */
		
		
		Auto auto = Auto.Golf;
		switch(auto) {
		case Golf: 
			System.out.println("A");
			
			break;
			
		case Audi:
			System.out.println("B");
			
			break;
		
		default:
			System.out.println("C");
			break;
		}
		
		String patskani = "aeiu";
		Scanner scanner = new Scanner(System.in);		// 7.uzd
		
		String input = scanner.next().toLowerCase(); //a
		
		if(patskani.contains(input)) {
			System.out.println("Patskanis");
		}
		
		int number = new Random().nextInt(11);				//10.uzd
		System.out.println("Uzmini skaitli no 1 lidz 10");
		int skaitlis = scanner.nextInt();
		
		while(skaitlis > number || skaitlis < number){
			int skaitlis2 = scanner.nextInt();
			System.out.println("Megini velreiz");
				
				
			}
				
			
			for(int i = 1; i <= 10; i ++) {
				for(int j = 0; j <10; j++) {
	
					if((i+j) % 3 == 0 ) {
					System.out.println(i+""+j+" " + i + " + " + j + " = " + (i + j));		// 11.uzd
					}
				}
			}
															
			
					
						
		}	
							
		
		}
	
		
	
	
	
