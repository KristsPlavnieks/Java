
public class UzdevumsDivi {
		
	public static double averageArr(int[] masivs) {
		double sum = 0.00;
		for(int number : masivs) {
			sum = sum + number;
		}
		return sum/masivs.length;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(averageArr(new int [] {4,5,2,1,3,2,1,8}));
	}

}
