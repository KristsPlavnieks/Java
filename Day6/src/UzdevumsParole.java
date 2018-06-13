import java.util.Scanner;

public class UzdevumsParole {

	private static boolean isSafePassword(String password) {
		// vismaz 10 simboliem
		if (password.length() < 10) {
			System.out.println("Password is too short! ");
			return false;
		}
		int countOfNumbers = 0;
		// ja c nav ne burts ne cipars tad parole nav deriga
		for (char c : password.toCharArray()) {
			// true - ja ir burts , fasle - ja nav skaitlis
			if (Character.isAlphabetic(c) == true || Character.isDigit(c) == true) {
				// satur vismaz 2 ciparus
				if (Character.isDigit(c) == true) {
					countOfNumbers++;
				}
				} else {

					System.out.println("Password contains invalid sybols!");
					return false;
				}
			}
			if (countOfNumbers < 2) {
				System.out.println("Not enough digits in password!");
				return false;
			}
				// parole ir korekta
		System.out.println("Nice password, bro !");
				return true;		
		}
		
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		System.out.print(isSafePassword(password));
	}
}
