package Demoprograms;

public class Mathmain {
	public static void main(String args[]) {
		double r = 2, l = 5, w = 4;
		Circle circle = new Circle(r);
		Rectangle rect = new Rectangle(l, w);
		System.out.println("The area of circle is: " + circle.calculateArea());
		System.out.println("The area of Rectangle is: " + rect.calculateArea());
	}

}
