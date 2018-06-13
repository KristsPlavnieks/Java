
public class UzdevumsPieci {

	public static void main(String[] args) {
		String[] arr1 = {"ABC","CDE","EFG","XEQ","SEF"};
		String[] arr2 = {"WWW","XEQ","EFG","XEQ","AAA"};
		
		
		for(int i =0; i<arr1.length; i++) {
			
			for(int j =0; j<arr1.length; j++) {
				
				if(arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}

}
