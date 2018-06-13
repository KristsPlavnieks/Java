
public class UzdevumsApgrieztiMasiviArMetodem {

	public static int[] reverseArray(int[] arr) {
		int[] arr2 = new int[arr.length]; // arr.length = 5
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) { // i = 4, i = 3, i = 2, i = 1, i = 0
			arr2[index] = arr[i]; // i = 4 = > 0, i = 3= > 1
			index++;			  // galbas jaunas vertibas
		}

		return arr2;

	}

	public static String[] reverseArray(String[] arr) {

		String[] arr2 = new String[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[index] = arr[i];
			index++;
		}
		return arr2;
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 5, 2 };
		for (int i : arr) {

		}
		System.out.println();
		arr = reverseArray(arr);
		for (int i : arr) {
			System.out.print(i + ",");
		}
		String[] arrStr = new String[] { "AB", "CDE", "FEG", };
		for (String str : arrStr) {

		}
		System.out.println();
		arrStr = reverseArray(arrStr);
		for (String str : arrStr) {
			System.out.print(str + ",");

		}

	}

}