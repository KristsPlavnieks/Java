
public class Main {

	public static void main(String[] args) {
		
		
		Circle c1= new Circle();  // ar new norada ka taisis jaunu objektu
		c1.color = "red";
		c1.radius = 3.13;
				
		Circle c2= new Circle(14, "green");  // new Circle - tiek izsaukts konstruktors
		
		
		Circle c3= new Circle();
		//c3.color = "black";
		//c3.radius = 14.42;
		
		System.out.println(c1);
		System.out.println(c2.toString());  // nav starpiba ar pirmo vnk garak jaraksta
		String c3ToString = c3.toString();
		System.out.println("C3 has color = " + c3.color + " and radius = " + c3.radius);
		

	}

}
