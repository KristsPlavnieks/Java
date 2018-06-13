
public class Uzdevumi {

	public static void main(String[] args) {
		int [] arr = {0,4,0,7,8,9,0,1};
		
		//0,4,0,7,8,9,0,1 i=0, index=0
		//4,4,0,7,8,9,0,1 i=1  index=1
		//4,4,0,7,8,9,0,1 i=2  index=1
		//4,7,0,7,8,9,0,1 i=3  index=2
		//4,7,8,7,8,9,0,1 i=4  index=3
		//4,7,8,9,8,9,0,1 i=5  index=4
		//4,7,8,9,8,9,0,1 i=6  index=4
		//4,7,8,9,1,9,0,1 i=7  index=5
		
		
		int index = 0;
		for(int i = 0 ; i < arr.length; i ++ ) {
			// parbaudam vai skaitlis masiva ir 0 
			if(arr[i] !=0) {
				arr[index] = arr[i];
				//Ja nav parbidam pa kreisi uz pirmo brivo vietu
				index++;
			}
		}
		// 4,7,8,9,1,9,0,1 i=7, index=5
		// Sakam apstradi no index mainiga vertibas
		//4,7,8,9,1,9,0,1  i=5
		//4,7,8,9,1,0,0,1  i=6
		//4,7,8,9,1,0,0,0  i=7
		for(int i = index; i < arr.length; i++) {
			arr[i] = 0;
		
		}
		// Izdrukajam masiva saturu, ar for ciklu, jo bez nevar. 
		for(int i = 0; i <arr.length; i ++) {
			System.out.print(arr[i] + ",");
		}

	}

}
