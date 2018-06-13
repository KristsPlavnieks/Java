import java.util.Scanner;

public class Uzdevumi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your name: ");
		String vards = scanner.next();
		String normalsize = vards.substring(0, 1).toUpperCase().concat(vards.substring(1, vards.length()));
		
		
		System.out.println("Hey there: " + vards);

		
		
		System.out.println("Input number: ");
		int skaitlis = scanner.nextInt();
		
		
		boolean skaitlisP;{
			if(skaitlis %2 == 0) {
				skaitlisP = true;
				System.out.println("Number is even:  " + skaitlisP);     // int four = 4; System.out.println("Number is even :" + (four % 2 == 0 ) );  ari bus, true vai false
				
			}else {
				skaitlisP = false;
				System.out.println("Number is odd: " + skaitlisP);
			}
		}
		long startTime = System.currentTimeMillis();
		System.out.println("Input number one: ");
		int sk1 = scanner.nextInt();
		System.out.println("Input number two: ");
		int sk2 = scanner.nextInt();
		
		System.out.println("Summa: " + (sk1 + sk2));
		System.out.println("Starpiba: " + (sk1 - sk2));
		System.out.println("Dalijums: " + ((double)sk1 / sk2));
		System.out.println("Dalijuma atlikums: " + (sk1 % sk2));
		System.out.println("Summa: " + (sk1 * sk2));
		
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed time in milliseconds: " + estimatedTime);
		}
		
		
	}
		
		

