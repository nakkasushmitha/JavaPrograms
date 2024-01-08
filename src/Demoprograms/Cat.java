package Demoprograms;

public class Cat extends Animal {
	public Cat(String name, int age) {

		super(name,age);
    }
	
	public void printInfo() {
		System.out.println("Type: Cat");
		
	}

    public void makeSound() {

		System.out.println("Meow! Meow!");
    }
}
