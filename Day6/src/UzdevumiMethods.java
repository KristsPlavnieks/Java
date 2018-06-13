
public class UzdevumiMethods {

	public static int smallestNumber(int x, int y, int z) {
		 x = 3;
		y = 4;
		z = 2;
		if (x < y && x < z) {
			return x;
		} else if (y < x && y < z) {
			return y;
		} else {
			return z;
		}
	}

	public static void main(String[] args) {
		System.out.println(smallestNumber(3,4,2));
		
	}

}
