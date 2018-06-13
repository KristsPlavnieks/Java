import java.util.Arrays;

public class UzdevumsSesiSakartotMasivu {

	public static void main(String[] args) {
		int[] masivs = {2,5,1,3,4,1,9};
		
		Arrays.sort(masivs);
		for(int i = 0; i < masivs.length; i ++)
			System.out.print(masivs[i] + ",");
	}

}
