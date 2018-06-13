
public class UzdevumsCetri {

	public static void main(String[] args) {
		int[] array = { 1,4,2,5,13,24,51,6,7,9,11};
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < array.length; i ++) {
			if(array[i] % 2 == 0) {
				even += 1;
			}
			else {
				odd += 1;
			}
				
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
	

}
