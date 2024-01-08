
public class Methodoverloading {
	
	public void add(int i, int j) {
		System.out.print("Sum is :" + (i+j));		
	}
	
	public void add(int i, int j, double k) {
		System.out.print("\nSum is :" + (i+j+k));		
	}
	
	public void add(double i, double j) {
		System.out.print("\nSum is :" + (i+j));
	}
	
	public static void main(String args[]) {
		Methodoverloading m = new Methodoverloading();
		m.add(1, 5);
		m.add(2, 2, 2.5);
		m.add(2.25, 2.5);
	}

}