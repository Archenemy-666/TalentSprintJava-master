package interfaces;

import abstraction.Circle;

public class Mainclass {
	public static void main (String [] args ) {
		circle c1 = new circle(12.2);
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		
		c1.details();
		Shapes.details();
	}


}
