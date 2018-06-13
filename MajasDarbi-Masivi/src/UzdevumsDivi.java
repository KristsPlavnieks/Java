import java.util.Scanner;

public class UzdevumsDivi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] array = { 5, 4, 6, 7, 9, 3, 5, 11, 22, 15, 17 };

		System.out.println("Ievadi skaitli: ");
		int sk = scanner.nextInt();

		int skaits = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == sk) {

				skaits += 1;
				System.out.println(i);
			}
		}

		System.out.println("ievaditais skaitlis: " + sk + " atkartojas " + skaits + " reizes" );

	}

}