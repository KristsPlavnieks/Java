
public class UzdevumsViens {

	public static void main(String[] args) {
		int[] masivs = { 1, 5, 2, 10, 22, 105, 2, 5 };

		int sum = 0;
		for (int i = 0; i < masivs.length; i++) {

			if (masivs[i] >= 10 && masivs[i] < 99) {

				masivs[i] = 0;

			} else if (masivs[i] != 0) {

				sum += masivs[i];

			}

		}

		System.out.println(sum);
	}

}
