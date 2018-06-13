
public class OverLoadingUzd {
	public static String combineString(String a, String b, String c, String d ) {
		
		return a+b+c+d;
	}
	
public static String combineString(String a, String b, String c ) {
		// ieiet augseja combineString panem "vajadzigo" un izvada
		return combineString(a,b, c, "");
	}

public static String combineString(String a, String b ) {
	// panems no augsas treso "C"
		return combineString(a,b, "");
}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(combineString("A", "B","C","D"));   // DCBA  samaina pirmaja return secibu uz otru pusi!
		System.out.println(combineString("A", "B", "C"));	   //CBA
		System.out.println(combineString("A", "B"));		   //BA
		
		

	}

}
