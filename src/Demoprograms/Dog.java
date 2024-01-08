package Demoprograms;

public class Dog extends Animal{
	   public Dog(String name, int age) {

		   super(name,age);
	    }
	
	public void printInfo() {
		System.out.println("Type: Dog");
		
	}

    public void makeSound() {
		   System.out.println("Woof! Woof!");
		   System.out.println("Hi");
    }
}
