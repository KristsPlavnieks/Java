import java.util.Scanner;

public class UzdDivi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println("(n = " + i + ") Cube of the "+(i*i*i) +" is");   // Cube of the "+Math.pow(i,3)+ "is"    ari ta var. 
		}   // japalabo
		
		
		System.out.println("Ievadi skaitli: ");
		int z = scanner.nextInt();
		
		for( int i = 1; i <= z; i++) {			// Katra rinda
			
			for(int j = 1;j <= z - i ; j++) { 	//Atstarpes pirms cipariem
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {   	//Ciparus
				System.out.print(i + " ");
				
			}
			System.out.println();
		}
		
		String word = scanner.next();
		
		// 1.variants
		boolean isPalindrome = true;
		for(int i = 0; i < word.length(); i++) {
			// rotator
			if(word.charAt(i) != word.charAt(word.length() - (i+1))) {
				
				//word.charAt(i) - r   <- i-tais no kreisas
				//word.charAt(word.length() - (i+1)) - s   <- i-tais no labas
				isPalindrome = false;
			}
			
		}
		
			
		// 2.variants - isa versija visam 
		/*String reverse = new StringBuilder(word).reverse().toString();
		System.out.println("Ir palindroms:" + word.equals(reverse));
		*/
		
		
		
		//3.variants
		char [] wordArr = word.toCharArray();
		char [] reverseArr = new char[wordArr.length];
		
		
		int reverseArrIndex = 0;
		for(int i = (wordArr.length-1); i >= 0; i--) {
			reverseArr[reverseArrIndex] = wordArr[i];
			reverseArrIndex++;
		}
		
		boolean irPalindrome = true;
		for(int i = 0; i < wordArr.length; i++) {
			if(wordArr[i]!=reverseArr[i]) {
				System.out.println("Nav palindroms ");
				irPalindrome = false;
				break;
			}
		}
		if(irPalindrome) {
			System.out.println("Ir palindroms");
		}
		
		//1.variants
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		for(int i = x; i<=y; i ++) {
			// parbaudam vai dalas ar 2,3,5,7
	
			if(i == 2 || i == 3 || i == 5 || i == 7) {  // sie esot pamata dalitaji
				System.out.println(i);
				continue;
			} else if( i % 2 ==0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				continue;  // pariet uz nakamo iteraciju 
			}
			System.out.println(i);
			
		}
		//2.varinats
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for(int i = a; i<=b; i ++) { //2,3,4,5
			
			boolean isDivisible = false;
			for(int j = 2; j < i; j++) {
				if(i % j == 0 && i!=j) {
					isDivisible = true;
				}
				
			}
			if(!isDivisible && i > 1) {   // izprinte tos ciparus kuriem true nav izpildijies nevienureizi
				System.out.print(i + " ");
			}
		}
	}

}
