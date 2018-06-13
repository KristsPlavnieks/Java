import java.util.Scanner;

public class Uzdevums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadi skaitli: ");
		int x = scanner.nextInt();
		System.out.println("Ievadi otru skaitli: ");
		int y = scanner.nextInt();

		System.out.println("Summa: " + (x + y)); // vai jauna mainigaja int res = x + y;
		// ievadam a,b,c 
		System.out.println("Ievadi skaitli: ");
		int a = scanner.nextInt();
		System.out.println("Ievadi otru skaitli: ");
		int b = scanner.nextInt();
		System.out.println("Ievadi otru skaitli: ");
		int c = scanner.nextInt();
		// izvadam videjo
		double vid = (a + b + c) / 3.0;

		System.out.println(vid);
		
		String z = scanner.next();// konvertacija, gudrak tapat ar int ka mes to darijam !
		String s = scanner.next();
		String f = scanner.next();
		int zInt = Integer.valueOf(z);
		int sInt = Integer.valueOf(s);
		int fInt = Integer.valueOf(f);
		double dbl = Double.valueOf("12.3");
					Boolean.valueOf("false");
		double videja = (zInt + sInt + fInt) / 3.0;

	}

}
