import java.util.Arrays;

public class UzdevumsSeptini {

	public static void main(String[] args) {
		// Bouble sort

		int[] arr = { 10,5, 3, 7, 1, 9, 0 };
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
					// arr.length-i, pec katras areja cikla iteracijas, kartejais lielakais elements ir beigas
			for (int j = 1; j < (arr.length - i); j++) {
					// ieprieksejais elements ir mazaks - jamaina vietam 
				if (arr[j - 1] > arr[j]) {	
					// arr[j-1] jasamaina ar arr[j]
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		
		for (int num : arr) {
			System.out.print(num + ",");
		}

	}

}
