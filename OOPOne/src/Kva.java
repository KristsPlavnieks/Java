
// Mantosana - child extends - vecaku 
public class Kva extends Rectangle {
	
	/*
	public Square(double side) { // klase jaizdzes konstruktors lai darbotos ! ! ! 
	// izsauc konstruktoru no Rectangle klases
		super(side,side)
		
		//reultats tads pats ka izsaucot super konstruktoru 
		/*garums = side;
	platums = side;
	
	}
	*/
	public void test() {
		// super noradam to ka jaizsauc metode no vecaku klases ( rectangel)
		boolean isSquare = super.isSquare();
		double area = super.area();
		double perimeter = super.perimeter();

		double randomSum = garums + platums;
	}

	@Override
	public String toString() {
		return "Kva [garums=" + garums + ", platums=" + platums + "]";
	}

}