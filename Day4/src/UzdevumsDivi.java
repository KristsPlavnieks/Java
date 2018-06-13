
public class UzdevumsDivi {

	public static void main(String[] args) {
		String [] arr = {"ABC","CDE","FGA","CDE","ABC","ABO",};
		// null,null,null,null,null,null,
		String [] arrD = new String[arr.length];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			String str = arr[i]; 
			boolean isDuplicate = false;  // sakuma pienem ka nav 
			// parbaudit arr vai tur jau ir str("ABC")
			for(int j = 0; j < arrD.length; j++) {
				String str2 = arrD[j];
				if(str.equals(str2)) {
					isDuplicate = true;
				}
			}
			
			if(!isDuplicate){			//Vai kada no arrD vertibam bija vienada ar str
										//Ja nav tad rakstam ieksa
										//ja ir tad neko nedaram
				arrD[index] = str;
				index = index + 1;
			}
			
		}
		
		String [] arr3 = new String[index];  // izveido jaunu masivu 
		System.arraycopy(arrD,  0,  arr3,  0,  index); // parkope bez null
		
		for(String str : arr3) { 
			
			System.out.println(str + ",");
		}
		
		
	}

}
