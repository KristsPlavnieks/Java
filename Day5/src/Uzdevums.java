
public class Uzdevums {

	

		public static int cubeNumber (int skaitlis) {
		return (skaitlis * skaitlis * skaitlis);
		}
		public static void main(String[] args) {
			int fiveCube = cubeNumber(5);
			int fourCube = cubeNumber(4);
			int threeCube = cubeNumber(3);
			
			int twoSevenCube = cubeNumber(cubeNumber(3));
			System.out.println(threeCube + "," + fourCube + "," + fiveCube + ",");
		}
	}


