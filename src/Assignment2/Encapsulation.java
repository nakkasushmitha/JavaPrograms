package Assignment2;

class Person1{
	private String name;
	private int age;
	private String address;
	
	//constructor with parameters
	public Person1(String name, int age, String address) {
		//setter methods
		setName(name);
		setAge(age);
		setAddress(address);
	}
	
	//default constructor
	public Person1() {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.age = 0;
		this.address = "";
	}
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
		this.age = age;
		}
		else {
			System.out.println("Age must be a positive number");
		}
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}


public class Encapsulation {
	public static void main(String args[]) {
		Person1 person = new Person1();
		
		//set values using setter methods
		person.setName("Pooja");
		person.setAge(25);
		person.setAddress("India");
		
		//get values using getter methods
		String name = person.getName();
		int age = person.getAge();
		String address = person.getAddress();
		
		//print the values
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Address:" + address);
		
		//instance for person class and encapsulation for setter methods
		Person1 person1 = new Person1("Sushmitha", 28, "USA");
		System.out.println("Name:" + person1.getName());
		System.out.println("Age:" + person1.getAge());
		System.out.println("Address:" + person1.getAddress());
		
	}

}
