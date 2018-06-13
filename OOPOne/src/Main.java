
public class Main {

	public static void main(String[] args) {

		Rectangle tst = new Rectangle(5, 4);
		System.out.println(tst.isSquare());
		System.out.println(tst.area());
		System.out.println(tst.perimeter());
		System.out.println(tst);

		Rectangle tsst = new Rectangle(3,8);
		System.out.println(tsst.isSquare());
		System.out.println(tsst.area());
		System.out.println(tsst.perimeter());
		System.out.println(tsst);
		
		Rectangle kva = new Rectangle(6);
		System.out.println(kva.isSquare());
		System.out.println(kva.area());
		System.out.println(kva.perimeter());
		System.out.println(kva);
		
	}
		
}
