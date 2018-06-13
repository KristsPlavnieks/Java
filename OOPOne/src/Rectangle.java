
public class Rectangle {

	// fields ipasibas
	double garums;
	double platums;
	

	// Konstruktori
	public Rectangle() {

	}

	public Rectangle(double garums, double platums) {
		this.garums = garums;
		this.platums = platums;
	}

	public Rectangle(double side) {
		garums = side;
		platums = side;
	}

	// Metodes
	public boolean isSquare() {
		return garums == platums; // var ar if var ari bez
	}

	public double area() {
		return garums * platums;
	}

	public double perimeter() {
		return (garums + platums) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [garums=" + garums + ", platums=" + platums + ", isSquare()=" + isSquare() + ", area()="
				+ area() + ", perimeter()=" + perimeter() + "]";
	}

}
