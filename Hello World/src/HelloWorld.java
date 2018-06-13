import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String abc = "ABC";							// [A,B,C]
		String def = new String("DEF");         	// gara versija 
		
		//String funkcijas
		String combinedStr0 = abc.concat(def);  	// ABCDEF    // savieno kopa 
		String combinedStr1 = abc + def;       		// ABCDEF
		int lenght = abc.length();					// 3   atgrizis realo ciparu
		boolean abcEq0 = abc.equals("def");			// false				// parbauda vai ir vienadi 
		boolean abcEq1 = abc == ("def");			// false				// taspats tik isak / 
		boolean b = "ABC".equals("abc");			// false
		boolean c = "ABC".equalsIgnoreCase("abc");  // true
		char charAt0 = abc.charAt(0);				// A
		String abcUpper = "abc".toUpperCase();		// ABC
		String acbLower = "abc".toLowerCase();		// abc
		boolean isEmpty0 = "".isEmpty();			// true
		boolean isEmpty1 = "A".isEmpty();			// false
		
		System.out.println(combinedStr0);
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int j = 0; j < 3; j++) {
			System.out.print("[" + arr2[j] + "],");
		}
		
		
		}
	{
		Scanner scanner = new Scanner(System.in); // vajag tikai vienreiz definet, darbosies visur ka console.readline
		System.out.println("Input string:");
		String str = scanner.next();
		System.out.println("Input int:");
		int in = scanner.nextInt();
		
		
	
		System.out.println("Input value: " + str + " " + in);
	}
		
		
	{
		System.out.print("Hello ");
		System.out.println("Hello World!");
		
		
	}	
	
	

}
