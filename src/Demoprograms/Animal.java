package Demoprograms;

public class Animal {
	String name;
	int age;
	
	 public Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {

		 return age;
	    }
	    
	    public void printInfo() {
	    }
	    
	    public void displayAnimalType(Animal animal) {

		 System.out.println("The animal is: "+ animal);
	    }
	}

