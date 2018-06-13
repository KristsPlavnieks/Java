
public class UzdevumsTris {

	public static void main(String[] args) {
		int[] array = { 7, 2, 8, 9, 21, 2, 5, 3, 1, 5, 2, 12, 21 };

		int mazakais = array[0];
		int otrsmazakais = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < mazakais || array[i] < otrsmazakais) {
				if (array[i] < mazakais) {
					otrsmazakais = mazakais;
					mazakais = array[i];
					

				}
				else {
					otrsmazakais = array[i];
				}
			}
		}
		System.out.print(otrsmazakais);

	}

}