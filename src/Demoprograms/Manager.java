package Demoprograms;

public class Manager extends Employee{
	private double salary;
	private double incentives;
	
	public Manager(double salary, double incentives) {
		this.salary = salary;
		this.incentives = incentives;
	}
	
public double calculateSalary() {
	return salary + incentives;
		
	}

}
