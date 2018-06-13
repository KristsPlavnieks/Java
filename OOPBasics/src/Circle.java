
public class Circle {

	// Constant
	static final double PI = 3.14159265;

	// Fields
	double radius; 
	String color;

	/*
	public Circle(String clr, double rad) {
		color = clr;
		radius = rad;
	}
	*/
	
	// ari ar source generate constructors
	public Circle(double radius, String color) {
		super(); // dara neko 
		this.radius = radius;   // ths vajadzigs jo ir parametri vienadi ar lauku, 
		this.color = color;
	}



	public Circle() {
		color = "black";    // ja nenorada tad bus black 
		radius = 0.0 ;
		// color = null
		// radius = 0.0
	}
	
	
	
	// Source Generate toString !! PC pats visu izdara! Var pats rakstit vai nee ! 
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
		
}
