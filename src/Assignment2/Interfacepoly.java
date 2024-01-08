// define interface
interface Drawable{
	void draw();		
	}
	
// implements circle class
class Triangle implements Drawable{
	public void draw() {
		System.out.println("Drawing circle");
	}
}

// implements square class
class Square implements Drawable{
	public void draw() {
		System.out.println("Drawing square");
	}
}


public class Interfacepoly {
	public static void main(String args[]) {
		// Create an array of Drawable objects
        Drawable[] drawables = new Drawable[2];
        drawables[0] = new Triangle();
        drawables[1] = new Square();
        
     // Call the draw() method for each object in the array
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
	}

}
