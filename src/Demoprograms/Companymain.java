package Demoprograms;

public class Companymain {
	public static void main(String args[]) {
		Employee e1 = new Manager(20000, 5000);
		Employee e2 = new Developer(15000, 2000);
		
		System.out.println("Total Salary: "+ e1.calculateSalary());
		System.out.println("Total Salary: "+ e2.calculateSalary());
	}
}
