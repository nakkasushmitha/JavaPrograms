     class shape{
    	 //default constructor
		public shape() {
			
		}
		//method to calculate area
		public void calculateArea() {
			
		}
	}

     // extends class circle
	 class Circle extends shape{
		double radius;
		//constructor of circle class
		public Circle(double radius) {
			this.radius = radius;
		}
		//override calculate area method
		public void calculateArea(){
			System.out.println("Area of circle is:" + Math.PI * radius * radius);
		}
	}

	 // extends class rectangle
	 class Rectangle extends shape{
		double length, width;
		// constructor of rectangle class
		public Rectangle(double length, double width) {
			this.length = length;
			this.width = width;
		}
		//override calculate area method
		public void calculateArea() {
			System.out.println("\nArea of rectangle is:" + length*width);
		}
	}
	
public class Inheritancepoly {
	
	public static void main(String args[]) {
		//creating objects for circle and rectangle classes
		Circle circle = new Circle(2);
		Rectangle rect = new Rectangle(1.5, 8);
		//call calculate area method
		circle.calculateArea();
		rect.calculateArea();
	}

}
